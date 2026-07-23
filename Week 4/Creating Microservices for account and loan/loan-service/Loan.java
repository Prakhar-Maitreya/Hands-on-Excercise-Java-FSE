package com.loan;

public class Loan {
    private int id;
    private String type;
    private double amount;

    public Loan(int id, String type, double amount) {
        this.id = id;
        this.type = type;
        this.amount = amount;
    }

    public int getId() { return id; }
    public String getType() { return type; }
    public double getAmount() { return amount; }
}
