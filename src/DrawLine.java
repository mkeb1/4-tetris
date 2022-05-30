import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;

public class DrawLine extends JLabel {


    Color color;




    public DrawLine(Color color) {
        this.color = color;
    }

    private static final long serialVersionUID = 1L;

    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D grafik2d = (Graphics2D) g;

        grafik2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);


        g.setColor(color);
        g.drawLine(810, 832, 810, 132);
        g.drawLine(710, 832, 710, 132);
        g.drawLine(610, 832, 610, 132);
        g.drawLine(510, 832, 510, 132);
        g.drawLine(410, 832, 410, 132);
        g.drawLine(310, 832, 310, 132);
        g.drawLine(910, 832, 910, 132);
        g.drawLine(1010, 832, 1010, 132);
        g.drawLine(1110, 832, 1110, 132);
        g.drawLine(1210, 832, 1210, 132);

        g.drawLine(310, 732, 1210, 732);
        g.drawLine(310, 632, 1210, 632);
        g.drawLine(310, 532, 1210, 532);
        g.drawLine(310, 432, 1210, 432);
        g.drawLine(310, 332, 1210, 332);
        g.drawLine(310, 232, 1210, 232);
        g.drawLine(310, 132, 1210, 132);

        repaint();
    }


}
