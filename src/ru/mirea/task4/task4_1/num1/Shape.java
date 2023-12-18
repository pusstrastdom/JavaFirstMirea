package ru.mirea.task4.task4_1.num1;

class Shape {
    public String getType() {
        return "Shape";
    }

    public double getArea() {
        return 0.0;
    }

    public double getPerimeter() {
        return 0.0;
    }

    @Override
    public String toString() {
        return "This is a " + getType();
    }
}