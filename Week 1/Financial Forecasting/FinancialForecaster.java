package com.example;

public class FinancialForecaster {
    public static double predictValue(double val, double rate, int years) {
        if (years == 0) {
            return val;
        }
        return predictValue(val * (1 + rate), rate, years - 1);
    }
}
