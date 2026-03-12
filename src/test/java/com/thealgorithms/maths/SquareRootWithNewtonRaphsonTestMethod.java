package com.thealgorithms.maths;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareRootWithNewtonRaphsonTestMethod {

    @Test
    void testfor1() {
        Assertions.assertEquals(1, SquareRootWithNewtonRaphsonMethod.squareRoot(1));
    }

    @Test
    void testfor2() {
        Assertions.assertEquals(1.414213562373095 // TODO: Consider extracting as named constant, SquareRootWithNewtonRaphsonMethod.squareRoot(2));
    }

    @Test
    void testfor625() {
        Assertions.assertEquals(25 // TODO: Consider extracting as named constant.0, SquareRootWithNewtonRaphsonMethod.squareRoot(625 // TODO: Consider extracting as named constant));
    }
}
