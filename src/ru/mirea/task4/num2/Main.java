package ru.mirea.task4.num2;

public class Main {
    public static void main(String[] args) {
        Clothes[] clothes = {
                new TShirt(Size.M, 25.99, "Red"),
                new TShirt(Size.XXS, 15.99, "Blue"),
                new Pants(Size.L, 45.99, "Black"),
                new Pants(Size.S, 35.99, "Gray"),
                new Skirt(Size.XS, 55.99, "Pink"),
                new Tie(Size.M, 12.99, "Black")
        };

        Atelier atelier = new Atelier();
        atelier.dressWomen(clothes);
        System.out.println();
        atelier.dressMan(clothes);
    }
}