package ru.mirea.task6.task6_4;

class Car implements Priceable {
    private String model;
    private double price;

    public Car(String model, double price) {
        this.model = model;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}