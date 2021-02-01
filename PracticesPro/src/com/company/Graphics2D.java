package com.company;

import javax.swing.*;
import java.awt.*;

public class Graphics2D extends JPanel {

    public Graphics2D() {
        this.setPreferredSize(new Dimension(500,500));
    }

    @Override
    public void paint(Graphics g) {
        java.awt.Graphics2D graphics2D = (java.awt.Graphics2D) g;
        graphics2D.setPaint(Color.red);
        graphics2D.setStroke(new BasicStroke(5));
     //   graphics2D.drawLine(50,50,150,150);
//        graphics2D.drawRect(2,2,100,200);
//        graphics2D.fillRect(2,2,100,200);
//
//        graphics2D.setPaint(Color.orange);
//        graphics2D.drawOval(110,50,100,100);
//        graphics2D.fillOval(110,50,100,100);
//        graphics2D.drawArc(0,0,100,100,180,180);
        int[] xP ={150,250,350};
        int[] yP ={300,150,300};

        graphics2D.drawPolygon(xP,yP,3);


    }
}
