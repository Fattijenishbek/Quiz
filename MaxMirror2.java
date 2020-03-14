package week6;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxMirror2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] var = input.nextLine().trim().split(" ");
        ArrayList intArray = new ArrayList<>();

        for(int i = 0; i < var.length; i++) {
            intArray.add(Integer.parseInt(var[i]));
        }

        int counter = 0;

        for(int j = 0; j < intArray.size(); j++) {
            for(int c = intArray.size()-1; c > j; c--) {
                if (intArray.get(j) == intArray.get(c)) {

                    if (intArray.get(j+1) == intArray.get(c-1)) {
                        counter++;
                        intArray.remove(c);
                        break;
                    }
                    else{
                        counter++;
                        intArray.remove(c);
                        intArray.remove(j);
                        break;
                    }
                }
//
//
// }
            }
        }
        System.out.println("This is " + counter);



    }
}