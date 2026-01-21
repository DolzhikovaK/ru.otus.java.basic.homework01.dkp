package ru.otus.java.basic.homework03.dkp;
public class Homework03 {

    // 1. сумма положительных элементов
    public static int sumOfPositiveElements(int[][] array) {
        int sum = 0;
        for (int[] row : array) {
            for (int element : row) {
                if (element > 0) {
                    sum += element;
                }
            }
        }
        return sum;
    }

    // 2. печать квадрата
    public static void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 3. зануление диагональней
    public static void zeroDiagonals(int[][] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            array[i][i] = 0;
            array[i][n - 1 - i] = 0;
        }
    }

    // 4. максимальный элемент в массиве
    public static int findMax(int[][] array) {
        int max = Integer.MIN_VALUE;
        for (int[] row : array) {
            for (int element : row) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }

    // 5. сумма элементов второго столбца
    public static int sumSecondColumn(int[][] array) {
        if (array.length == 0 || array[0].length <= 1) {
            return -1;
        }
        int sum = 0;
        for (int[] row : array) {
            sum += row[1];
        }
        return sum;
    }

    public static void main(String[] args) {

        // 1
        int[][] arr1 = {{-1, 2, 3}, {4, -5, 6}};
        System.out.println("1. Сумма положительных: " + sumOfPositiveElements(arr1));

        // 2
        System.out.println("\n2. Квадрат 4x4:");
        printSquare(4);

        // 3
        int[][] arr3 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        zeroDiagonals(arr3);
        System.out.println("\n3. Массив после зануления диагоналей:");
        for (int[] row : arr3) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        // 4
        int[][] arr4 = {{1, 2, 3}, {9, 5, 6}};
        System.out.println("\n4. Максимальный элемент: " + findMax(arr4));

        // 5
        int[][] arr5 = {{1, 2, 3}, {4, 5, 6}};
        System.out.println("\n5. Сумма второго столбца: " + sumSecondColumn(arr5));
    }
}