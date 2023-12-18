package ru.mirea.task5.task5_2;

import java.awt.*;

public abstract class Shape {
    Color color;
    int positionX;
    int positionY;

    public Shape(Color color, int positionX, int positionY) {
        this.color = color;
        this.positionX = positionX;
        this.positionY = positionY;
    }
    abstract void draw(Graphics graphics);
}