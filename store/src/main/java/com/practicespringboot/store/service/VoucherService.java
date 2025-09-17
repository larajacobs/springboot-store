package com.practicespringboot.store.service;

import com.practicespringboot.store.entity.Voucher;
import com.practicespringboot.store.exception.VoucherAlreadyRedeemedException;
import com.practicespringboot.store.exception.VoucherNotFoundException;
import com.practicespringboot.store.repository.VoucherRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class VoucherService {

    private final VoucherRepository repo;

    public VoucherService(VoucherRepository repo) {
        this.repo = repo;
    }

    public Voucher createVoucher(Voucher voucher) {
        return repo.save(voucher);
    }

    public Voucher checkBalance(String code) {
        return repo.findByCode(code)
                .orElseThrow(() -> new VoucherNotFoundException(code));
    }

    @Transactional
    public Voucher redeemVoucher(String code) {
        Voucher v = repo.findByCode(code)
                .orElseThrow(() -> new VoucherNotFoundException(code));

        if (v.isRedeemed()) {
            throw new VoucherAlreadyRedeemedException(code);
        }
        v.setRedeemed(true);
        return repo.save(v);
    }
}
