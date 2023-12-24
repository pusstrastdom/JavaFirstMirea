package ru.mirea.task6.task6_3;

public class Main {
    public static void main(String[] args) {
        Nameable planet = new Planet("Земля");
        Nameable car = new Car("Toyota Camry");
        Nameable animal = new Animal("Лев");

        System.out.println("Имя планеты: " + planet.getName());
        System.out.println("Имя машины: " + car.getName());
        System.out.println("Имя животного: " + animal.getName());
    }
}