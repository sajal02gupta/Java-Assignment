/**
 * GreatestKey
 */
import java.util.TreeMap;
import java.util.HashMap;
import java.util.Map;
public class GreatestKey {

    public static void main(String[] args) {

        TreeMap<Integer, String> tMap= new TreeMap<>();
        tMap.put(1, "Apple");
        tMap.put(5, "Banana");
        tMap.put(3, "Grapes");
        tMap.put(4, "Orange");

        System.out.println(tMap.firstEntry());
        System.out.println(tMap.lastEntry());
    }
}