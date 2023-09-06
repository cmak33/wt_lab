package com.company.task1;

public class EquationCalculator {

    public double calculate(double x, double y) {
        double numerator = 1f + Math.pow(Math.sin(x + y), 2);
        double denominator = 2 + Math.abs(x - (2 * x) / (1 + x * x * y * y));
        return numerator / denominator + x;
    }
}
