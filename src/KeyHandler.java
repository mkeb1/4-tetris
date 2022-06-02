import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class KeyHandler extends GUI implements KeyListener {

    GUI gui;
    int n;
    boolean startscreen;

    public KeyHandler(GUI gui) {
        this.gui = gui;
    }

    public boolean isStartscreen() {
        return startscreen;
    }

    public void setStartscreen(boolean startscreen) {
        this.startscreen = startscreen;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        //gedrückt
        if(e.getKeyCode() == KeyEvent.VK_W){  //VK_Button
            System.out.println("w ist gedrückt");
        }
        if(e.getKeyCode() == KeyEvent.VK_A){  //VK_Button
            System.out.println("a ist gedrückt");
        }
        if(e.getKeyCode() == KeyEvent.VK_S){  //VK_Button
            System.out.println("s ist gedrückt");
        }
        if(e.getKeyCode() == KeyEvent.VK_D){  //VK_Button
            System.out.println("d ist gedrückt");
        }

        if(e.getKeyCode() == KeyEvent.VK_UP){  //VK_Button
            System.out.println("hoch ist gedrückt");
        }
        if(e.getKeyCode() == KeyEvent.VK_LEFT){  //VK_Button
            System.out.println("links ist gedrückt");
        }
        if(e.getKeyCode() == KeyEvent.VK_DOWN){  //VK_Button
            System.out.println("unten ist gedrückt");
        }
        if(e.getKeyCode() == KeyEvent.VK_RIGHT){  //VK_Button
            System.out.println("rechts ist gedrückt");
        }

        if(startscreen && e.getKeyCode() == KeyEvent.VK_SPACE) {
            gui.jfs.setVisible(false);
            gui.jfs.dispose();
            gui.startGame();
            startscreen = false;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //loslassen
    }
}