package ru.mirea.task2.task2_6;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(3.5);

        System.out.println("Окружность 1: Радиус = " + circle1.getRadius());
        System.out.println("Площадь = " + circle1.calculateArea());
        System.out.println("Длина окружности = " + circle1.calculatePerimeter());

        System.out.println("Окружность 2: Радиус = " + circle2.getRadius());
        System.out.println("Площадь = " + circle2.calculateArea());
        System.out.println("Длина окружности = " + circle2.calculatePerimeter());

        if (circle1.equals(circle2)) {
            System.out.println("Окружности равны по радиусу.");
        } else {
            System.out.println("Окружности разные по радиусу.");
        }
    }
}