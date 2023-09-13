package com.company.tasks.task5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IncreasingSubsequenceCreatorTest {

    private final IncreasingSubsequenceCreator increasingSubsequenceCreator = new IncreasingSubsequenceCreator();

    @Test
    void givenIncreasingSequence_whenFindMinCount_thenReturnZero(){
        int[] sequence = {1,2,3,4,5};

        int expected = 0;
        int actual = increasingSubsequenceCreator.findMinCountOfElementsToRemoveToCreateIncreasingSequence(sequence);

        assertEquals(expected, actual);
    }

    @Test
    void givenSequence_whenFindMinCount_thenReturnFour(){
        int[] sequence = {5, 2, 8, 6, 3, 6, 9, 7};

        int expected = 4;
        int actual = increasingSubsequenceCreator.findMinCountOfElementsToRemoveToCreateIncreasingSequence(sequence);

        assertEquals(expected, actual);
    }

    @Test
    void givenSequence_whenFindMinCount_thenReturnTwo(){
        int[] sequence = {3,4,1,2,5};

        int expected = 2;
        int actual = increasingSubsequenceCreator.findMinCountOfElementsToRemoveToCreateIncreasingSequence(sequence);

        assertEquals(expected, actual);
    }

    @Test
    void givenDecreasingSequence_whenFindMinCount_thenReturnArrayLengthMinusOne(){
        int[] sequence = {5,4,3,2,1};

        int expected = sequence.length - 1;
        int actual = increasingSubsequenceCreator.findMinCountOfElementsToRemoveToCreateIncreasingSequence(sequence);

        assertEquals(expected, actual);
    }
}