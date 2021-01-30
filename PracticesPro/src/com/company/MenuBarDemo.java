package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MenuBarDemo extends JFrame implements ActionListener {
    JMenuBar menuBar;
    JMenu fMenu;
    JMenu eMenu;
    JMenu hMenu;
    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;

    public MenuBarDemo() {
        menuBar = new JMenuBar();
        fMenu = new JMenu("File");
        eMenu = new JMenu("Edit");
        hMenu = new JMenu("Help");

        fMenu.setMnemonic(KeyEvent.VK_F);
        eMenu.setMnemonic(KeyEvent.VK_E);
        hMenu.setMnemonic(KeyEvent.VK_H);

        loadItem = new JMenuItem("Load");
        loadItem.addActionListener(this);

        saveItem = new JMenuItem("Save");
        saveItem.addActionListener(this);

        exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(this);

        loadItem.setMnemonic(KeyEvent.VK_L);
        saveItem.setMnemonic(KeyEvent.VK_S);   //KeyBoard shortCut
        exitItem.setMnemonic(KeyEvent.VK_E);


        fMenu.add(loadItem);
        fMenu.add(saveItem);
        fMenu.add(exitItem);

        menuBar.add(fMenu);
        menuBar.add(eMenu);
        menuBar.add(hMenu);
        this.setJMenuBar(menuBar);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,400);
        this.setLayout(new FlowLayout());
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == loadItem){
            System.out.println("loadItem");
        }
        else if(e.getSource() == saveItem){
            System.out.println("saveItem");
        }
        else {
            System.exit(0);
        }
    }
}
