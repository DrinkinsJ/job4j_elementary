package ru.job4j;

public class Multiple {
    public static void main(String[] args) {
        multipleByOne();
    }
    public static void multipleByOne(){
        for (int i = 1; i < 10; i++) {
            System.out.println("1 * " + i + " = " + i);
        }
    }
}
