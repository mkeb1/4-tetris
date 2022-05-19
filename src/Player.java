import java.util.Objects;
import static java.awt.event.KeyEvent.*;   // das braucht man für die Tasten

public class Player {
    public String colour;    // entweder "red" oder "yellow"
    public int points;       //
    public int keyUp;
    public int keyDown;
    public int keyLeft;
    public int keyRight;
    public String keys;      // entweder "wasd" oder "arrows"

    Player(String colour, int points, String keys) {
        this.colour = colour;
        this.points = points;
        if (Objects.equals(keys, "wasd")) {   // d.h. wenn "wasd" angegeben wird hat der Spieler wasd
            this.keyUp = VK_W;
            this.keyDown = VK_S;
            this.keyLeft = VK_A;
            this.keyRight = VK_D;
        }
        if (Objects.equals(keys, "arrows")) {  // d.h. wenn "arrows" angegeben wird hat der Spieler die Pfeiltasten
            this.keyUp = VK_UP;
            this.keyDown = VK_DOWN;
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

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
