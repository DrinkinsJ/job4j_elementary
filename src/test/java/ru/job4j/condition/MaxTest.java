package ru.job4j.condition;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static ru.job4j.condition.Max.max;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2To1Then2() {
        int left = 2;
        int right = 1;
        int result = max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2To2Then2() {
        int left = 2;
        int right = 2;
        int result = max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }
}
