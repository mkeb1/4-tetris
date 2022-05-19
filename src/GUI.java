import javax.swing.*;
import java.awt.*;

public class GUI {

    JFrame jf;
    Draw draw;



    public GUI() {
        jf = new JFrame("4-tetris");
        jf.setSize(1920, 1080);
        jf.getContentPane().setBackground(Color.DARK_GRAY);

        jf.setVisible(true);
    }

    public void addPiece(Color color, int x, int y, int w, int h) {
        jf.add(piece(color, x, y, w, h));
    }

    Draw piece(Color color, int x, int y, int w, int h) {
        draw = new Draw(color, x, y, w, h);
        draw.setVisible(true);
        return draw;
    }

    void Grid() {

    }

}
