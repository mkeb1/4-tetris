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
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //loslassen
    }
}