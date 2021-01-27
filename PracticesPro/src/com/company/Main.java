package com.company;


import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        JFrame f = new JFrame();

        f.setTitle("Border+Pannel");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new BorderLayout());
        f.setSize(500,500);
        f.setVisible(true);

        JLabel label = new JLabel();
        label.setText("Rabbi");

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();
        JPanel p5 = new JPanel();

        p1.setBackground(Color.pink);
        p1.add(label);
        p2.setBackground(Color.DARK_GRAY);
        p3.setBackground(Color.DARK_GRAY);
        p4.setBackground(Color.magenta);
        p5.setBackground(Color.blue);

        p1.setPreferredSize(new Dimension(100,100));
        p2.setPreferredSize(new Dimension(100,100));
        p3.setPreferredSize(new Dimension(100,100));
        p4.setPreferredSize(new Dimension(100,100));
        p5.setPreferredSize(new Dimension(100,100));

        f.add(p1,BorderLayout.NORTH);
        f.add(p2,BorderLayout.WEST);
        f.add(p3,BorderLayout.EAST);
        f.add(p4,BorderLayout.SOUTH);
        f.add(p5,BorderLayout.CENTER);

        p5.setLayout(new BorderLayout());

        JPanel p6 = new JPanel();
        JPanel p7 = new JPanel();
        JPanel p8 = new JPanel();
        JPanel p9 = new JPanel();

        p6.setBackground(Color.green);
        p7.setBackground(Color.green);
        p8.setBackground(Color.green);
        p9.setBackground(Color.green);



        p6.setPreferredSize(new Dimension(50,50));
        p7.setPreferredSize(new Dimension(50,50));
        p8.setPreferredSize(new Dimension(50,50));
        p9.setPreferredSize(new Dimension(50,50));



        p5.add(p6,BorderLayout.EAST);
        p5.add(p7,BorderLayout.WEST);
        p5.add(p8,BorderLayout.NORTH);
        p5.add(p9,BorderLayout.SOUTH);




    }
}


