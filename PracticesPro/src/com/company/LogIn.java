package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LogIn implements ActionListener {
    JFrame frame = new JFrame();
    JButton loginButton = new JButton("loginButton");
    JButton resetButton = new JButton("resetButton");
    JTextField userIDField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();

    JLabel userIDLable = new JLabel("UserID: ");
    JLabel userPasswordLable = new JLabel("Pssoword: ");
    JLabel messageLable = new JLabel();

    HashMap<String,String> checkList;
    public LogIn(HashMap signInList) {

        checkList = signInList;

        userIDLable.setBounds(80,100,100,40);
        userIDLable.setFont(new Font(null,Font.PLAIN,20));
        userIDLable.setForeground(Color.white);

        userIDField.setBounds(200,113,200,25);
        userIDField.setFont(new Font(null,Font.PLAIN,15));

        userPasswordLable.setBounds(80,150,100,40);
        userPasswordLable.setFont(new Font(null,Font.PLAIN,20));
        userPasswordLable.setForeground(Color.white);

        userPasswordField.setBounds(200,163,200,25);
        userPasswordField.setFont(new Font(null,Font.PLAIN,15));

        loginButton.setBounds(80,200,200,40);
        loginButton.setFont(new Font(null,Font.PLAIN,15));
        loginButton.setBackground(Color.pink);
        loginButton.setForeground(Color.white);
        loginButton.setFocusable(false);

        resetButton.setBounds(250,200,200,40);
        resetButton.setFont(new Font(null,Font.PLAIN,15));
        resetButton.setBackground(Color.pink);
        resetButton.setForeground(Color.white);
        resetButton.setFocusable(false);

        messageLable.setBounds(120,300,300,40);
        messageLable.setFont(new Font(null,Font.PLAIN,30));
        messageLable.setForeground(Color.green);


        frame.add(messageLable);
        frame.add(userIDField);
        frame.add(userPasswordField);
        frame.add(resetButton);
        frame.add(loginButton);
        frame.add(userPasswordLable);
        frame.add(userIDLable);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.darkGray);
        frame.setResizable(false);
        frame.setVisible(true);

        loginButton.addActionListener(this::actionPerformed);
        resetButton.addActionListener(this::actionPerformed);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == resetButton){
            userIDField.setText("");
            userPasswordField.setText("");
        }

        if(e.getSource() == loginButton){
            String userID = userIDField.getText();
            String password = String.valueOf(userPasswordField.getPassword());

            if(checkList.containsKey(userID)){
                    if(checkList.get(userID).equals(password)){
                        messageLable.setText("Loggin succes");
                    }else {
                        messageLable.setText("Password wrong!");
                    }

            }else{
                messageLable.setText("UserID wrong!");
            }



        }

    }
}
