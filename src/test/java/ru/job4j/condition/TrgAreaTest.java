package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static ru.job4j.condition.SqArea.square;

public class TrgAreaTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2.0;
        double actual = square(p, k);
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void whenP16K22Square2dot66() {
        double expected = 2.66;
        int p = 16;
        double k = 22.0;
        double actual = square(p, k);
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void whenP2K6Square0dot12() {
        double expected = 0.12;
        int p = 2;
        double k = 6.0;
        double actual = square(p, k);
        Assert.assertEquals(expected, actual, 0.01);
    }
}
