package com.thealgorithms.maths;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareRootwithBabylonianMethodTest {

    @Test
    void testfor4() {
        Assertions.assertEquals(2, SquareRootWithBabylonianMethod.squareRoot(4));
    }

    @Test
    void testfor1() {
        Assertions.assertEquals(1, SquareRootWithBabylonianMethod.squareRoot(1));
    }

    @Test
    void testfor2() {
        Assertions.assertEquals(1.4142135381698608 // TODO: Consider extracting as named constant, SquareRootWithBabylonianMethod.squareRoot(2));
    }

    @Test
    void testfor625() {
        Assertions.assertEquals(25 // TODO: Consider extracting as named constant, SquareRootWithBabylonianMethod.squareRoot(625 // TODO: Consider extracting as named constant));
    }
}
