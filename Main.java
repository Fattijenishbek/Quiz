public class Main {
    public static void main(String[] args) {
        Animal turtle = new Animal(step -> System.out.println("step="+step));
        
        turtle.move();

    }
}
