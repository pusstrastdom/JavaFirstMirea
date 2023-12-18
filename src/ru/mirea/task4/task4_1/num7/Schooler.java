package ru.mirea.task4.task4_1.num7;

public class Schooler extends Member{
    int room;

    public Schooler(String name, int room) {
        super(name);
        this.room = room;
    }

    public int getRoom() {
        return room;
    }
}