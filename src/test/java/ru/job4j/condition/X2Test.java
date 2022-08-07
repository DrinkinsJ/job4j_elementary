package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static ru.job4j.condition.X2.calc;

public class X2Test {

    @Test
    public void whenA1B1C1X1Then3() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = 3;
        int actual = calc(a, b, c, x);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void whenA0B1C1X1Then3() {
        int a = 0;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = 3;
        int actual = calc(a, b, c, x);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void whenA1B1C0X1Then2() {
        int a = 1;
        int b = 1;
        int c = 0;
        int x = 1;
        int expected = 2;
        int actual = calc(a, b, c, x);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void whenA1B1C1X0Then3() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;
        int expected = 3;
        int actual = calc(a, b, c, x);
        Assert.assertEquals(expected, actual);
    }
}
