package ru.mirea.task6.task6_10;

class Memory {
    private int sizeGB;
    private String type;

    public Memory(int sizeGB, String type) {
        this.sizeGB = sizeGB;
        this.type = type;
    }

    @Override
    public String toString() {
        return sizeGB + "GB " + type + " RAM";
    }
}