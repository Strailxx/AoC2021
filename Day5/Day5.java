package Day5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Day5 {
    public static void main(String[] args) throws FileNotFoundException {
        int[][] arr = new int[1000][1000];

        Scanner in = new Scanner(System.in);
        String file = "src/Day5/input.txt";
        File inFile = new File(file);
        Scanner input = new Scanner(inFile);

        ArrayList<Integer> x1 = new ArrayList<>();
        ArrayList<Integer> y1 = new ArrayList<>();
        ArrayList<Integer> x2 = new ArrayList<>();
        ArrayList<Integer> y2 = new ArrayList<>();

        while(input.hasNext()){
            x1.add(input.nextInt());
            y1.add(input.nextInt());
            x2.add(input.nextInt());
            y2.add(input.nextInt());
        }

        for (int i = 0; i < x1.size(); i++) {
            if (Objects.equals(x1.get(i), x2.get(i))){
                int x1int = x1.get(i);
                int y1int = y1.get(i);
                int y2int = y2.get(i);
                while(y1int < y2int){
                    arr[y1int][x1int] = arr[y1int][x1int] + 1;
                    y1int++;
                }
                while(y1int > y2int){
                    arr[y1int][x1int] = arr[y1int][x1int] + 1;
                    y1int--;
                }
                arr[y1int][x1int] = arr[y1int][x1int] + 1;
                continue;
            }
            if (Objects.equals(y1.get(i), y2.get(i))){
                int y1int = y1.get(i);
                int x1int = x1.get(i);
                int x2int = x2.get(i);
                while(x1int < x2int){
                    arr[y1int][x1int] = arr[y1int][x1int] + 1;
                    x1int++;
                }
                while(x1int > x2int){
                    arr[y1int][x1int] = arr[y1int][x1int] + 1;
                    x1int--;
                }
                arr[y1int][x1int] = arr[y1int][x1int] + 1;
                continue;
            }
            if (x1.get(i) < x2.get(i) && y1.get(i) < y2.get(i)){
                int x1int = x1.get(i);
                int x2int = x2.get(i);
                int y1int = y1.get(i);

                while(x1int <= x2int){
                    arr[y1int][x1int] = arr[y1int][x1int] + 1;
                    x1int++;
                    y1int++;
                }
            }
            if (x1.get(i) < x2.get(i) && y1.get(i) > y2.get(i)){
                int x1int = x1.get(i);
                int x2int = x2.get(i);
                int y1int = y1.get(i);
                int y2int = y1.get(i);

                while(x1int <= x2int){
                    arr[y1int][x1int] = arr[y1int][x1int] + 1;
                    x1int++;
                    y1int--;
                }
            }
            if (x1.get(i) > x2.get(i) && y1.get(i) > y2.get(i)){
                int x1int = x1.get(i);
                int x2int = x2.get(i);
                int y1int = y1.get(i);
                int y2int = y1.get(i);

                while(x1int >= x2int){
                    arr[y1int][x1int] = arr[y1int][x1int] + 1;
                    x1int--;
                    y1int--;
                }
            }
            if (x1.get(i) > x2.get(i) && y1.get(i) < y2.get(i)){
                int x1int = x1.get(i);
                int x2int = x2.get(i);
                int y1int = y1.get(i);

                while(x1int >= x2int){
                    arr[y1int][x1int] = arr[y1int][x1int] + 1;
                    x1int--;
                    y1int++;
                }
            }

        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] >= 2){
                    count++;
                }
            }
        }

        System.out.println(count);



    }
}
