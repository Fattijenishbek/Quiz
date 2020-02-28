import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String words =input.nextLine();

        int[] res = new int[4];

        for (int i = 0; i < words.length(); i++) {
            char k =words.charAt(i);
            if (k == ' '){
                res[2]++;
            }else  if (Character.isDigit(k)){
                res[0]++;
            }else  if (Character.isAlphabetic(k)){
                res[1]++;
            }else {
                res[3]++;
            }


        }
        System.out.printf("number = %d \nalphabet = %d \nspaces = %d \nelse = %d", res[0], res[1], res[2], res[3]);
    }
}
