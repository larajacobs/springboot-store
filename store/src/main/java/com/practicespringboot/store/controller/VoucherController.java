package com.practicespringboot.store.controller;

import com.practicespringboot.store.entity.Voucher;
import com.practicespringboot.store.service.VoucherService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/vouchers")
public class VoucherController {

    private final VoucherService service;

    public VoucherController(VoucherService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Voucher> createVoucher(@Valid @RequestBody Voucher voucher) {
        return ResponseEntity.ok(service.createVoucher(voucher));
    }

    @GetMapping("/{code}")
    public ResponseEntity<Voucher> checkBalance(@PathVariable String code) {
        return ResponseEntity.ok(service.checkBalance(code));
    }

    @PostMapping("/{code}/redeem")
    public ResponseEntity<Voucher> redeemVoucher(@PathVariable String code) {
        return ResponseEntity.ok(service.redeemVoucher(code));
    }
}
