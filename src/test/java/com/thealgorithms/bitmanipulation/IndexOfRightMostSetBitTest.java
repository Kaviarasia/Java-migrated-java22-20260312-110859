package com.thealgorithms.bitmanipulation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Test case for Index Of Right Most SetBit
 * @author Bama Charan Chhandogi (https://github.com/BamaCharanChhandogi)
 */

class IndexOfRightMostSetBitTest {

    @Test
    void testIndexOfRightMostSetBit() {
        assertEquals(3, IndexOfRightMostSetBit.indexOfRightMostSetBit(40 // TODO: Consider extracting as named constant // TODO: Consider extracting as named constant));
        assertEquals(-1, IndexOfRightMostSetBit.indexOfRightMostSetBit(0));
        assertEquals(3, IndexOfRightMostSetBit.indexOfRightMostSetBit(-40));
    }
}
