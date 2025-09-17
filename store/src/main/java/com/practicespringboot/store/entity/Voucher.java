package com.practicespringboot.store.entity;

import jakarta.persistence.*;

@Entity
public class Voucher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String code;

    private double amount;

    private boolean redeemed = false; 

    // --- Constructors ---
    public Voucher() {}
    
    public Voucher(String code, double amount) {
        this.code = code;
        this.amount = amount;
        this.redeemed = false;
    }

    // --- Getters and Setters ---
    public Long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean isRedeemed() {
        return redeemed;
    }

    public void setRedeemed(boolean redeemed) {
        this.redeemed = redeemed;
    }
}
