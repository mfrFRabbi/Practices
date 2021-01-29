package com.company.bd;

import javax.swing.*;
import java.awt.*;

public class LanchPage {
    JFrame frame = new JFrame();
    JButton button = new JButton();

    public LanchPage() {

        button.setBounds(20,100,100,40);
        button.setBackground(Color.pink);
        button.setText("Button");

        button.addActionListener(e -> {
            if(e.getSource() == button){
                frame.dispose();
                new NewWindow();
            }
        });

        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setTitle("PurposeOfToGoNewWindows");
        frame.setVisible(true);
    }
}
