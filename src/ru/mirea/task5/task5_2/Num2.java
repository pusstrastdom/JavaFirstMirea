package ru.mirea.task5.task5_2;

import javax.swing.*;

public class Num2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new RandomShapes());
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}