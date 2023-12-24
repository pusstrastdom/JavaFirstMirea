package ru.mirea.task8.task8_13;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> sequence = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int number;
        while (true) {
            number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            sequence.add(number);
        }

        for (int i = 0; i < sequence.size(); i += 2) {
            System.out.println(sequence.get(i));
        }
    }
}