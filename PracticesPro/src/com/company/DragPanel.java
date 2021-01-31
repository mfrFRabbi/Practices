package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class DragPanel extends JPanel {
    ImageIcon imageIcon = new ImageIcon("smile.png");
    final int W = imageIcon.getIconWidth();
    final int H = imageIcon.getIconHeight();
    Point imageCorner;
    Point prevPt;

    DragPanel(){
        imageCorner = new Point(0,0);

        this.addMouseListener(new MousePressed());
        this.addMouseMotionListener(new MouseDrag());
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        imageIcon.paintIcon(this,g,(int)imageCorner.getX(),(int)imageCorner.getY());
    }
    private class MousePressed extends MouseAdapter{
        @Override
        public void mousePressed(MouseEvent e) {
            prevPt = e.getPoint();
        }
    }

    private class MouseDrag extends MouseMotionAdapter{
        @Override
        public void mouseDragged(MouseEvent e) {
            Point currentPoint = e.getPoint();
            imageCorner.translate(
                    (int)(currentPoint.getX() -prevPt.getX()),
                    (int)(currentPoint.getY() -prevPt.getY())
            );
            prevPt = currentPoint;
            repaint();
        }
    }
}
