import java.awt.*;

public class Game {

    boolean win = false;
    boolean startscreen, game, endscreen;
    int[][] matrix;
    int[][] fieldCoordsX, fieldCoordsY;
    GUI gui;
    int currentPlayer;
    Player player1, player2;

    public Game() {
        player1 = new Player(Color.cyan, 0, "wasd", 1);
        player2 = new Player(Color.green, 0, "arrows", 2);

        fieldCoordsX = new int[9][7];
        fieldCoordsY = new int[9][7];
        setFieldCoords();

        matrix = new int[9][7];

        gui = new GUI(this);
        gui.startScreen();
        currentPlayer = 1;
        routine();

    }

    public void routine() {
        while(!win) {
            if (game) {
                int r, z;
                long timeStart = System.currentTimeMillis();

                currentPlayer = 1; // aktuellen Spieler setzen
                gui.addPiece(player1.getColour(), randomXPosition(), -10); // Piece hinzufügen
                z = 0;
                r = 0;
                while (gui.getDrawCircle().getY(gui.getDrawCircle().getnPieces() - 1) <= 980) { //Piece kann nur bis ins untere Feld geschoben werden
                    if (System.currentTimeMillis() - timeStart >= 1000) { //alle T nach unten moven
                        if(gui.getDrawCircle().getY(gui.getDrawCircle().getnPieces() - 1) == 390) { //xPos holen wenn man nicht mehr moven kann
                            for(int i = 0; i<9; i++) {
                                if(fieldCoordsX [i][0] == gui.getDrawCircle().getX(gui.getDrawCircle().getnPieces()-1)) {
                                    z= i;
                                    break;
                                }
                            }
                        }

                        if(gui.getDrawCircle().getY(gui.getDrawCircle().getnPieces() - 1) >= 390) { // Moven wenn in Raster
                            System.out.println(matrix[z][r+1]);
                            if (matrix[z][r+1] == 0) { //überprüfen ob Feld frei
                                gui.getDrawCircle().moveY(100);
                                if((gui.getDrawCircle().getY(gui.getDrawCircle().getnPieces() - 1) == 990)) { //Wenn ganz unten dann Feld belegt von currentPlayer gesetzt
                                    matrix[z][r+1] = currentPlayer;
                                }
                                r++;
                            } else { //Wenn Feld nicht frei, dann bleibt Piece
                                matrix[z][r] = currentPlayer; //Feld wird auf belegt von currentPlayer gesetzt
                                break;
                            }
                        }
                        if(gui.getDrawCircle().getY(gui.getDrawCircle().getnPieces() - 1) <= 290) { //Moven wenn noch nicht in Raster
                            gui.getDrawCircle().moveY(100);
                        }

                        timeStart = System.currentTimeMillis();

                    }
                }
                check(player1.getPlayernumber());

                currentPlayer = 2; // aktuellen Spieler setzen
                gui.addPiece(player2.getColour(), randomXPosition(), -10); // Piece hinzufügen
                z = 0;
                r = 0;
                while (gui.getDrawCircle().getY(gui.getDrawCircle().getnPieces() - 1) <= 980) { //Piece kann nur bis ins untere Feld geschoben werden
                    if (System.currentTimeMillis() - timeStart >= 1000) { //alle T nach unten moven
                        if(gui.getDrawCircle().getY(gui.getDrawCircle().getnPieces() - 1) == 390) { //xPos holen wenn man nicht mehr moven kann
                            for(int i = 0; i<9; i++) {
                                if(fieldCoordsX [i][0] == gui.getDrawCircle().getX(gui.getDrawCircle().getnPieces()-1)) {
                                    z= i;
                                    break;
                                }
                            }
                        }

                        if(gui.getDrawCircle().getY(gui.getDrawCircle().getnPieces() - 1) >= 390) { // Moven wenn in Raster
                            System.out.println(matrix[z][r+1]);
                            if (matrix[z][r+1] == 0) { //überprüfen ob Feld frei
                                gui.getDrawCircle().moveY(100);
                                if((gui.getDrawCircle().getY(gui.getDrawCircle().getnPieces() - 1) == 990)) { //Wenn ganz unten dann Feld belegt von currentPlayer gesetzt
                                    matrix[z][r+1] = currentPlayer;
                                }
                                r++;
                            } else { //Wenn Feld nicht frei, dann bleibt Piece
                                matrix[z][r] = currentPlayer; //Feld wird auf belegt von currentPlayer gesetzt
                                      break;
                            }
                        }
                        if(gui.getDrawCircle().getY(gui.getDrawCircle().getnPieces() - 1) <= 290) { //Moven wenn noch nicht in Raster
                            gui.getDrawCircle().moveY(100);
                        }
                        timeStart = System.currentTimeMillis();

                    }
                }
                check(player2.getPlayernumber());
            }
        }
    }

    /*public Game(int fürTest) {
        player1 = new Player(Color.cyan, 0, "wasd", 1);
        player2 = new Player(Color.green, 0, "arrows", 2);
        win = false;
        gui = new GUI(this);
        matrix = new int[9][7];

        while (!win) {
            check(player1.getPlayernumber());
            check(player2.getPlayernumber());
        }
    }*/

    public void check(int player) {       // hier hatte ich nicht ganz verstanden warum der player ein int ist bzw wo das int herkommt? -megan
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
        gui.jf.dispose();
        gui.endScreen(player);
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

    public void setFieldCoords() {
        int x = 420;
        int y = 290;
        for(int i = 0; i<7; i++) {
            x= 420;
            for(int h = 0; h<9; h++) {
                x = x + 100;
                fieldCoordsX[h][i] = x;
                //System.out.println(fieldCoordsX[h][i]);
            }
        }
        for(int i = 0; i<9; i++) {
            y = 290;
            for(int h = 0; h<7; h++) {
                y = y +100;
                fieldCoordsY[i][h] = y;
                //System.out.println(fieldCoordsY[i][h]);
            }
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

    public boolean isEndscreen() { return endscreen; }

    public void setEndscreen(boolean endscreen) {
        this.endscreen = endscreen;
    }


}
