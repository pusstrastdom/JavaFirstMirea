package ru.mirea.task6.task6_2;

import ru.mirea.task6.task6_1.MovableCircle;
import ru.mirea.task6.task6_1.MovablePoint;

public class Main {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(1, 2, 3, 4);
        MovableRectangle rectangle = new MovableRectangle(1, 2, 3, 4, 5, 6);
        System.out.println(point);
        point.moveUp();
        System.out.println(point);
        point.moveLeft();
        System.out.println(point);

        System.out.println(rectangle);
        rectangle.moveUp();
        rectangle.moveLeft();
        System.out.println(rectangle);
    }
}