package week7;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        try{
            int num=input.nextInt();
            String num1=String.valueOf(num);
            String num2=num1+num1;
            String num3=num1+num1+num1;
            System.out.println(num1+" + "+num2+" + "+num2+" = "+(Integer.parseInt(num2)+Integer.parseInt(num3)+num));
        }catch (Exception e){
            System.out.println("error");
        }
    }
}
