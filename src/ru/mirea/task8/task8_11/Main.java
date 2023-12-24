package ru.mirea.task8.task8_11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int countOnes = countOnesInSequence();
        System.out.println(countOnes);
    }

    public static int countOnesInSequence() {
        Scanner scanner = new Scanner(System.in);
        int number;
        int countOnes = 0;
        int zerosCount = 0;

        while (true) {
            number = scanner.nextInt();
            if (number == 0) {
                zerosCount++;
                if (zerosCount == 2) {
                    break;
                }
            } else if (number == 1) {
                countOnes++;
            }
        }

        return countOnes;
    }
}