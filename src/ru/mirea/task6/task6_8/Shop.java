package ru.mirea.task6.task6_8;

class Shop implements Printable {
    private String name;
    private String location;

    public Shop(String name, String location) {
        this.name = name;
        this.location = location;
    }

    @Override
    public void print() {
        System.out.println("Магазин: " + name);
        System.out.println("Местоположение: " + location);
    }

    // Другие методы класса Shop
    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}