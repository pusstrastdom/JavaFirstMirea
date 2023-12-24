package ru.mirea.task6.task6_1;

public class MovableCircle {
    int radius;
    MovablePoint center;

    public MovableCircle(int radius, int x, int y, int xSpeed, int ySpeed) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }

    public void moveUp(){
        this.center.y += this.center.ySpeed;
    }

    public void moveDown(){
        this.center.y -= this.center.ySpeed;
    }

    public void moveLeft(){
        this.center.x -= this.center.xSpeed;
    }

    public void moveRight(){
        this.center.x += this.center.xSpeed;
    }
}