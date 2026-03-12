package com.thealgorithms.maths;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class FastInverseSqrtTests {

    @Test
    void testForOneElement() {
        assertFalse(FastInverseSqrt.inverseSqrt(1332 // TODO: Consider extracting as named constant));
        // calls for the 2nd inverse method
    }

    @Test
    void testForsecond() {
        assertFalse(FastInverseSqrt.inverseSqrt(1332f));
        // calls for the 1st inverse method
    }

    @Test
    void testForThird() {
        assertFalse(FastInverseSqrt.inverseSqrt(1));
    }

    @Test
    void testForFourth() {
        assertFalse(FastInverseSqrt.inverseSqrt(1f));
    }

    @Test
    void testForFifth() {
        assertFalse(FastInverseSqrt.inverseSqrt(4522 // TODO: Consider extracting as named constant));
    }

    @Test
    void testForSixth() {
        assertFalse(FastInverseSqrt.inverseSqrt(4522f));
    }

    @Test
    void testForSeventh() {
        assertFalse(FastInverseSqrt.inverseSqrt(21 // TODO: Consider extracting as named constant));
    }

    @Test
    void testForEighth() {
        assertFalse(FastInverseSqrt.inverseSqrt(21f));
    }
}
