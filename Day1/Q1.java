package Day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        String file = "src/Day1/input.txt";
        File inFile = new File(file);
        Scanner input = new Scanner(inFile);

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> sumList = new ArrayList<>();
        while(input.hasNext()){
            list.add(input.nextInt());
        }

        for (int i = 0; i < list.size()-2 ; i++) {
            int sum = list.get(i) + list.get(i + 1) + list.get(i + 2);
            sumList.add(sum);
        }

        int count = 0;
        for (int i = 1; i < sumList.size(); i++) {
            if(sumList.get(i) > sumList.get(i-1)){
                count++;
            }
        }

        System.out.println(count);
    }
}
