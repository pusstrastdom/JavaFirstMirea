package ru.mirea.task2.task2_10;


import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String input = scanner.nextLine();

        String[] words = input.split(" ");

        int wordCount = words.length;

        System.out.println("Количество слов в строке: " + wordCount);
    }
}