package ru.mirea.task3.RandomMathTask.task2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Tester tester = new Tester(5);
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            double x = random.nextDouble() * 10;
            double y = random.nextDouble() * 10;
            Point center = new Point(x, y);
            double radius = random.nextDouble() * 5;

            Circle circle = new Circle(center, radius);
            tester.addCircle(circle);
        }

        System.out.println("Самая маленькая окружность: " + tester.findSmallestCircle().getRadius());
        System.out.println("Самая большая окружность: " + tester.findLargestCircle().getRadius());

        tester.sortCirclesByRadius();

        System.out.println("Отсортированные окружности по радиусу:");
        for (int i = 0; i < tester.getCount(); i++) {
            System.out.println("Окружность " + (i + 1) + ": Радиус = " + tester.circles[i].getRadius());
        }
    }
}
