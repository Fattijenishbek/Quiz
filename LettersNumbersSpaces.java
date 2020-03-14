package Quiz;

import java.util.Scanner;

public class LettersNumbersSpaces {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s=input.nextLine();
        int [] arr = new int[4];

        for (int i = 0; i <s.length() ; i++) {
            char c = s.charAt(i);
            if ( c == ' '){
                arr[1]++;
            }else if(Character.isDigit(c)){
                arr[2]++;
            }else if(Character.isAlphabetic(c)){
                arr[0]++;
            }else arr[3]++;
        }

        System.out.printf("letter: %d%nspace: %d%nnumber: %d%nother: %d", arr[0],arr[1], arr[2], arr[3]);
    }
}
