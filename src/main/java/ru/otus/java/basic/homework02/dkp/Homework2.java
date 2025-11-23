package ru.otus.java.basic.homework02.dkp;

public class Homework2 {
    // 1. Метод, печатающий строку указанное количество раз
    public static void printStringMultipleTimes(int count, String text) {
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }

    // 2. Метод, суммирующий элементы массива больше 5
    public static void sumElementsGreaterThanFive(int[] array) {
        int sum = 0;
        for (int num : array) {
            if (num > 5) {
                sum += num;
            }
        }
        System.out.println("Сумма элементов больше 5: " + sum);
    }

    // 3. Метод, заполняющий массив указанным числом
    public static void fillArrayWithNumber(int number, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = number;
        }
    }

    // 4. Метод, увеличивающий каждый элемент массива на число
    public static void increaseArrayElements(int number, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] += number;
        }
    }

    // 5. Метод, сравнивающий суммы половин массива
    public static void compareHalvesSum(int[] array) {
        int mid = array.length / 2;
        int leftSum = 0;
        int rightSum = 0;

        // Левая половина
        for (int i = 0; i < mid; i++) {
            leftSum += array[i];
        }

        // Правая половина (учитывает нечетный размер)
        for (int i = mid; i < array.length; i++) {
            rightSum += array[i];
        }

        System.out.println("Сумма левой половины: " + leftSum);
        System.out.println("Сумма правой половины: " + rightSum);

        if (leftSum > rightSum) {
            System.out.println("Левая половина массива имеет большую сумму");
        } else if (rightSum > leftSum) {
            System.out.println("Правая половина массива имеет большую сумму");
        } else {
            System.out.println("Суммы половин массива равны");
        }
    }

    // Демонстрация работы всех методов
    public static void main(String[] args) {
        System.out.println("=== Задача 1: Печать строки 3 раза ===");
        printStringMultipleTimes(3, "Hello!");

        System.out.println("\n=== Задача 2: Сумма элементов > 5 ===");
        int[] testArray = {1, 6, 3, 8, 2, 9};
        sumElementsGreaterThanFive(testArray);

        System.out.println("\n=== Задача 3: Заполнение массива числом 5 ===");
        int[] emptyArray = new int[4];
        fillArrayWithNumber(5, emptyArray);
        for (int num : emptyArray) System.out.print(num + " ");

        System.out.println("\n\n=== Задача 4: Увеличение элементов на 3 ===");
        int[] numbers = {1, 2, 3, 4};
        increaseArrayElements(3, numbers);
        for (int num : numbers) System.out.print(num + " ");

        System.out.println("\n\n=== Задача 5: Сравнение половин массива ===");
        int[] balanceTest = {1, 2, 3, 4, 5};
        compareHalvesSum(balanceTest);
    }
}
