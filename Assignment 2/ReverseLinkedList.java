import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

/**
 * ReverseLinkedList
 */
public class ReverseLinkedList {

    public static void main(String[] args) {
        LinkedList list= new LinkedList<>(Arrays.asList(1,2,4,6,7,8,90,8));

        Collections.reverse(list);
        System.out.println(list);
    }
}