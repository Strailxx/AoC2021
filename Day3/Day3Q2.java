package Day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day3Q2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        String file = "src/Day3/input.txt";
        File inFile = new File(file);
        Scanner input = new Scanner(inFile);
        ArrayList<String> list = new ArrayList<>();


        // Adding all input values to a base list
        while(input.hasNext()){
            list.add(input.nextLine());
        }

        String[] strArr = new String[0];
        ArrayList<String> oxygen = new ArrayList<>(list);
        ArrayList<String> co2 = new ArrayList<>(list);

        //OXYGEN
        for (int k = 0; k < oxygen.get(0).length(); k++) {
            int[] oneArray = new int[12];
            int[] zeroArray = new int[12];
            for (int i = 0; i < oxygen.size(); i++) {
                strArr = oxygen.get(i).split("(?!^)");
                for (int j = 0; j < 12; j++) {
                    if (strArr[j].equalsIgnoreCase("0")) {
                        zeroArray[j] = zeroArray[j] + 1;
                    } else {
                        oneArray[j] = oneArray[j] + 1;
                    }
                }
            }

            String oxygenMax = "";
            for (int i = 0; i < zeroArray.length; i++) {
                if (zeroArray[i] == oneArray[i]) {
                    oxygenMax = oxygenMax + "1";
                } else if (zeroArray[i] > oneArray[i]) {
                    oxygenMax = oxygenMax + "0";
                } else {
                    oxygenMax = oxygenMax + "1";
                }
            }

            if(oxygenMax.charAt(k) == '0'){
                for (int j = oxygen.size() -1; j > -1; j--) {
                    if (oxygen.size() == 1){
                        continue;
                    }
                    if (oxygen.get(j).charAt(k) == '1'){
                        oxygen.remove(j);
                    }
                }
            }
            else{
                for (int j = oxygen.size() -1; j > -1; j--) {
                    if (oxygen.size() == 1){
                        continue;
                    }
                    if (oxygen.get(j).charAt(k) == '0'){
                        oxygen.remove(j);
                    }
                }
            }
        }

        //CO2
        for (int k = 0; k < co2.get(0).length(); k++) {
            int[] oneArray = new int[12];
            int[] zeroArray = new int[12];
            for (int i = 0; i < co2.size(); i++) {
                strArr = co2.get(i).split("(?!^)");
                for (int j = 0; j < 12; j++) {
                    if (strArr[j].equalsIgnoreCase("0")) {
                        zeroArray[j] = zeroArray[j] + 1;
                    } else {
                        oneArray[j] = oneArray[j] + 1;
                    }
                }
            }

            String co2Max = "";
            for (int i = 0; i < zeroArray.length; i++) {
                if (zeroArray[i] == oneArray[i]) {
                    co2Max = co2Max + "0";
                } else if (zeroArray[i] > oneArray[i]) {
                    co2Max = co2Max + "1";
                } else {
                    co2Max = co2Max + "0";
                }
            }

            if(co2Max.charAt(k) == '0'){
                for (int j = co2.size() -1; j > -1; j--) {
                    if (co2.size() == 1){
                        continue;
                    }
                    if (co2.get(j).charAt(k) == '1'){
                        co2.remove(j);
                    }
                }
            }
            else{
                for (int j = co2.size() -1; j > -1; j--) {
                    if (co2.size() == 1){
                        continue;
                    }
                    if (co2.get(j).charAt(k) == '0'){
                        co2.remove(j);
                    }
                }
            }
        }

        System.out.println("Oxygen: " + oxygen);
        System.out.println("Co2: " + co2);

        int oxygenInt = Integer.parseInt(oxygen.get(0), 2);
        int co2Int = Integer.parseInt(co2.get(0), 2);
        System.out.println("Life Support: " + oxygenInt*co2Int);
    }
}
