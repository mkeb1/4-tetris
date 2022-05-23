import java.awt.*;
import java.util.Objects;
import static java.awt.event.KeyEvent.*;   // das braucht man für die Tasten

public class Player {
    public Color colour;    // entweder rot: Color(240, 17, 17) oder gelb: Color(252, 194, 20)
    public int points;
    public int keyLeft;
    public int keyRight;
    public String keys;      // entweder "wasd" oder "arrows"

    Player(Color colour, int points, String keys) {
        this.colour = colour;
        this.points = points;
        if (Objects.equals(keys, "wasd")) {   // d.h. wenn "wasd" angegeben wird hat der Spieler wasd
            this.keyLeft = VK_A;
            this.keyRight = VK_D;
        }
        if (Objects.equals(keys, "arrows")) {  // d.h. wenn "arrows" angegeben wird hat der Spieler die Pfeiltasten
            this.keyLeft = VK_LEFT;
            this.keyRight = VK_RIGHT;
        }
    }


    public String getKeys() {
        return keys;
    }

    public void setKeys(String keys) {
        this.keys = keys;
    }

    public Color getColour() {
        return colour;
    }

    public void setColour(Color colour) {
        this.colour = colour;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
