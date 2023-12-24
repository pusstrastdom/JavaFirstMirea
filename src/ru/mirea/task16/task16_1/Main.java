package ru.mirea.task16.task16_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class Main {
    static Random random = new Random(System.nanoTime());
    static int num = random.nextInt(20);
    static int i = 0;
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Guess");
        jFrame.setSize(400, 400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel jPanel = new JPanel(new BorderLayout());
        JTextArea jTextArea = new JTextArea();
        jTextArea.setColumns(4);
        jTextArea.setRows(4);
        JButton jButton = new JButton("Check");
        JLabel jLabel = new JLabel("Results", JLabel.CENTER);
        jLabel.setPreferredSize(new Dimension(0,80));
        JLabel jLabel0 = new JLabel("GAME", JLabel.CENTER);
        jLabel0.setPreferredSize(new Dimension(0, 60));
        JLabel jLabelI = new JLabel("Important information", JLabel.CENTER);
        jTextArea.setFont(new Font("Times new roman", Font.BOLD, 28));
        jButton.setFont(new Font("Times new roman", Font.BOLD, 28));
        jLabel.setFont(new Font("Times new roman", Font.BOLD, 28));
        jLabel0.setFont(new Font("Times new roman", Font.BOLD, 42));
        jLabelI.setFont(new Font("Times new roman", Font.BOLD, 16));
        jPanel.add(jTextArea, BorderLayout.WEST);
        jPanel.add(jButton, BorderLayout.EAST);
        jPanel.add(jLabel, BorderLayout.SOUTH);
        jPanel.add(jLabel0, BorderLayout.NORTH);
        jPanel.add(jLabelI, BorderLayout.CENTER);
        jFrame.add(jPanel);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    int ennum = Integer.parseInt(jTextArea.getText());
                    if(ennum < num){
                        jLabel.setText("<html>Imagined number is bigger<br>than " + ennum + "</html>");
                        i++;
                    }
                    else if(ennum > num){
                        jLabel.setText("<html>Imagined number is smaller<br>than " + ennum + "</html>");
                        i ++;
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Imagined number is " + num + "!", "Victory", JOptionPane.INFORMATION_MESSAGE);
                        System.exit(0);
                    }
                    if(i==3){
                        JOptionPane.showMessageDialog(null, "Attempts are over", "Defeat", JOptionPane.INFORMATION_MESSAGE);
                        System.exit(0);
                    }
                }catch (Exception er) {
                    JOptionPane.showMessageDialog(null, "Not int number", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        jLabel0.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                jLabelI.setText("Welcome to NORTH!");
            }
        });
        jTextArea.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                jLabelI.setText("Welcome to WEST!");
            }
        });
        jLabelI.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                jLabelI.setText("Welcome to CENTER!");
            }
        });
        jButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                jLabelI.setText("Welcome to EAST!");
            }
        });
        jLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                jLabelI.setText("Welcome to SOUTH!");
            }
        });
        jFrame.setVisible(true);
    }
}