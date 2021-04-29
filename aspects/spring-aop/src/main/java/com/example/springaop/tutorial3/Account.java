package com.example.springaop.tutorial3;

import org.springframework.stereotype.Component;

@Component
public class Account {

    private String accountNumber;
    private double balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" + "accountNumber='" + accountNumber + '\'' + ", balance=" + balance + '}';
    }

}

