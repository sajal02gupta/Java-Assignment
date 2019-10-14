import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Arrays;

/**
 * Shuffle
 */
public class Shuffle {

    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(2);
        arr.add(22);
        arr.add(1);
        arr.add(24);
        arr.add(6);
        arr.add(21);
        arr.add(12);
        
        Collections.shuffle(arr);
        
        for (Integer Ir : arr) {
            System.out.print(Ir+" ");
        }
        System.out.println("\n");
        HashSet<Integer> hs= new HashSet<>(Arrays.asList(1,2,4,5,6,6,8,10,7,8));
        ArrayList alist= new ArrayList<>(hs);
        Collections.shuffle(alist);
        System.out.println(alist+"\n");

        TreeSet<Integer> tset= new TreeSet<>(Arrays.asList(1,2,4,5,6,6,8,10,7,8));
        ArrayList alist1= new ArrayList<>(tset);
        Collections.shuffle(alist1);
        System.out.println(alist1+"\n");
    }
}