package ru.mirea.task4.num2;

enum Size {
    XXS(32), XS(34), S(36), M(38), L(40);

    private int euroSize;

    // Конструктор для установки числового значения euroSize
    Size(int euroSize) {
        this.euroSize = euroSize;
    }

    // Метод для получения описания размера
    public String getDescription() {
        if (this == XXS) {
            return "Детский размер";
        } else {
            return "Взрослый размер";
        }
    }

    public int getEuroSize() {
        return euroSize;
    }
}