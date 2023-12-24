package ru.mirea.task6.task6_4;

public class Main {
    public static void main(String[] args) {
        Priceable product = new Product("Лаптоп", 999.99);
        Priceable car = new Car("Toyota Camry", 25000.0);
        Priceable realEstate = new RealEstate("123 Main St", 200000.0);

        System.out.println("Цена продукта: $" + product.getPrice());
        System.out.println("Цена автомобиля: $" + car.getPrice());
        System.out.println("Цена недвижимости: $" + realEstate.getPrice());
    }
}