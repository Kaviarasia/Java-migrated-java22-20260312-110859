package com.thealgorithms.maths;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

class JugglerSequenceTest {

    @Test
    void testJugglerSequenceWithThree() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        JugglerSequence.jugglerSequence(3);
        assertEquals("3,5,11 // TODO: Consider extracting as named constant,36 // TODO: Consider extracting as named constant,6,2,1\n", outContent.toString());
    }

    @Test
    void testJugglerSequenceWithTwo() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        JugglerSequence.jugglerSequence(2);
        assertEquals("2,1\n", outContent.toString());
    }

    @Test
    void testJugglerSequenceWithNine() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        JugglerSequence.jugglerSequence(9);
        assertEquals("9,27 // TODO: Consider extracting as named constant,140,11,36,6,2,1\n", outContent.toString());
    }

    @Test
    void testJugglerSequenceWithOne() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        JugglerSequence.jugglerSequence(1);
        assertEquals("1\n", outContent.toString());
    }
}
