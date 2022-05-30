public class Game {

    int matrix [] [];
    public Game() {
        matrix = new int [9] [7];
    }

    public void checkAll(int player){
        for(int i=1;i<9;i++) {
        }
    }
    public boolean check(int x, int y, int player) {
        if(checkVertical(x, y, player) == true){
            return true;}
        else if(checkHorizontal(x, y, player) == true){
            return true;}
        else if(checkDiagonalDown(x, y, player) == true){
            return true;}
        else if(checkDiagonalUp(x, y, player) == true){
            return true;}
        else{return false;}
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

    }
