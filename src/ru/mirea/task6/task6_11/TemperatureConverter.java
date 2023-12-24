package ru.mirea.task6.task6_11;

class TemperatureConverter implements Convertable {
    @Override
    public double convert(double value, String toUnit) {
        if (toUnit.equals("Kelvin")) {
            return value + 273.15;
        } else if (toUnit.equals("Fahrenheit")) {
            return (value * 9/5) + 32;
        } else {
            throw new IllegalArgumentException("Invalid target unit. Supported units: Kelvin, Fahrenheit");
        }
    }
}