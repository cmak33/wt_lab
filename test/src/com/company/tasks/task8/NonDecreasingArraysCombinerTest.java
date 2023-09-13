package com.company.tasks.task8;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NonDecreasingArraysCombinerTest {

    private NonDecreasingArraysCombiner combiner = new NonDecreasingArraysCombiner();

    @Test
    void givenTwoIncreasingSequences_whenFindInsertionPositions_thanReturnPositions(){
        int[] a = {1, 2, 4, 7, 9};
        int[] b = {3, 3, 5, 5, 8};

        List<Integer> expected = Arrays.asList(2, 3, 5, 6, 8);
        List<Integer> actual = combiner.findInsertionPositions(a,b);

        assertEquals(expected,actual);
    }

}