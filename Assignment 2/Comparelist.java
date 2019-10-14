import java.util.ArrayList;
import java.util.Arrays;

/**
 * Comparelist
 */
public class Comparelist {

    public static void main(String[] args) {
        ArrayList<Integer> arr1= new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer> arr2= new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer> arr3= new ArrayList<>(Arrays.asList(1,2,3,4,6));

        boolean bool1= arr1.equals(arr2);
        boolean bool2= arr1.equals(arr3);

        System.out.println(bool1+ " "+bool2);
    }
}