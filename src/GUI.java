import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyEvent.*;
import java.awt.event.KeyListener;

public class GUI implements KeyListener {

    JFrame jf;
    DrawCircle drawCircle;
    DrawLine drawLine;

    int zä = 0;

    public GUI() {
        //startScreen();
        startGame();
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
        jf.setExtendedState(JFrame.MAXIMIZED_BOTH);
        drawCircle = new DrawCircle();

        Grid();
        jf.setVisible(true);



        addPiece(Color.YELLOW, 200, 200);
        addPiece(Color.YELLOW, 400, 400);
        addPiece(Color.YELLOW, 600, 600);



        //jf.addKeyListener(new KeyHandler()); //added den Keylistener

    }

    /**Piece adden und moven **/

    public void movePieceTo(int n, int x, int y) {
        drawCircle.move(n, x, y);
        jf.repaint();
   }

    public void addPiece(Color color, int x, int y) {
        zä = zä + 1;
        drawCircle.setnPieces(zä);
        drawCircle.setX(drawCircle.getnPieces() - 1, x);
        drawCircle.setY(drawCircle.getnPieces() - 1, y);
        drawCircle.setColor(drawCircle.getnPieces() - 1, color);
        drawCircle.setVisible(true);
        drawCircle.repaint();
        jf.add(drawCircle);
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
