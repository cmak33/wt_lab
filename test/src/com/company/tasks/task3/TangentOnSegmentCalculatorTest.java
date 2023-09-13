package com.company.tasks.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TangentOnSegmentCalculatorTest {

    private static final double EPSILON = 1e-5;
    private final TangentOnSegmentCalculator calculator = new TangentOnSegmentCalculator();


    @Test
    void calculate_ShouldReturnTangentValuesOnSegment() {
        Segment segment = new Segment(0.0, 1.0);
        double step = 0.2;

        Map<Double, Double> result = calculator.calculate(segment, step);

        double expectedKey = segment.start();
        for (double key : result.keySet().stream().sorted().toList()) {
            assertEquals(expectedKey, key,EPSILON);
            double expectedValue = Math.tan(key);
            assertEquals(expectedValue, result.get(key));
            expectedKey += step;
        }

    }

}
