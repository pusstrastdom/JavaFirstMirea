package ru.mirea.task6.task6_9;

class Book implements Printable {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Печать книги: " + title);
    }
}