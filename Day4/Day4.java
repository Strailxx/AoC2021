package Day4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Day4 {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner in = new Scanner(System.in);
        String file = "src/Day4/input.txt";
        File inFile = new File(file);
        Scanner input = new Scanner(inFile);

        ArrayList<bingoboard> list = new ArrayList<>();
        //creating boards
        while(input.hasNext()){
            int[][] board = new int[5][5];
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    board[i][j] = input.nextInt();
                }
            }
            bingoboard bingo = new bingoboard();
            bingo.setBoard(board);
            list.add(bingo);
        }
        String file2 = "src/Day4/drawnumber.txt";
        File inFile2 = new File(file2);
        Scanner input2 = new Scanner(inFile2);
        ArrayList<Integer> drawList = new ArrayList<>();
        //Draw number list
        while(input2.hasNext()){
            drawList.add(input2.nextInt());
        }

        //Checking Boards For Drew Number
        for (int i = 0; i < drawList.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                list.get(j).checkBoard(drawList.get(i));
            }
            for (int j = 0; j < list.size(); j++) {
                if(list.get(j).completion()){
                    System.out.println(list.get(j).sumOfUnmarked() * drawList.get(i));
                    return;
                }
            }
        }
    }
}
