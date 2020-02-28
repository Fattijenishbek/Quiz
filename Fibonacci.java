import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = Integer.parseInt(input.nextLine());
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(1);
        int fib =1;
        int sum = 0;
        while (fib <a){
            arr.add(fib);
            if (fib % 2==0){
                sum +=fib;
            }
            fib = arr.get(arr.size()-1) + arr.get(arr.size()-2);
        }
        System.out.println(sum);
        System.out.println(arr);
    }
}
