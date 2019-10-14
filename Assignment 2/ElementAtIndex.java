import java.util.ArrayList;
import java.util.Scanner;

/**
 * ElementAtIndex
 */
public class ElementAtIndex {

    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(4);
        arr.add(5);

        Scanner scanner= new Scanner(System.in);
        int a= scanner.nextInt();

        System.out.println(arr.get(a));
    }
}