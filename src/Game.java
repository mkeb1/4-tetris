import java.awt.*;

public class Game {

    boolean win = false;
    boolean game;
    boolean startscreen;
    int[][] matrix;
    GUI gui;
    int currentPlayer;
    Player player1, player2;

    public Game() {
        player1 = new Player(Color.cyan, 0, "wasd", 1);
        player2 = new Player(Color.green, 0, "arrows", 2);
        gui = new GUI(this);
        gui.startScreen();
        currentPlayer = 1;
        routine();

    }

    public void routine() {
        while(true) {
            if (game) {
                gui.addPiece(Color.red, randomXPosition(), -10);
                long timeStart = System.currentTimeMillis();
                while (gui.getDrawCircle().getY(gui.getDrawCircle().getnPieces() - 1) <= 980) {
                    if (System.currentTimeMillis() - timeStart >= 1000) {
                        gui.getDrawCircle().moveY(100);
                        timeStart = System.currentTimeMillis();
                    }
                }
                gui.addPiece(Color.GREEN, randomXPosition(), -10);
                while (gui.getDrawCircle().getY(gui.getDrawCircle().getnPieces() - 1) <= 980) {
                    if (System.currentTimeMillis() - timeStart >= 1000) {
                        gui.getDrawCircle().moveY(100);
                        timeStart = System.currentTimeMillis();
                    }
                }
            }
        }
    }

    public Game(int fürTest) {
        player1 = new Player(Color.cyan, 0, "wasd", 1);
        player2 = new Player(Color.green, 0, "arrows", 2);
        win = false;
        gui = new GUI(this);
        matrix = new int[9][7];

        while (!win) {
            check(player1.getPlayernumber());
            check(player2.getPlayernumber());
        }
    }

    public void check(int player) {
        for (int i = 1; i < 9; i++) {
            for (int g = 1; g < 4; g++) {
                if (checkVertical(i, g, player)) {
                    win = true;
                    win(player);
                }
            }
        }
        for (int i = 1; i < 6; i++) {
            for (int g = 1; g < 7; g++) {
                if (checkHorizontal(i, g, player)) {
                    win = true;
                    win(player);
                }
            }
        }
        for (int i = 1; i < 6; i++) {
            for (int g = 1; g < 4; g++) {
                if (checkDiagonalUp(i, g, player)) {
                    win = true;
                    win(player);
                }
            }
        }
        for (int i = 1; i < 6; i++) {
            for (int g = 4; g < 7; g++) {
                if (checkDiagonalDown(i, g, player)) {
                    win = true;
                    win(player);
                }
            }
        }

    }

    public boolean checkVertical(int x, int y, int player) {
        if (matrix[x][y] == player && matrix[x][y + 1] == player && matrix[x][y + 2] == player && matrix[x][y + 3] == player) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkHorizontal(int x, int y, int player) {
        if (matrix[x][y] == player && matrix[x + 1][y] == player && matrix[x + 2][y] == player && matrix[x + 3][y] == player) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkDiagonalDown(int x, int y, int player) {
        if (matrix[x][y] == player && matrix[x + 1][y - 1] == player && matrix[x + 2][y - 2] == player && matrix[x + 3][y - 3] == player) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkDiagonalUp(int x, int y, int player) {
        if (matrix[x][y] == player && matrix[x + 1][y + 1] == player && matrix[x + 2][y + 2] == player && matrix[x + 3][y + 3] == player) {
            return true;
        } else {
            return false;
        }
    }

    public void win(int player) {

    }


    public int randomXPosition() {
        int place = (int) (Math.random() * 9) + 1;
        switch (place) {
            case 1:
                return 520;
            case 2:
                return 620;
            case 3:
                return 720;
            case 4:
                return 820;
            case 5:
                return 920;
            case 6:
                return 1020;
            case 7:
                return 1120;
            case 8:
                return 1220;
            case 9:
                return 1320;
            default:
                return 0;
        }
    }

    public boolean isGame() {
        return game;
    }

    public void setGame(boolean game) {
        this.game = game;
    }

    public boolean isStartscreen() {
        return startscreen;
    }

    public void setStartscreen(boolean startscreen) {
        this.startscreen = startscreen;
    }
}
