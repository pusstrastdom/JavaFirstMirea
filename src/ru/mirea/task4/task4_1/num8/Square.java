package ru.mirea.task4.task4_1.num8;

public class Square extends Rectangle{
    public Square(String color, boolean f, double side, double width, double length) {
        super(color, f, width, length);
        this.width = side;
    }

    public double getSide(){
        return this.width;
    }

    public void setSide(double side){
        this.width = side;
    }

    public void setWidth(double side){
        this.width = width;
    }

    public void setLength(double side){
        this.length = length;
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}