import java.util.Scanner;

public class WordStars {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String[] words = input.nextLine().trim().split(" ");
        String str;
        int counter =1;
        for (String w : words){
            str = "";
            for (int i = 0; i < w.length(); i++) {
                str +="*";
            }
            System.out.printf("%d %d : %s\n", counter, w.length(), str);
            counter++;
        }
    }
}
