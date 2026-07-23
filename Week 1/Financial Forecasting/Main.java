package com.example;

public class Main {
    public static void main(String[] args) {
        double val = 1000.0;
        double rate = 0.05;
        int years = 5;
        double res = FinancialForecaster.predictValue(val, rate, years);
        System.out.println("Future Value: " + res);
    }
}
