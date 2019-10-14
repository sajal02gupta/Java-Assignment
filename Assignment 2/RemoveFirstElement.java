import java.util.Arrays;
import java.util.LinkedList;

/**
 * RemoveFirstElement
 */
public class RemoveFirstElement {

    public static void main(String[] args) {
        LinkedList<Integer> list= new LinkedList<>(Arrays.asList(1,24,5,6));
        int i=list.removeFirst();
        System.out.println(list);
    }
}