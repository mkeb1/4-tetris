import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;

public class DrawCircle extends JLabel {

    Color [] color;
    int [] x, y, w, h;
    int nPieces;

    public DrawCircle() {
        int [] x = new int [63];
        int [] y = new int [63];
        int [] w = new int [63];
        int [] h = new int [63];
        Color [] color = new Color[63];

    }

    private static final long serialVersionUID = 1L;

    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D grafik2d = (Graphics2D) g;

        grafik2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);


        /*g.setColor(color);
        g.fillOval(x, y, w, h);*/

        repaint();
    }

    public void move(int x, int y) {

        repaint();
    }

}
