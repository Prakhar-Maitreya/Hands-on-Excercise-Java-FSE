package com.example;

public class BankAccount {
    private double bal;

    public BankAccount(double bal) {
        this.bal = bal;
    }

    public void deposit(double a) {
        this.bal += a;
    }

    public void withdraw(double a) {
        if (a <= this.bal) {
            this.bal -= a;
        }
    }

    public double getBalance() {
        return this.bal;
    }
}
