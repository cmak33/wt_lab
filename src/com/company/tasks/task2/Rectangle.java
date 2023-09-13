package com.company.tasks.task2;

import java.awt.*;

public record Rectangle(Point upperLeftPoint, Point lowerRightPoint) implements Shape {

    @Override
    public boolean isPointInShape(Point dot) {
        return dot.x >= upperLeftPoint.x && dot.y <= upperLeftPoint.y
                && dot.x <= lowerRightPoint.x && dot.y >= lowerRightPoint.y;
    }
}
