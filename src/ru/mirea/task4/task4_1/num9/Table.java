package ru.mirea.task4.task4_1.num9;

class Table extends Furniture {
    public Table(String name, double price) {
        super(name, price);
    }

    @Override
    public void displayInfo() {
        System.out.println("Стол: " + getName() + ", Цена: " + getPrice() + " руб.");
    }
}