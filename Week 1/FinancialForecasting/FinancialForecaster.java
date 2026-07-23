package com.example;

public class FinancialForecaster {
    public static double calculateFutureValue(double pv, double r, int n) {
        if (n == 0) {
            return pv;
        }
        return calculateFutureValue(pv * (1 + r), r, n - 1);
    }
}
