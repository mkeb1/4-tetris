import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import static javax.swing.SwingConstants.CENTER;

public class GUI {

    JFrame jf = new JFrame("4-tetris");
    JFrame jfs;
    JFrame jfe;
    DrawCircle drawCircle;
    JLabel jl;
    JLabel jl2;
    KeyHandler keyHandler = new KeyHandler(this);
    Game game;


    public GUI(Game game) {
        this.game = game;
        drawCircle = new DrawCircle();

    }

    public void startScreen() {
        getGame().setGame(false);
        getGame().setStartscreen(true);

        KeyHandler k = new KeyHandler(this);

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
        jf.setSize(1920, 1080);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.getContentPane().setBackground(Color.DARK_GRAY);
        jf.setExtendedState(JFrame.MAXIMIZED_BOTH);
        Grid();

        jf.setVisible(true);

        jf.addKeyListener(keyHandler); //added den Keylistener
        getGame().setStartscreen(false);
        getGame().setGame(true);



    }

    public void endScreen(int player) {
        getGame().setGame(false);
        getGame().setEndscreen(true);

        KeyHandler k = new KeyHandler(this);

        jfe = new JFrame("end-screen");
        jfe.setSize(1920, 1080);
        jfe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jfe.getContentPane().setBackground(Color.DARK_GRAY);

        jl2 = new JLabel("Player " + player +  " win!", null, CENTER);
        jl2.setFont(new Font("Serif", Font.PLAIN, 90));
        jl2.setForeground(Color.white);
        jfe.add(jl2);

        jfe.setVisible(true);
        jl2.setVisible(true);

        jfe.addKeyListener(k);

    }


    /**Piece adden und moven und entfernen **/


    public void delAllPieces() {
        drawCircle = null;
    }

    public void addPiece(Color color, int x, int y) {
        drawCircle.setnPieces(drawCircle.getnPieces() + 1);

        drawCircle.setX(drawCircle.getnPieces() - 1, x);
        drawCircle.setY(drawCircle.getnPieces() - 1, y);
        drawCircle.setColor(color);
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

    public DrawCircle getDrawCircle() {
        return drawCircle;
    }

    public void setDrawCircle(DrawCircle drawCircle) {
        this.drawCircle = drawCircle;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
}
