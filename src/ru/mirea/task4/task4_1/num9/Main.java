package ru.mirea.task4.task4_1.num9;

public class Main {
    public static void main(String[] args) {
        Chair chair = new Chair("Стул Comfort", 150.0);
        Table table = new Table("Стол Classic", 300.0);

        FurnitureShop shop = new FurnitureShop("Мебельный магазин 'Лучшая Мебель'");

        shop.displayFurnitureInfo(chair);
        shop.displayFurnitureInfo(table);
    }
}