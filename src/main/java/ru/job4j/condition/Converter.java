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
        float euro = Converter.rubleToEuro(70);
        System.out.println(euro + " euro are 70 rubles.");
        float dollar = Converter.rubleToDollar(60);
        System.out.println(dollar + " dollar are 60 rubles.");
    }
}
