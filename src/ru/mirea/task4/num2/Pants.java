package ru.mirea.task4.num2;

class Pants extends Clothes implements MenClothing, WomenClothing {

    public Pants(Size size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужские штаны: Размер " + size + ", Цвет " + color + ", Стоимость " + cost);
    }

    @Override
    public void dressWomen() {
        System.out.println("Женские штаны: Размер " + size + ", Цвет " + color + ", Стоимость " + cost);
    }
}