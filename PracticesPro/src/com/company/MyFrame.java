package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    public MyFrame(){
    //    JFrame frame = new JFrame();
        JButton button = new JButton();
        button.setBounds(50,50,100,50);
        button.addActionListener(e -> {
            System.out.println("Button is working");
        });
        this.add(button);
        this.setTitle("SimpleCalculator");
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);

        this.getContentPane().setBackground(Color.darkGray);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("test");
    }
}
