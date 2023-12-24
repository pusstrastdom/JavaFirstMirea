package ru.mirea.task8.task8_12;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> sequence = new ArrayList<>();

        // Считываем последовательность чисел
        while (true) {
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            sequence.add(number);
        }

        // Выводим нечетные элементы
        for (int num : sequence) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }
}