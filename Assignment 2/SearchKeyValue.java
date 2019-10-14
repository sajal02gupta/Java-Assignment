import java.util.Scanner;
import java.util.TreeMap;

/**
 * SearchKeyValue
 */
public class SearchKeyValue {

    public static void main(String[] args) {
        TreeMap<Integer, String> tmap= new TreeMap<>();
        tmap.put(1, "Red");
        tmap.put(2, "Blue");
        tmap.put(3, "Green");
        tmap.put(4, "Violet");

        Scanner scanner= new Scanner(System.in);
        int a= scanner.nextInt();
        if(tmap.containsKey(a)){
            System.out.println("Present");
        }else{
            System.out.println("Not Present");
        }
        String s= scanner.next();
        if (tmap.containsValue(s)) {
            System.out.println("Present");
        } else {
            System.out.println("Not present");
        }
    }
}