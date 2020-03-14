package Quiz;

import java.util.Scanner;

public class WordLength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] sen=input.nextLine().split(" ");
        int c=1;
        for (String word:sen) {
            int wl=0;
            for (int i = 0; i <word.length() ; i++) {
                char ch=word.charAt(i);
                if (Character.isAlphabetic(ch)) wl++;
            }
            if (c==1){
            System.out.printf(" %d: %d ", c, wl);}
            else System.out.printf("%d: %d ", c, wl);
            for (int i = 0; i <wl ; i++) {
                System.out.print("*");
            }
            System.out.println();
            c++;
        }

    }
}
