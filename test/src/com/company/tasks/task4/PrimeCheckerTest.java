package com.company.tasks.task4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeCheckerTest {

    private final PrimeChecker primeChecker = new PrimeChecker();

    @Test
    void givenPositiveNumbersArr_whenFindPrimeNumberIndexes_thenReturnIndexes() {
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] expected = {0, 1, 3, 5};
        int[] actual = primeChecker.findPrimeNumberIndexes(arr);

        assertArrayEquals(expected, actual);
    }

    @Test
    void givenNegativeNumbersArr_whenFindPrimeNumberIndexes_thenReturnEmptyArr() {
        int[] arr = {-2, -3, -4, -5, -6, -7, -8, -9, -10};

        int[] expected = {};
        int[] actual = primeChecker.findPrimeNumberIndexes(arr);

        assertArrayEquals(expected, actual);
    }

    @Test
    void givenNegativeAndPositiveNumbersArr_whenFindPrimeNumberIndexes_thenReturnIndexes() {
        int[] arr = {0, 1, 2, -3, 4, -5, 6, 7, -8};

        int[] expected = {2, 7};
        int[] actual = primeChecker.findPrimeNumberIndexes(arr);

        assertArrayEquals(expected, actual);
    }
}