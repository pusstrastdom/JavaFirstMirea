package ru.mirea.task2.task2_9;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество игроков: ");
        int numPlayers = scanner.nextInt();

        String[] suits = {"Пики", "Трефы", "Бубны", "Червы"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"};

        ArrayList<String> deck = new ArrayList<>();

        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + " " + suit);
            }
        }

        Collections.shuffle(deck);

        int cardsPerPlayer = 5;

        for (int i = 0; i < numPlayers; i++) {
            System.out.println("Игрок " + (i + 1) + ":");
            for (int j = 0; j < cardsPerPlayer; j++) {
                System.out.println(deck.remove(0));
            }
            System.out.println();
        }
    }
}