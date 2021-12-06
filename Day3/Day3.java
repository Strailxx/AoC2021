package Day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day3 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        String file = "src/Day3/input.txt";
        File inFile = new File(file);
        Scanner input = new Scanner(inFile);
        ArrayList<String> list = new ArrayList<>();
        int[] oneArray = new int[12];
        int[] zeroArray = new int[12];

        while(input.hasNext()){
            list.add(input.nextLine());
        }

        String[] strArr = new String[0];

        for (int i = 0; i < list.size(); i++) {
            strArr = list.get(i).split("(?!^)");
            for (int j = 0; j < 12; j++) {
                if (strArr[j].equalsIgnoreCase("0")){
                    zeroArray[j] = zeroArray[j] + 1;
                }
                else{
                    oneArray[j] = oneArray[j] + 1;
                }
            }
        }

        String finalGamma = "";
        String epsilon = "";
        for (int i = 0; i < zeroArray.length; i++) {
            if (zeroArray[i] > oneArray[i]){
                finalGamma = finalGamma + "0";
                epsilon = epsilon + "1";
            }
            else{
                finalGamma = finalGamma + "1";
                epsilon = epsilon + "0";
            }
        }

        int decimalGamma = Integer.parseInt(finalGamma, 2);
        int decimalEpsilon = Integer.parseInt(epsilon, 2);

        System.out.println(finalGamma);
        System.out.println(decimalGamma);
        System.out.println(epsilon);
        System.out.println(decimalEpsilon);
        System.out.println(decimalGamma*decimalEpsilon);


    }
}
