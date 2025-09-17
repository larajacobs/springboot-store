package com.practicespringboot.store.exception;

public class VoucherNotFoundException extends RuntimeException {
    public VoucherNotFoundException(String code) {
        super("Voucher not found with code: " + code);
    }
}