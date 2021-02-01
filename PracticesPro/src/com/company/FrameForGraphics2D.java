package com.company;

import javax.swing.*;

public class FrameForGraphics2D extends JFrame {
    Graphics2D graphics2D;
    FrameForGraphics2D(){
        this.add(graphics2D = new Graphics2D());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setVisible(true);
    }
}
