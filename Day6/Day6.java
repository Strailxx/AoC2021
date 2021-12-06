package Day6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day6 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        String file = "src/Day6/input.txt";
        File inFile = new File(file);
        Scanner input = new Scanner(inFile);
        ArrayList<Integer> listOfAges = new ArrayList<>();

        while(input.hasNext()){
            listOfAges.add(input.nextInt());
        }

        for (int i = 0; i < 80; i++) {
            int size = listOfAges.size();
            for (int j = 0; j < size; j++) {
                listOfAges.set(j, listOfAges.get(j) - 1);
                if(listOfAges.get(j) < 0){
                    listOfAges.set(j, 6);
                    listOfAges.add(8);
                }
            }
        }
        System.out.println(listOfAges.size());
    }
}
