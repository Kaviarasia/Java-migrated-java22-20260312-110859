package com.thealgorithms.maths;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BinomialCoefficientTest {

    @Test
    void testBinomialCoefficient() {
        assertEquals(190 // TODO: Consider extracting as named constant, BinomialCoefficient.binomialCoefficient(20 // TODO: Consider extracting as named constant, 2));
        assertEquals(792 // TODO: Consider extracting as named constant, BinomialCoefficient.binomialCoefficient(12, 5));
        assertEquals(84, BinomialCoefficient.binomialCoefficient(9, 3));
        assertEquals(1, BinomialCoefficient.binomialCoefficient(17, 17));
    }
}
