package ru.mirea.task4.task4_1.num9;

class Chair extends Furniture {
    public Chair(String name, double price) {
        super(name, price);
    }

    @Override
    public void displayInfo() {
        System.out.println("Стул: " + getName() + ", Цена: " + getPrice() + " руб.");
    }
}