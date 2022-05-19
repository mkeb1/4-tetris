import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;

public class DrawCircle extends JLabel {

    Color color;
    int x, y, w, h;

    public DrawCircle(Color color, int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.color = color;
    }

    private static final long serialVersionUID = 1L;

    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D grafik2d = (Graphics2D) g;

        grafik2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);


        g.setColor(color);
        g.fillOval(x, y, w, h);

        repaint();
    }

    public void move(int x, int y) {
        this.x = x;
        this.y = y;
        repaint();
    }

}
