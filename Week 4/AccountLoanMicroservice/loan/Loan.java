package com.cognizant.loan.model;

public class Loan {
    private int id;
    private String number;
    private double amount;

    public Loan() {}

    public Loan(int id, String number, double amount) {
        this.id = id;
        this.number = number;
        this.amount = amount;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNumber() { return number; }
    public void setNumber(String number) { this.number = number; }
    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }
}
