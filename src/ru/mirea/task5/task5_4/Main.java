package ru.mirea.task5.task5_4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.Timer;

public class Main {
    public static void main(String[] args) {
        String path;
        if(args.length > 0)path = args[0];
        else{
            Scanner sc = new Scanner(System.in);
            path = sc.nextLine();
        }
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(640, 480);
        JLabel label = new JLabel(new ImageIcon(path));
        frame.add(label);
        frame.pack();
        frame.setVisible(true);
        Timer timer = new Timer(100, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                label.setIcon(new ImageIcon(path));
            }
        });
        timer.start();
    }
}