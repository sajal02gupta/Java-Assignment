import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * AppendatLast
 */
public class AppendatLast {

    public static void main(String[] args) {
        List<Integer> list= new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Scanner scanner= new Scanner(System.in);
        int val= scanner.nextInt();

        list.add(list.size(), val);

        for (Integer k : list) {
            System.out.println(k);
        }
    }
}