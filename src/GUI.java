import javax.swing.*;
import java.awt.*;

public class GUI {

    JFrame jf;
    DrawCircle drawCircle;
    DrawLine drawLine;

    public GUI() {

    }

    public void startGame() {
        jf = new JFrame("4-tetris");
        jf.setSize(1920, 1080);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.getContentPane().setBackground(Color.DARK_GRAY);


        jf.setVisible(true);

        Grid();


        jf.addKeyListener(new KeyHandler()); //added den Keylistener

    }

    /**Piece adden und moven **/

    public void movePieceTo(int x, int y) {
        drawCircle.move(x, y);
        jf.repaint();
   }



    /** Das Spielfeld **/

    void Grid() {
        DrawLine line1;
        line1 = new DrawLine(Color.magenta);
        line1.setVisible(true);
        jf.add(line1);
        jf.repaint();

    }


}
