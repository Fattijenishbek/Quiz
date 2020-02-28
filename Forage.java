import java.util.ArrayList;

public class Forage {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(12);
        arr.add(2325);

        for(Integer i : arr){
            System.out.println(i);
        }
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));

        }
    }
}
