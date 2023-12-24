package ru.mirea.task7;

class MovablePoint implements Movable {
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Геттеры и сеттеры для x и y
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public void moveUp() {
        y -= ySpeed;
    }

    @Override
    public void moveDown() {
        y += ySpeed;
    }

    @Override
    public void moveLeft() {
        x -= xSpeed;
    }

    @Override
    public void moveRight() {
        x += xSpeed;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public boolean SpeedTest(MovablePoint otherPoint) {
        return this.xSpeed == otherPoint.xSpeed && this.ySpeed == otherPoint.ySpeed;
    }
}