import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class KeyHandler implements KeyListener {

    GUI gui;
    int n = 0;
    int xMin = 510;
    int xMax = 1410;

    public KeyHandler(GUI gui) {
        this.gui = gui;
    }


    @Override
    public void keyTyped(KeyEvent e) {
        //gedrückt + losgelassen
    }

    @Override
    public void keyPressed(KeyEvent e) {
        n = gui.getDrawCircle().getnPieces()-1;

        //gedrückt
        if(e.getKeyCode() == KeyEvent.VK_A){  //VK_Button
            //System.out.println("a ist gedrückt");
            if(gui.getDrawCircle().getY(gui.getDrawCircle().getnPieces()-1) <= 290) {
                if ((gui.getDrawCircle().getX(n) - 100 > xMin) && (gui.getDrawCircle().getX(n) - 100 < xMax)) {
                    gui.getDrawCircle().moveX(-100);
                }
            }
        }

        if(e.getKeyCode() == KeyEvent.VK_D){  //VK_Button
            //System.out.println("d ist gedrückt");
            if(gui.getDrawCircle().getY(gui.getDrawCircle().getnPieces()-1) <= 290) {
                if ((gui.getDrawCircle().getX(n) + 100 > xMin) && (gui.getDrawCircle().getX(n) + 100 < xMax)) {
                    gui.getDrawCircle().moveX(100);
                }
            }
        }

        if(e.getKeyCode() == KeyEvent.VK_LEFT){  //VK_Button
            //System.out.println("links ist gedrückt");
            if(gui.getDrawCircle().getY(gui.getDrawCircle().getnPieces()-1) <= 290) {
                if ((gui.getDrawCircle().getX(n) - 100 > xMin) && (gui.getDrawCircle().getX(n) - 100 < xMax)) {
                    gui.getDrawCircle().moveX(-100);
                }
            }
        }

        if(e.getKeyCode() == KeyEvent.VK_RIGHT){  //VK_Button
            //System.out.println("rechts ist gedrückt");
            if(gui.getDrawCircle().getY(gui.getDrawCircle().getnPieces()-1) <= 290) {
                if ((gui.getDrawCircle().getX(n) + 100 > xMin) && (gui.getDrawCircle().getX(n) + 100 < xMax)) {
                    gui.getDrawCircle().moveX(100);
                }
            }
        }

        if(gui.getGame().isStartscreen() && e.getKeyCode() == KeyEvent.VK_SPACE) {
            gui.jfs.setVisible(false);
            gui.jfs.dispose();
            gui.startGame();

        }

        if(gui.getGame().isEndscreen() && e.getKeyCode() == KeyEvent.VK_SPACE) {
            gui.jfe.setVisible(false);
            gui.jfe.dispose();
            gui.startScreen();

        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //loslassen
    }

}
