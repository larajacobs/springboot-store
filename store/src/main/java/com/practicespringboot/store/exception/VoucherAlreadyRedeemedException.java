package com.practicespringboot.store.exception;

public class VoucherAlreadyRedeemedException extends RuntimeException {
    public VoucherAlreadyRedeemedException(String code) {
        super("Voucher already redeemed: " + code);
    }
}
