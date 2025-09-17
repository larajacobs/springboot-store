package com.practicespringboot.store.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(VoucherNotFoundException.class)
    public ResponseEntity<String> handleNotFound(VoucherNotFoundException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
    }

    @ExceptionHandler(VoucherAlreadyRedeemedException.class)
    public ResponseEntity<String> handleAlreadyRedeemed(VoucherAlreadyRedeemedException ex) {
        return ResponseEntity.badRequest().body(ex.getMessage());
    }
}
