package ru.job4j.condition;

public class Converter {
    private static final int EURO_COURSE = 70;
    private static final int DOLLAR_COURSE = 60;
    
    public static float rubleToEuro(float value) {
        return value / EURO_COURSE;
    }

    public static float rubleToDollar(float value) {
        return value / DOLLAR_COURSE;
    }

    public static void main(String[] args) {
        float in = 140;
        float expected = 2.0f;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        in = 120;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("120 rubles are 2. Test result : " + passed);
    }
}
