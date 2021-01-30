package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListenerS extends JFrame implements KeyListener {
    JLabel label;
    public KeyListenerS(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        label = new JLabel();
        label.setBounds(0,0,50,30);
        label.setBackground(Color.pink);
        label.setOpaque(true);

        this.addKeyListener(this);
        this.add(label);
        this.setLayout(null);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyChar()){
            case 'j':
                label.setLocation(label.getX()-10,label.getY());
                break;
            case 'k':
                label.setLocation(label.getX(),label.getY()+10);
                break;
            case 'l':
                label.setLocation(label.getX()+10,label.getY());
                break;
            case 'i':
                label.setLocation(label.getX(),label.getY()-10);
                break;
        }

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()){
            case 37:
                label.setLocation(label.getX()-10,label.getY());
                break;
            case 40:
                label.setLocation(label.getX(),label.getY()+10);
                break;
            case 39:
                label.setLocation(label.getX()+10,label.getY());
                break;
            case 38:
                label.setLocation(label.getX(),label.getY()-10);
                break;
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
      //  System.out.println(e.getKeyChar());
      //  System.out.println(e.getKeyCode());

    }
}
