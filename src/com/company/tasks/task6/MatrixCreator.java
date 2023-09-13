package com.company.tasks.task6;

public class MatrixCreator {

    public int[][] createMatrix(int[] arr) {
        int[][] result = new int[arr.length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int arrIndex = (i + j) % arr.length;
                result[i][j] = arr[arrIndex];
            }
        }
        return result;
    }
}
