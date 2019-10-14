import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * SortList
 */
public class SortList {

    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(12);
        arr.add(3);
        arr.add(30);
        arr.add(36);
        arr.add(31);
        arr.add(4);
        arr.add(7);

        Collections.sort(arr);

        for (Integer var : arr) {
            System.out.print(var+" ");
        }
        System.out.println("\n");
        HashSet<Integer> hs= new HashSet<>(Arrays.asList(1,2,4,5,6,6,8,10,7,8));
        ArrayList alist= new ArrayList<>(hs);
        Collections.sort(alist);
        System.out.println(alist+"\n");

        TreeSet<Integer> tset= new TreeSet<>(Arrays.asList(1,2,4,5,6,6,8,10,7,8));
        ArrayList alist1= new ArrayList<>(tset);
        Collections.sort(alist1);
        System.out.println(alist1+"\n");
    }
}