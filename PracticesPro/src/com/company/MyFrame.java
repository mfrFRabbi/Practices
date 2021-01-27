package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame{
    JButton button;
    JLabel messageLable;
    public MyFrame(){
        button = new JButton();
        messageLable = new JLabel();
        button.setBounds(100,100,50,30);
        button.addActionListener(e -> {
            if(e.getSource() == button)
            {
                messageLable.setText("This is message");
                messageLable.setForeground(Color.RED);
                messageLable.setBounds(100,200,500,30);}

        });

        this.add(messageLable);
        this.add(button);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.setVisible(true);
    }

}
