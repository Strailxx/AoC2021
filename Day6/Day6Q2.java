package Day6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day6Q2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        String file = "src/Day6/input.txt";
        File inFile = new File(file);
        Scanner input = new Scanner(inFile);
        long[] arrOfAges = new long[9];

        while(input.hasNext()){
            int i = input.nextInt();
            arrOfAges[i] = arrOfAges[i] + 1;
        }

        for (int i = 0; i < 256; i++) {
            long zero = arrOfAges[0];
            for (int j = 1 ; j < arrOfAges.length; j++) {
                arrOfAges[j-1] = arrOfAges[j];
            }
            arrOfAges[8] = 0;
            arrOfAges[6] = arrOfAges[6] + zero;
            arrOfAges[8] = arrOfAges[8] + zero;
        }

        long count = 0;
        for (int i = 0; i < arrOfAges.length; i++) {
            count += arrOfAges[i];
        }

        System.out.println(count);
    }
}
