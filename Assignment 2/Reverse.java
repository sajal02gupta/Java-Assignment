import java.util.ArrayList;
import java.util.Collections;

/**
 * Reverse
 */
public class Reverse {

    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(2);
        arr.add(22);
        arr.add(1);
        arr.add(24);
        arr.add(6);
        arr.add(21);
        arr.add(12);

        Collections.reverse(arr);

        for (Integer var : arr) {
            System.out.print(var+" ");
        }
    }
}