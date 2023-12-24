package ru.mirea.task6.task6_1;
public class Main {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(1, 2, 3, 4);
        MovableCircle circle = new MovableCircle(2, 3, 5, 7, 8);
        System.out.println(point);
        point.moveUp();
        System.out.println(point);
        point.moveLeft();
        System.out.println(point);

        System.out.println(circle);
        circle.moveUp();
        circle.moveLeft();
        System.out.println(circle);
    }
}