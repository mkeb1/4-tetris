import javax.swing.*;
import java.awt.*;

public class GUI {

    JFrame jf;
    DrawCircle drawCircle;
    DrawLine drawLine;



    public GUI() {
        jf = new JFrame("4-tetris");
        jf.setSize(1920, 1080);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.getContentPane().setBackground(Color.DARK_GRAY);

        addPiece(Color.YELLOW, 500, 500, 50 , 50);
        addPiece(Color.GREEN, 600, 600, 50 , 50);

        jf.setVisible(true);

        Grid();


    }

    /**Piece adden und moven **/

    public void movePieceTo(int x, int y) {
        drawCircle.move(x, y);
        jf.repaint();
   }

    public void addPiece(Color color, int x, int y, int w, int h) {
        jf.add(piece(color, x, y, w, h));
        jf.repaint();
    }

    DrawCircle piece(Color color, int x, int y, int w, int h) {
        drawCircle = new DrawCircle(color, x, y, w, h);
        drawCircle.setVisible(true);
        return drawCircle;
    }

    /** Das Spielfeld **/

    void Grid() {
        DrawLine line1;
        line1 = new DrawLine(Color.BLUE);
        line1.setVisible(true);
        jf.add(line1);

    }


}
