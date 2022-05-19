import javax.swing.*;
import java.awt.*;

public class GUI {

    JFrame jf;
    Draw draw;


    public GUI() {
        jf = new JFrame("4-tetris");
        jf.setSize(1920, 1080);
        jf.getContentPane().setBackground(Color.DARK_GRAY);

        jf.add(piece());

        jf.setVisible(true);
    }

    public Draw piece() {
        draw = new Draw();
        draw.setVisible(true);

        return draw;
    }

}
