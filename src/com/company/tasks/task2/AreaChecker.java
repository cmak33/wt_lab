package com.company.tasks.task2;

import java.awt.*;
import java.util.List;

public class AreaChecker {

    public boolean isDotInArea(Point dot, List<Shape> shapes) {
        return shapes.stream()
                .anyMatch(shape -> shape.isPointInShape(dot));
    }
}
