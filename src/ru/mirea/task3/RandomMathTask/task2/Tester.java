package ru.mirea.task3.RandomMathTask.task2;

import java.util.Arrays;

class Tester {
    public Circle[] circles;
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Tester(int capacity) {
        circles = new Circle[capacity];
        count = 0;
    }

    public void addCircle(Circle circle) {
        if (count < circles.length) {
            circles[count] = circle;
            count++;
        } else {
            System.out.println("Массив окружностей полон, невозможно добавить больше окружностей.");
        }
    }

    public Circle findSmallestCircle() {
        if (count == 0) {
            return null;
        }

        Circle smallestCircle = circles[0];
        for (int i = 1; i < count; i++) {
            if (circles[i].getRadius() < smallestCircle.getRadius()) {
                smallestCircle = circles[i];
            }
        }
        return smallestCircle;
    }

    public Circle findLargestCircle() {
        if (count == 0) {
            return null;
        }

        Circle largestCircle = circles[0];
        for (int i = 1; i < count; i++) {
            if (circles[i].getRadius() > largestCircle.getRadius()) {
                largestCircle = circles[i];
            }
        }
        return largestCircle;
    }

    public void sortCirclesByRadius() {
        Arrays.sort(circles, 0, count, (c1, c2) -> Double.compare(c1.getRadius(), c2.getRadius()));
    }
}