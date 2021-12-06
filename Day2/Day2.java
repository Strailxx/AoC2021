package Day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        String file = "src/Day2/input.txt";
        File inFile = new File(file);
        Scanner input = new Scanner(inFile);

        int x= 0, y= 0, aim = 0;
        while (input.hasNext()){
            String string = input.next();
            if(string.equalsIgnoreCase("forward")){
                int intInput = input.nextInt();
                x = x + intInput;
                y = y + aim * intInput;
            }
            else if(string.equalsIgnoreCase("down")){
                aim = aim + input.nextInt();
            }
            else if(string.equalsIgnoreCase("up")){
                aim = aim - input.nextInt();
            }
        }
        System.out.println(x*y);
    }
}
