import java.util.LinkedList;
import java.util.Scanner;

/**
 * IterateAtSpecific
 */
public class IterateAtSpecific {

    public static void main(String[] args) {

        LinkedList<Integer> list= new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(40);
        list.add(32);
        list.add(41);
        Scanner scanner = new Scanner(System.in);
        int a= scanner.nextInt();

        for (int i = a-1; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}