package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Animation extends JPanel implements ActionListener {
    final int W =500,H=500;
    Image image;
    Image backgroundImage;
    Timer timer;
    int xVelocity = 2,yVelocity = 3;
    int x= 0,y= 0;

    public Animation() {
        image = new ImageIcon("smile.png").getImage();
        this.setPreferredSize(new Dimension(W,H));
        this.setBackground(Color.gray);
        timer = new Timer(10,this);
        timer.start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D graphics2D = (Graphics2D)g;

        graphics2D.drawImage(image,x,y,null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(x>= W-image.getWidth(null) || x<0){
            xVelocity = xVelocity * -1;
        }

        if(y>= H-image.getHeight(null) || y<0){
            yVelocity = yVelocity * -1;
        }
        y = y + yVelocity;
        x = x + xVelocity;

        repaint();
    }
}
