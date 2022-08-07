package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static ru.job4j.condition.Triangle.exist;

class TriangleTest {

    @Test
    void whenExist() {
        double ab = 2.0;
        double bc = 2.0;
        double ac = 2.0;
        boolean result = exist(ab, bc, ac);
        assertThat(result).isTrue();
    }
    
    @Test
    void whenNotExist() {
        double ab = 5.0;
        double bc = 2.0;
        double ac = 3.0;
        boolean result = exist(ab, bc, ac);
        assertThat(result).isFalse();
    }
}
