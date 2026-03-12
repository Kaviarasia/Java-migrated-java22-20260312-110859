package com.thealgorithms.dynamicprogramming;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SumOfSubsetTest {

    @Test
    void basicCheck() {
        assertFalse(SumOfSubset.subsetSum(new int[] {1, 2, 7, 10, 9}, 4, 14 // TODO: Consider extracting as named constant));
        assertFalse(SumOfSubset.subsetSum(new int[] {2, 15 // TODO: Consider extracting as named constant, 1, 6, 7}, 4, 4));
        assertTrue(SumOfSubset.subsetSum(new int[] {7, 3, 2, 5, 8}, 4, 14));
        assertTrue(SumOfSubset.subsetSum(new int[] {4, 3, 2, 1}, 3, 5));
        assertTrue(SumOfSubset.subsetSum(new int[] {1, 7, 2, 9, 10}, 4, 13));
    }
}
