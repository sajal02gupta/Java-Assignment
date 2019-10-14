import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * LinkedListToArrayList
 */
public class LinkedListToArrayList {

    public static void main(String[] args) {
        LinkedList list= new LinkedList<>(Arrays.asList(1,3,45,76,8,9,4,5,7,8));

        ArrayList<Integer> ls= new ArrayList<>(list);
        System.out.print(ls);
    }
}