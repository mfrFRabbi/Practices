package com.company;

import javax.swing.*;

public class ProgressBarDemo {
    JFrame frame;
    JProgressBar progressBar;

    public ProgressBarDemo() {
        frame = new JFrame("ProgressBar");
        progressBar = new JProgressBar();

        progressBar.setBounds(30,30,300,40);
        progressBar.setValue(0);
        progressBar.setStringPainted(true);


        frame.add(progressBar);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
        fill();

    }

    private void fill() {
        int count = 0;

        while (count<=100){
            progressBar.setValue(count);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count +=10;
        }

    }
}
