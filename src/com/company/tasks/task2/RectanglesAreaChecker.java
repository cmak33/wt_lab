package com.company.tasks.task2;

import java.awt.*;
import java.util.List;

public class RectanglesAreaChecker {

    private final AreaChecker areaChecker = new AreaChecker();
    private final Rectangle FIRST_RECTANGLE = new Rectangle(new Point(-4, 5), new Point(4, 0));
    private final Rectangle SECOND_RECTANGLE = new Rectangle(new Point(-6, 0), new Point(6, -3));
    private final java.util.List<Shape> shapes = List.of(FIRST_RECTANGLE, SECOND_RECTANGLE);

    public boolean isDotInArea(Point dot){
        return areaChecker.isDotInArea(dot,shapes);
    }
}
