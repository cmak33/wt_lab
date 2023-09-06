package com.company.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EquationCalculatorTest {

    private static final double EPSILON = 1e-6;
    private final EquationCalculator calculator = new EquationCalculator();

    @Test
    void givenZeroInputValues_whenCalculate_thenReturnResult() {
        double x = 0;
        double y = 0;
        double expected = 0.5;

        double actual = calculator.calculate(x, y);

        assertEquals(expected, actual, EPSILON);
    }

    @Test
    void givenPositiveInputValues_whenCalculate_thenReturnResult() {
        double x = 1.0;
        double y = 2.0;
        double expected = 1.3922749448749296;

        double actual = calculator.calculate(x, y);

        assertEquals(expected, actual, EPSILON);
    }

    @Test
    void givenNegativeInputValues_whenCalculate_thenReturnResult() {
        double x = -1;
        double y = -1;
        double expected = -0.08658909478409704;

        double actual = calculator.calculate(x, y);

        assertEquals(expected, actual, EPSILON);
    }

}
