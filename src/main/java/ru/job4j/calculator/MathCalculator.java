package ru.job4j.calculator;


import static ru.job4j.math.MathFunction.diff;
import static ru.job4j.math.MathFunction.div;
import static ru.job4j.math.MathFunction.multiply;
import static ru.job4j.math.MathFunction.sum;

public class MathCalculator {
    
    public static final String RESULT_TEXT = "Результат расчета равен: ";

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double diffAndDiv(double first, double second) {
        return diff(first, second) + div(first, second);
    }

    public static double sumAllFourOperation(double first, double second) {
        return sum(first, second) + multiply(first, second) + diff(first, second) + div(first, second);
    }

    public static void main(String[] args) {
        System.out.println(RESULT_TEXT + sumAndMultiply(10, 20));
        System.out.println(RESULT_TEXT + diffAndDiv(10, 20));
        System.out.println(RESULT_TEXT + sumAllFourOperation(10, 20));
    }
}