package ru.mirea.task6.task6_9;

class Magazine implements Printable {
    private String name;

    public Magazine(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Печать журнала: " + name);
    }
}