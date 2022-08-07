package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static ru.job4j.condition.Point.distance;

public class PointTest {

    @Test
    public void when20to02then2dot82() {
        double expected = 2.82;
        int x1 = 2;
        int y1 = 0;
        int x2 = 0;
        int y2 = 2;
        double actual = distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void when50to10then4() {
        double expected = 4.0;
        int x1 = 5;
        int y1 = 0;
        int x2 = 1;
        int y2 = 0;
        double actual = distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void when10to50then0() {
        double expected = 4.0;
        int x1 = 1;
        int y1 = 0;
        int x2 = 5;
        int y2 = 0;
        double actual = distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, actual, 0.01);
    }
}
