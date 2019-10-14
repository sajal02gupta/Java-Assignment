import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

class ArrAtFirst{
    public static void callHashSet() {
        HashSet<Integer> hs= new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(4);
        ArrayList<Integer> arr= new ArrayList<>(hs);
        arr.add(0,8);
        System.out.println(arr);
    }
    public static void callTreeSet() {
        TreeSet<Integer> hs= new TreeSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(4);
        ArrayList<Integer> arr= new ArrayList<>(hs);
        arr.add(0,8);
        System.out.println(arr);
    }


    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(0, 4);
        for(Integer a: arr){
            System.out.println(a);
        }
        callHashSet();
        callTreeSet();
    }
}