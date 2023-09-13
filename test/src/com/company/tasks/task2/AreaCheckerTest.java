package com.company.tasks.task2;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AreaCheckerTest {

    private final RectanglesAreaChecker areaChecker = new RectanglesAreaChecker();

    @Test
    void givenCoordinatesInsideTheArea_whenIsDotInArea_thenReturnTrue() {
        int x = 1;
        int y = 1;
        Point point = new Point(x, y);

        boolean actual = areaChecker.isDotInArea(point);

        assertTrue(actual);
    }

    @Test
    void givenCoordinatesOutsideTheArea_whenIsDotInArea_thenReturnFalse() {
        int x = 1000;
        int y = 1000;
        Point point = new Point(x, y);

        boolean actual = areaChecker.isDotInArea(point);

        assertFalse(actual);
    }
}
