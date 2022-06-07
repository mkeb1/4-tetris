import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import static javax.swing.SwingConstants.CENTER;

public class GUI implements KeyListener {

    JFrame jf;
    JFrame jfs;
    DrawCircle drawCircle;
    JLabel jl;

    public GUI() {

    }

    public void startScreen() {
        KeyHandler k = new KeyHandler(this);
        k.setStartscreen(true);

        jfs = new JFrame("start-screen");
        jfs.setSize(1920, 1080);
        jfs.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jfs.getContentPane().setBackground(Color.DARK_GRAY);

        jl = new JLabel("4-Tetris", null, CENTER);
        jl.setFont(new Font("Serif", Font.BOLD, 150));
        jl.setForeground(Color.white);
        jfs.add(jl);

        jfs.setVisible(true);
        jl.setVisible(true);

        jfs.addKeyListener(k);
    }

    public void startGame() {
        jf = new JFrame("4-tetris");
        jf.setSize(1920, 1080);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.getContentPane().setBackground(Color.DARK_GRAY);
        jf.setExtendedState(JFrame.MAXIMIZED_BOTH);
        drawCircle = new DrawCircle();
        Grid();

        KeyHandler keyHandler = new KeyHandler(this);

        jf.setVisible(true);

        jf.addKeyListener(keyHandler); //added den Keylistener

        addPiece(Color.red, 600, 300);
        addPiece(Color.GREEN, 520, 390);
        keyHandler.setN(keyHandler.getN() +1);

    }

    /**Piece adden und moven und entfernen **/

    public void movePiece(int n, int x, int y) {
        drawCircle.move(n, x, y);
        jf.repaint();
    }

    public void delAllPieces() {
        drawCircle = null;
    }

    public void addPiece(Color color, int x, int y) {
        drawCircle.setnPieces(drawCircle.getnPieces() + 1);
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

    public DrawCircle getDrawCircle() {
        return drawCircle;
    }

    public void setDrawCircle(DrawCircle drawCircle) {
        this.drawCircle = drawCircle;
    }
}
