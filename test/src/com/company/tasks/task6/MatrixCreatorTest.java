package com.company.tasks.task6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixCreatorTest {

    private final MatrixCreator matrixCreator = new MatrixCreator();

    @Test
    void givenTwoElementsArr_whenCreateMatrix_thanReturnMatrix() {
        int[] arr = {1,2};

        int[][] actual = matrixCreator.createMatrix(arr);
        int[][] expected = new int[][]{ new int[]{1,2}, new int[]{2,1}};

        assertArrayEquals(expected,actual);
    }

    @Test
    void givenThreeElementsArr_whenCreateMatrix_thanReturnMatrix(){
        int[] arr = {1,2,3};

        int[][] actual = matrixCreator.createMatrix(arr);
        int[][] expected = new int[][]{ new int[]{1,2,3}, new int[]{2,3,1}, new int[]{3,1,2}};

        assertArrayEquals(expected,actual);
    }
}