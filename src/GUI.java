import javax.swing.*;
import java.awt.*;

public class GUI {

    JFrame jf;
    DrawCircle draw;


    public GUI() {
        jf = new JFrame("4-tetris");
        jf.setSize(1920, 1080);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.getContentPane().setBackground(Color.DARK_GRAY);

        addPiece(Color.YELLOW, 500, 500, 50 , 50);

        jf.setVisible(true);

    }

    /**Piece adden und moven **/

    public void movePieceTo(int x, int y) {
        draw.move(x, y);
        jf.repaint();
   }

    public void addPiece(Color color, int x, int y, int w, int h) {
        jf.add(piece(color, x, y, w, h));
        jf.repaint();
    }

    DrawCircle piece(Color color, int x, int y, int w, int h) {
        draw = new DrawCircle(color, x, y, w, h);
        draw.setVisible(true);
        return draw;
    }

    /** Das Spielfeld **/

    void Grid() {
    }



}
