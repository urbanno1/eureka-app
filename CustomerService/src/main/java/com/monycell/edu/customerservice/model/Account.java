package com.monycell.edu.customerservice.model;

public class Account {
    private String accountId;
    private double amount;

    public Account(String accountId, double amount) {
        this.accountId = accountId;
        this.amount = amount;
    }

    public String getAccountId() {
        return accountId;
    }

    public double getAmount() {
        return amount;
    }
}
