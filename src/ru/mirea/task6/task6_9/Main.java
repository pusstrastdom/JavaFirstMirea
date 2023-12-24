package ru.mirea.task6.task6_9;

public class Main {
    public static void main(String[] args) {
        Printable[] printables = new Printable[4];
        printables[0] = new Book("Книга 1");
        printables[1] = new Magazine("Журнал 1");
        printables[2] = new Book("Книга 2");
        printables[3] = new Magazine("Журнал 2");

        for (Printable printable : printables) {
            printable.print();
        }
    }
}