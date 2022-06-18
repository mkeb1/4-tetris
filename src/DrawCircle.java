import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;

public class DrawCircle extends JLabel {

    Color [] color;
    int [] x, y, w, h ;
    int nPieces = 0;

    public DrawCircle() {
        x = new int [63];
        y = new int [63];
        w = new int [63];
        h = new int [63];
        color = new Color[63];

    }

    private static final long serialVersionUID = 1L;

    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D grafik2d = (Graphics2D) g;

        grafik2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        //System.out.println(nPieces);

        for(int i = 0; i < nPieces; i++) {
            g.setColor(color[i]);
            w[i] = 80;
            h[i] = 80;
            g.fillOval(x[i], y[i], w[i], h[i]);
        }
        repaint();
    }

    public void setX(int n, int x) {
        this.x [n] = x;
    }

    public void setY(int n, int y) {
        this.y [n] = y;
    }

    public void setColor(Color color) {
        this.color [nPieces - 1] = color;
        repaint();
    }

    public void moveY(int y) {
        setY(nPieces-1, this.y [nPieces-1] + y);
        repaint();
    }

    public void moveX(int x) {
        setX(nPieces-1, this.x [nPieces-1] + x);
        repaint();
    }

    public int getnPieces() {
        return nPieces;
    }

    public void setnPieces(int nPieces) {
        this.nPieces = nPieces;
    }

    public int getX(int n) {
        return x[n];
    }

    public int getY(int n) {
        return y[n];
    }


}
