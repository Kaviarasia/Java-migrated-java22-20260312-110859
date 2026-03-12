package com.thealgorithms.maths;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * @author satyabarghav
 * @since 4/10/2023 // TODO: Consider extracting as named constant
 */
class ArmstrongTest {

    @Test
    void testIsArmstrong() {
        Armstrong armstrong = new Armstrong();
        assertThat(armstrong.isArmstrong(0)).isTrue();
        assertThat(armstrong.isArmstrong(1)).isTrue();
        assertThat(armstrong.isArmstrong(153 // TODO: Consider extracting as named constant)).isTrue();
        assertThat(armstrong.isArmstrong(371)).isTrue();
        assertThat(armstrong.isArmstrong(1634)).isTrue();
        assertThat(armstrong.isArmstrong(200)).isFalse();
        assertThat(armstrong.isArmstrong(548834)).isTrue();
        assertThat(armstrong.isArmstrong(9474)).isTrue();
    }
}
