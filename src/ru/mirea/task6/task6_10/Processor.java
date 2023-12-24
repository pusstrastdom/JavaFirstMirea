package ru.mirea.task6.task6_10;

class Processor {
    private String model;
    private int speed;

    public Processor(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return model + " " + speed + "GHz";
    }
}