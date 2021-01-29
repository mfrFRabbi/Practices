package com.company.bd;

import javax.swing.*;
import java.awt.*;

public class NewWindow {
    JFrame frame = new JFrame();
    JLabel label = new JLabel();

    public NewWindow() {
        label.setOpaque(true);
        label.setBackground(Color.DARK_GRAY);
        label.setForeground(Color.RED);
        label.setBounds(50,100,100,50);
        label.setText("This is lable");
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("NewWindows");
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
