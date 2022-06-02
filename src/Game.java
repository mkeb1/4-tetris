import java.awt.*;

public class Game {

    boolean win;
    int [][] matrix;
    GUI gui;
    Player player1, player2;
    public Game() {
        player1 = new Player(Color.cyan,0,"wasd",1);
        player2 = new Player(Color.green,0,"arrows",2);
        win = false;
        gui = new GUI();
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

}
