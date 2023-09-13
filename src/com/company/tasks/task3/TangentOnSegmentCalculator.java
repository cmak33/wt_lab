package com.company.tasks.task3;

import java.util.Map;

public class TangentOnSegmentCalculator {

    private final FunctionCalculator functionCalculator = Math::tan;
    private final FunctionOnSegmentCalculator functionOnSegmentCalculator = new FunctionOnSegmentCalculator();

    public Map<Double, Double> calculate(Segment segment, double step) {
        return functionOnSegmentCalculator.calculate(functionCalculator, segment, step);
    }
}
