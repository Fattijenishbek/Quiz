import java.util.Scanner;

public class Animal {
    Callback c;
    public  Animal(Callback c){
        this.c = c;
    }

    public void move(){
        Scanner s =new Scanner(System.in);
        while (true) {
            int g = Integer.parseInt(s.nextLine());
            if (g == 0) {break;}
            c.move(g);

        }
    }
}
