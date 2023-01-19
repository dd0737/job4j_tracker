package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    private static int minus(int y) {
        return y - x;
    }

    private int divide(int y) {
        return y / x;
    }

    private int sumAllOperation(int y) {
        return sum(y) + multiply(y) + minus(y) + divide(y);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int y = 10;
        System.out.println(minus(y));
        System.out.println(calculator.divide(y));
        System.out.println(calculator.sumAllOperation(y));
    }
}
