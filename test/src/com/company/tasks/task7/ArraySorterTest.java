package com.company.tasks.task7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraySorterTest {

    private final ArraySorter arraySorter = new ArraySorter();

    @Test
    void givenEmptyArray_whenSort_thanDoNothing() {
        int[] arr = {};
        int[] expected = {};

        arraySorter.sort(arr);

        assertArrayEquals(expected, arr);
    }

    @Test
    void givenSortedArray_whenSort_thanDoNothing() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};

        arraySorter.sort(arr);

        assertArrayEquals(expected, arr);
    }

    @Test
    void givenUnsortedArray_whenSort_thanSortArray() {
        int[] arr = {5, 3, 1, 4, 2};
        int[] expected = {1, 2, 3, 4, 5};

        arraySorter.sort(arr);

        assertArrayEquals(expected, arr);
    }
}