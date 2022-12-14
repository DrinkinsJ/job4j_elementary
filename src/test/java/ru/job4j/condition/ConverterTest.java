package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class ConverterTest {

    @Test
    public void whenConvert140rblThen2dot3333Dollar() {
        float in = 140;
        float expected = 2.3333f;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert140RblThen2Euro() {
        float in = 140;
        float expected = 2.0f;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }
}
