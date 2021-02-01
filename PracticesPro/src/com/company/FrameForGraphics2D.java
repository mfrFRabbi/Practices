package com.company;

import javax.swing.*;

public class FrameForGraphics2D extends JFrame {
    Graphics2DD graphics2D;
    FrameForGraphics2D(){
        this.add(graphics2D = new Graphics2DD());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setVisible(true);
    }
}
