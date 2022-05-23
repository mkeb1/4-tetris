import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;

public class DrawLine extends JLabel {


    Color color;
    int x1, y1, x2, y2;

    public DrawLine(Color color, int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.color = color;
    }

    private static final long serialVersionUID = 1L;

    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D grafik2d = (Graphics2D) g;

        grafik2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);


        g.setColor(color);
        g.drawLine(x1, y1, x2, y2);

        repaint();
    }

}
