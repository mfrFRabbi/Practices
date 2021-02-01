package com.company;

import javax.swing.*;

public class FrameForAnimation extends JFrame {
    Animation animation = new Animation();
    FrameForAnimation(){
        this.add(animation);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
