import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyEvent.*;
import java.awt.event.KeyListener;

public class GUI implements KeyListener {

    JFrame jf;
    DrawCircle drawCircle;
    DrawLine drawLine;

    public GUI() {
        startScreen();
    }

    public void startScreen() {
        jf = new JFrame("start-screen");
        jf.setSize(1920, 1080);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.getContentPane().setBackground(Color.DARK_GRAY);

        jf.setVisible(true);

        //klappt noch nicht das muss ich noch verstehen aber hier soll dann eigentlich halt das spiel gestartet werden
        //sobald man die leertaste drückt
        //keyTyped(new KeyEvent(VK_SPACE));
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

    public void add Piece


    /** Das Spielfeld **/

    void Grid() {
        DrawLine line1;
        line1 = new DrawLine(Color.magenta);
        line1.setVisible(true);
        jf.add(line1);

    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        startGame();
    }
}
