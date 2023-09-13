package com.company.tasks.task8;

import java.util.ArrayList;
import java.util.List;

public class NonDecreasingArraysCombiner {

    public List<Integer> findInsertionPositions(int[] a, int[] b) {
        List<Integer> positions = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                i++;
            } else {
                positions.add(i + j);
                j++;
            }
        }
        if (j < b.length) {
            for (; j < b.length; j++) {
                positions.add(i + j);
            }
        }

        return positions;
    }
}
