import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;

/**
 * Retrieve
 */
public class Retrieve {
    public static void retrieveHashset() {
        HashSet<Integer> hs= new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        ArrayList aList= new ArrayList<>(hs);
        System.out.println(aList.get(aList.size()-1));
    }

    public static void main(String[] args) {
        LinkedList list= new LinkedList<>(Arrays.asList(1,3,5,7,8,9,9,3,2));
        System.out.println(list.get(list.size()-1));

        retrieveHashset();

    }
}