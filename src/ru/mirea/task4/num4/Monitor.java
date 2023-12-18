package ru.mirea.task4.num4;

class Monitor {
    private String model;
    private double size; // дюймы

    public Monitor(String model, double size) {
        this.model = model;
        this.size = size;
    }

    public String getModel() {
        return model;
    }

    public double getSize() {
        return size;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
