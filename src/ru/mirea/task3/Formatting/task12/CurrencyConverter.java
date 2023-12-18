package ru.mirea.task3.Formatting.task12;

public class CurrencyConverter {
    private double exchangeRate;

    public CurrencyConverter(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public double convertToUSD(double amount) {
        return amount / exchangeRate;
    }

    public double convertFromUSD(double amount) {
        return amount * exchangeRate;
    }
}
