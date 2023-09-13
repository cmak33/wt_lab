package com.company.tasks.task3;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FunctionOnSegmentCalculator {

    public Map<Double, Double> calculate(FunctionCalculator func, Segment segment, double step) {
        Map<Double, Double> result = new LinkedHashMap<>();
        int numSteps = (int) ((segment.end() - segment.start()) / step);

        for (int i = 0; i < numSteps; i++) {
            double x = segment.start()+i*step;
            double value = Math.tan(x);
            result.put(x,value);
        }
        return result;
    }
}
