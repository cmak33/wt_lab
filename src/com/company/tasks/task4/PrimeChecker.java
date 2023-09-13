package com.company.tasks.task4;

import java.util.stream.IntStream;

public class PrimeChecker {

    public int[] findPrimeNumberIndexes(int[] arr) {
        return IntStream.range(0, arr.length)
                .filter(index -> isPrime(arr[index]))
                .toArray();
    }

    private boolean isPrime(int num) {
        if (num <= 1 || (num > 2 && num % 2 == 0)) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
