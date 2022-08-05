package ru.job4j.calculator;

public class Fit {

    private static final double HEIGHT_CONST = 1.15;

    public static double manWeight(double height) {
        return (height - 100) * HEIGHT_CONST;
    }

    public static double womanWeight(double height) {
        return  (height - 110) * HEIGHT_CONST;
    }

    public static void main(String[] args) {
        short height = 175;
        double man = manWeight(height);
        System.out.println("Man 175 is " + man);
        height = 185;
        double woman = womanWeight(height);
        System.out.println("Woman 185 is " + woman);
    }
}
