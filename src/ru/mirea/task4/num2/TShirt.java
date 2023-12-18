package ru.mirea.task4.num2;

class TShirt extends Clothes implements MenClothing, WomenClothing {

    public TShirt(Size size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужская футболка: Размер " + size + ", Цвет " + color + ", Стоимость " + cost);
    }

    @Override
    public void dressWomen() {
        System.out.println("Женская футболка: Размер " + size + ", Цвет " + color + ", Стоимость " + cost);
    }
}