package ru.mirea.task4.task4_1.num9;

class FurnitureShop {
    private String name;

    public FurnitureShop(String name) {
        this.name = name;
    }

    public void displayFurnitureInfo(Furniture furniture) {
        System.out.println("В магазине " + name + " доступна следующая мебель:");
        furniture.displayInfo();
    }
}