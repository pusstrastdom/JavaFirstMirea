package ru.mirea.task5.task5_3;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
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
        try {
            Image image = ImageIO.read(new File(path));
            frame.add(new JLabel(new ImageIcon(image)));
            frame.pack();
            frame.setVisible(true);
        }
        catch (IOException e){
            System.out.println("Invalid path");
        }
    }
}