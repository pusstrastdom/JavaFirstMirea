package ru.mirea.task3.RandomMathTask.task4and5;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.print("Введите размер массива (натуральное число больше 0): ");
            while (!scanner.hasNextInt()) {
                System.out.print("Пожалуйста, введите натуральное число: ");
                scanner.next();
            }
            n = scanner.nextInt();
        } while (n <= 0);

        int[] originalArray = new int[n];
        Random random = new Random();

        System.out.print("Исходный массив: ");
        for (int i = 0; i < n; i++) {
            originalArray[i] = random.nextInt(n + 1);
            System.out.print(originalArray[i] + " ");
        }
        System.out.println();

        System.out.print("Массив четных элементов: ");
        for (int i = 0; i < n; i++) {
            if (originalArray[i] % 2 == 0) {
                System.out.print(originalArray[i] + " ");
            }
        }
    }
}