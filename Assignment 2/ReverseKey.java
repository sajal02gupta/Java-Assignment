import java.util.TreeMap;
public class ReverseKey {

    public static void main(String[] args) {
        TreeMap<Integer, String> tMap= new TreeMap<>();
        tMap.put(1, "Apple");
        tMap.put(2, "Banana");
        tMap.put(3, "Grapes");
        tMap.put(4, "Orange");

        System.out.println(tMap.descendingKeySet());

        //Write a Java program to get the portion of a map whose keys are strictly less than a given key.
        System.out.println(tMap.headMap(4));
        // Write a Java program to get the portion of a map whose keys range from a given key (inclusive), to another key (exclusive).
        System.out.println(tMap.subMap(2,4));
    }
}