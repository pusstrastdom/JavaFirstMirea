package ru.mirea.task5.task5_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    static int a = 0;
    static int b = 0;
    static Scorer lastScorer = null;
    public static void main(String[] args) {
        JFrame frm = new JFrame();
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton but1 = new JButton("AC Milan");
        JButton but2 = new JButton("Real Madrid");
        JLabel lab1 = new JLabel("Result: " + a + " X " + b);
        JLabel lab2 = new JLabel("Last Scorer: " + ((lastScorer == null)?"N/A":lastScorer));
        JLabel lab3 = new JLabel("Winner: " + ((a != b)?(a > b)?"AC Milan":"Real Madrid":"DRAW"));
        but1.setFont(but1.getFont().deriveFont(24.0F));
        but2.setFont(but2.getFont().deriveFont(24.0F));
        lab1.setFont(lab1.getFont().deriveFont(24.0F));
        lab2.setFont(lab2.getFont().deriveFont(24.0F));
        lab3.setFont(lab3.getFont().deriveFont(24.0F));
        but1.setHorizontalAlignment(SwingConstants.CENTER);
        but2.setHorizontalAlignment(SwingConstants.CENTER);
        lab1.setHorizontalAlignment(SwingConstants.CENTER);
        lab2.setHorizontalAlignment(SwingConstants.CENTER);
        lab3.setHorizontalAlignment(SwingConstants.CENTER);
        JPanel pan = new JPanel(new GridLayout(3,2));
        pan.add(but1);
        pan.add(but2);
        pan.add(lab1);
        pan.add(lab2);
        pan.add(lab3);
        frm.getContentPane().add(pan);
        frm.pack();
        frm.setSize(640, 480);
        frm.setVisible(true);
        but1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a++;
                lastScorer = Scorer.AC_Milan;
                lab1.setText("Result: " + a + " X " + b);
                lab2.setText("Last Scorer: " + ((lastScorer == null)?"N/A":lastScorer));
                lab3.setText("Winner: " + ((a != b)?(a > b)?"AC Milan":"Real Madrid":"DRAW"));
            }
        });
        but2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b++;
                lastScorer = Scorer.Read_Madrid;
                lab1.setText("Result: " + a + " X " + b);
                lab2.setText("Last Scorer: " + ((lastScorer == null)?"N/A":lastScorer));
                lab3.setText("Winner: " + ((a != b)?(a > b)?"AC Milan":"Real Madrid":"DRAW"));
            }
        });
    }
}