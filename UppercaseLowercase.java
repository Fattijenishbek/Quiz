import java.util.Scanner;

public class UppercaseLowercase {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String[] words = input.nextLine().trim().split(" ");
        for (String w : words){
            if (!w.isEmpty()){
                System.out.print(Character.toUpperCase(w.charAt(0)) + w.substring(1)+" ");
            }else {
                System.out.print(" ");}
        }
    }
}
