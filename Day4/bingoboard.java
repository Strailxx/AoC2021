package Day4;

public class bingoboard {
    int[][] bingoboard;
    public bingoboard() {
        bingoboard = new int[5][5];
    }

    public void setBoard(int[][] board){
        bingoboard = board;
    }

    public void checkBoard(int check){
        for (int i = 0; i < bingoboard.length; i++) {
            for (int j = 0; j < bingoboard[i].length; j++) {
                if(bingoboard[i][j] == check){
                    // setting as marked
                    bingoboard[i][j] = -1;
                }
            }
        }
    }

    public boolean completion(){
        for (int i = 0; i < bingoboard.length; i++) {
            for (int j = 0; j < bingoboard[i].length; j++) {
                if((bingoboard[i][0] == -1 && bingoboard[i][1] == -1 && bingoboard[i][2] == -1 && bingoboard[i][3] == -1 && bingoboard[i][4] == -1) ||
                        (bingoboard[0][j] == -1 && bingoboard[1][j] == -1 && bingoboard[2][j] == -1 && bingoboard[3][j] == -1 && bingoboard[4][j] == -1)){
                    return true;
                }
            }
        }
        return false;
    }

    public int sumOfUnmarked(){
        int sum = 0;
        for (int i = 0; i < bingoboard.length; i++) {
            for (int j = 0; j < bingoboard[i].length; j++) {
                if(bingoboard[i][j] > -1){
                    sum = sum + bingoboard[i][j];
                }
            }
        }
        return sum;
    }

}
