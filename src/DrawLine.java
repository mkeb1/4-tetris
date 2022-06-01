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


        int y1V = 1080;
        int y2V = 380;

        g.setColor(color);
        g.drawLine(510, y1V, 510, y2V);
        g.drawLine(610, y1V, 610, y2V);
        g.drawLine(710, y1V, 710, y2V);
        g.drawLine(810, y1V, 810, y2V);
        g.drawLine(910, y1V, 910, y2V);
        g.drawLine(1010, y1V, 1010, y2V);
        g.drawLine(1110, y1V, 1110, y2V);
        g.drawLine(1210, y1V, 1210, y2V);
        g.drawLine(1310, y1V, 1310, y2V);
        g.drawLine(1410, y1V, 1410, y2V);

        int x1H = 510;
        int x2H = 1410;

        g.drawLine(x1H, 980, x2H, 980);
        g.drawLine(x1H, 880, x2H, 880);
        g.drawLine(x1H, 780, x2H, 780);
        g.drawLine(x1H, 680, x2H, 680);
        g.drawLine(x1H, 580, x2H, 580);
        g.drawLine(x1H, 480, x2H, 480);
        g.drawLine(x1H, 380, x2H, 380);

        repaint();
    }


}
