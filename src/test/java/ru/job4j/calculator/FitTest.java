package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

import static ru.job4j.calculator.Fit.manWeight;
import static ru.job4j.calculator.Fit.womanWeight;

public class FitTest {

    @Test
    public void whenHeight197dot5When112dot1249Weight() {
        double height = 197.5;
        double expected = 112.1249;
        double actual = manWeight(height);
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void whenHeight157dot5When54dot6249Weight() {
        double height = 157.5;
        double expected = 54.6249;
        double actual = womanWeight(height);
        Assert.assertEquals(expected, actual, 0.001);
    }
}
