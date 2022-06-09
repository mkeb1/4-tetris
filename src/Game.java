import java.awt.*;

public class Game {

    boolean win;
    boolean game;
    int [][] matrix;
    GUI gui;
    int nPieces = 0;
    int currentPlayer;
    Player player1, player2;

    public Game() {
        player1 = new Player(Color.cyan,0,"wasd",1);
        player2 = new Player(Color.green,0,"arrows",2);
        gui = new GUI(this);
        gui.startScreen();
        currentPlayer = 2;

    }

    public Game(int fürTest) {
        player1 = new Player(Color.cyan,0,"wasd",1);
        player2 = new Player(Color.green,0,"arrows",2);
        win = false;
        gui = new GUI(this);
        matrix = new int [9] [7];

        while (!win) {
            check(player1.getPlayernumber());
            check(player2.getPlayernumber());
        }
    }

    public void check(int player){
        for(int i=1;i<9;i++) {
            for(int g=1;g<4;g++) {
                if(checkVertical(i, g, player)) {
                    win = true;
                    win(player);
                }
            }
        }
        for(int i=1;i<6;i++) {
            for(int g=1;g<7;g++) {
                if(checkHorizontal(i, g, player)) {
                    win = true;
                    win(player);
                }
            }
        }
        for(int i=1;i<6;i++) {
            for(int g=1;g<4;g++) {
                if(checkDiagonalUp(i, g, player)) {
                    win = true;
                    win(player);
                }
            }
        }
        for(int i=1;i<6;i++) {
            for(int g=4;g<7;g++) {
                if(checkDiagonalDown(i, g, player)) {
                    win = true;
                    win(player);
                }
            }
        }

    }

    public boolean checkVertical(int x, int y, int player){
        if(matrix[x][y] == player && matrix[x][y+1] == player && matrix[x][y+2] == player && matrix[x][y+3] == player){return true;}
        else {return false;}
    }
    public boolean checkHorizontal(int x, int y, int player) {
        if(matrix[x][y] == player && matrix[x+1][y] == player && matrix[x+2][y] == player && matrix[x+3][y] == player){return true;}
        else {return false;}
    }
    public boolean checkDiagonalDown(int x, int y, int player) {
        if(matrix[x][y] == player && matrix[x+1][y-1] == player && matrix[x+2][y-2] == player && matrix[x+3][y-3] == player){return true;}
        else {return false;}
    }
    public boolean checkDiagonalUp(int x, int y,int player) {
        if(matrix[x][y] == player && matrix[x+1][y+1] == player && matrix[x+2][y+2] == player && matrix[x+3][y+3] == player){return true;}
        else {return false;}
    }

    public void win(int player){

    }

    public void spawnPiece() {
        System.out.println( nPieces);
        nPieces = nPieces + 1;
        gui.getDrawCircle().setnPieces(nPieces);
        if(currentPlayer == 1) {
            gui.addPiece(player1.getColour(), randomXPosition(), 10);
        }else if(currentPlayer ==2) {
            gui.addPiece(player2.getColour(), randomXPosition(), 10);

        }
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
}
