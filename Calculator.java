package week7;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        try{
            String [] arr=input.nextLine().trim().split(" ");
            if(arr[1].equals("+")){
                System.out.println(Integer.parseInt(arr[0])+Integer.parseInt(arr[2]));
            }else if(arr[1].equals("-")){
                System.out.println(Integer.parseInt(arr[0])-Integer.parseInt(arr[2]));
            }else if(arr[1].equals("*")) {
                System.out.println(Integer.parseInt(arr[0]) * Integer.parseInt(arr[2]));
            }else if(arr[1].equals("%")) {
                System.out.println(Integer.parseInt(arr[0]) % Integer.parseInt(arr[2]));
            }else if(arr[1].equals("/")){
                System.out.println(Integer.parseInt(arr[0])/Integer.parseInt(arr[2]));}
        }catch (Exception e){
            System.out.println("Error");
        }
    }
}
