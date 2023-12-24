package ru.mirea.task6.task6_6;

class Printer implements Printable {
    private String text;

    public Printer(String text) {
        this.text = text;
    }

    @Override
    public void print() {
        System.out.println(text);
    }
}