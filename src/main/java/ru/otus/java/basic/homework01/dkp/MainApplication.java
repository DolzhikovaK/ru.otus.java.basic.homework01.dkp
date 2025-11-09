package ru.otus.java.basic.homework01.dkp;

public class MainApplication {
    public static void main(String[] args) {
        // Вызов всех методов по порядку
        greetings();
        checkSign(1, 1, 1);
        selectColor();
        compareNumbers();
        addOrSubtractAndPrint(17, 7, true);
    }
    // 1 задание
    public static void greetings() {
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("from");
        System.out.println("Java");
    }
    // 2 задание
    public static void checkSign(int a, int b, int c) {
        int sum = a + b + c;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    // 3 задание
    public static void selectColor() {
        int data = 25; // Произвольное начальное значение
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data <= 20) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
    // 4 задание
    public static void compareNumbers() {
        int a = 33;
        int b = 11;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
    // 5 задание
    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        int result;
        if (increment) {
            result = initValue + delta;
            System.out.println("Результат сложения: " + result);
        } else {
            result = initValue - delta;
            System.out.println("Результат вычитания: " + result);
        }
    }
}
