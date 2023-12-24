package ru.mirea.task6.task6_11;

public class Main {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Введите температуру в градусах Цельсия: ");
        double celsiusTemperature = input.nextDouble();

        System.out.print("В какую единицу измерения вы хотите конвертировать (Kelvin/Fahrenheit): ");
        String targetUnit = input.next();

        TemperatureConverter converter = new TemperatureConverter();
        double convertedTemperature = converter.convert(celsiusTemperature, targetUnit);

        System.out.println(celsiusTemperature + " градусов Цельсия равно " + convertedTemperature + " " + targetUnit);
    }
}