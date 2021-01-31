package com.company.bd;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class DragPanel extends JPanel {
    ImageIcon icon = new ImageIcon("iconX.png");
    final int WIDTH = icon.getIconWidth();
    final int LENGTH =icon.getIconHeight();
    Point iconCorner;
    Point prevPt;
    public DragPanel() {
        iconCorner = new Point(0,0);
        ClickListener clickListener = new ClickListener();
        DragListener dragListener = new DragListener();

        this.addMouseListener(clickListener);
        this.addMouseMotionListener(dragListener);
    }
    protected void paintComponent(Graphics g){
            super.paintComponent(g);
            icon.paintIcon(this,g,(int)iconCorner.getX(),(int)iconCorner.getY());
    }

    private class ClickListener extends MouseAdapter{
        public void mousePressed(MouseEvent e){
            prevPt = e.getPoint();
   //         System.out.println(prevPt);
        }

    }
    private class DragListener extends MouseMotionAdapter {
        public void mouseDragged(MouseEvent e){
            Point currentPt = e.getPoint();
            iconCorner.translate(
                    (int) (currentPt.getX() - prevPt.getX()),
                    (int)(currentPt.getY() - prevPt.getY())
            );
            prevPt = currentPt;
            repaint();
        }
    }

}
