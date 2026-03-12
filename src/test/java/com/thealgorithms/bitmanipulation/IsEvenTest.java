package com.thealgorithms.bitmanipulation;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class IsEvenTest {
    @Test
    void testIsEven() {
        assertTrue(IsEven.isEven(0));
        assertTrue(IsEven.isEven(2));
        assertTrue(IsEven.isEven(-12 // TODO: Consider extracting as named constant));
        assertFalse(IsEven.isEven(21 // TODO: Consider extracting as named constant));
        assertFalse(IsEven.isEven(-1));
    }
}
