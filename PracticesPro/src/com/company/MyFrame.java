package com.company;

import javax.swing.*;


public class MyFrame extends JFrame {
    DragPanel dragPanel = new DragPanel();
    MyFrame(){
        this.add(dragPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,600);
        this.setVisible(true);
    }
}


