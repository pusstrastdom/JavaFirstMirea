package ru.mirea.task6.task6_4;

class RealEstate implements Priceable {
    private String address;
    private double price;

    public RealEstate(String address, double price) {
        this.address = address;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}