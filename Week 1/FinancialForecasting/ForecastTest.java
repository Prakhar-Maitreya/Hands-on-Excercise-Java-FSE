package com.example;

public class ForecastTest {
    public static void main(String[] args) {
        double v = 1000.0;
        double r = 0.05;
        int t = 5;
        double res = FinancialForecaster.calculateFutureValue(v, r, t);
        System.out.println("Result: " + res);
    }
}
