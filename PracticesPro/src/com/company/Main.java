package com.company;


import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500,500);
        f.setTitle("JLayerdPane");
        f.setLayout(null);

        JLayeredPane layeredPane = new JDesktopPane();
        layeredPane.setSize(500,500);
        layeredPane.setBackground(Color.DARK_GRAY);
        JLabel label = new JLabel();
        JLabel label2 = new JLabel();
        JLabel label3 = new JLabel();
        JLabel label4 = new JLabel();

        label.setBounds(100,100,200,200);
        label.setOpaque(true);
        label.setBackground(Color.pink);

        label2.setBounds(150,150,200,200);
        label2.setOpaque(true);
        label2.setBackground(Color.green);

        label3.setBounds(200,200,200,200);
        label3.setOpaque(true);
        label3.setBackground(Color.red);

        label4.setBounds(250,250,200,200);
        label4.setOpaque(true);
        label4.setBackground(Color.blue);



        layeredPane.add(label);
        layeredPane.add(label2);
        layeredPane.add(label3);
        layeredPane.add(label4);


        f.add(layeredPane);
        f.setVisible(true);




    }
}


