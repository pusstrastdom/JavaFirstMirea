package ru.mirea.task3.Formatting.task12;

import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите стоимость товара: ");
        double price = scanner.nextDouble();

        System.out.print("Выберите валюту (USD, EUR, GBP): ");
        String currency = scanner.next();

        double exchangeRate = 0.0;

        switch (currency) {
            case "USD":
                exchangeRate = 1.0;
                break;
            case "EUR":
                exchangeRate = 0.85;
                break;
            case "GBP":
                exchangeRate = 0.74;
                break;
            default:
                System.out.println("Неподдерживаемая валюта.");
                return;
        }

        CurrencyConverter converter = new CurrencyConverter(exchangeRate);
        double convertedPrice = converter.convertToUSD(price);

        System.out.println("Стоимость в USD: " + convertedPrice);
    }
}