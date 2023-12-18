package ru.mirea.task4.task4_1.num8;

public class Main{
    public static void main(String[] args){
        Circle circle = new Circle("yellow", false, 4);
        Rectangle rectangle = new Rectangle("red", true, 5, 3);
        Square square = new Square("black", false, 5, 5, 5);
        System.out.println(circle.getArea());
        System.out.println(rectangle.getArea());
        System.out.println(square.getArea());

        System.out.println(circle.toString());
        System.out.println(rectangle.toString());
        System.out.println(square.toString());
    }
}
