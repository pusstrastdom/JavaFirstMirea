package ru.mirea.task7;

public class Main {
    public static void main(String[] args) {
        MovablePoint topLeft = new MovablePoint(1, 2, 3, 4);
        MovablePoint bottomRight = new MovablePoint(4, 5, 6, 7);

        MovableRectangle rectangle = new MovableRectangle(1, 2, 4, 5, 6, 7);
        System.out.println(topLeft.toString());
        System.out.println(bottomRight.toString());
        System.out.println(rectangle.SpeedTest());
        rectangle.moveDown();
        rectangle.moveLeft();
        System.out.println(topLeft.toString());
        System.out.println(bottomRight.toString());
        System.out.println(rectangle.SpeedTest());
    }
}