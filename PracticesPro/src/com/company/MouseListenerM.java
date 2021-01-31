package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListenerM extends JFrame implements MouseListener {
    JLabel label;
    MouseListenerM(){
        label = new JLabel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);

        label.setBounds(100,100,200,100);
        label.setBackground(Color.cyan);
        label.setOpaque(true);
        label.addMouseListener(this);

        this.add(label);
        this.setVisible(true);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("mouseClicked");
        label.setBackground(Color.DARK_GRAY);


    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("mousePressed");
     //   label.setBackground(Color.YELLOW);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("mouseReleased");
       // label.setBackground(Color.green);

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("mouseEntered");
      //  label.setBackground(Color.BLUE);

    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("mouseExited");
     //   label.setBackground(Color.red);

    }
}
