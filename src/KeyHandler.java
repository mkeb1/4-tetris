import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class KeyHandler implements KeyListener {
    @Override
    public void keyTyped(KeyEvent e) {
        //gedrückt + losgelassen
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //gedrückt
        if(e.getKeyCode() == KeyEvent.VK_W){  //VK_Button
            System.out.println("w ist gedrückt");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //losgelassen
    }
}