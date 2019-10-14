/**
 * TreeMapCopy
 */
import java.util.TreeMap;
import java.util.Map;

public class TreeMapCopy {

    public static void main(String[] args) {
        TreeMap<Integer, String> tMap= new TreeMap<>();
        tMap.put(1, "Apple");
        tMap.put(2, "Banana");
        tMap.put(3, "Grapes");
        tMap.put(4, "Orange");

        TreeMap<Integer, String> tmap1= new TreeMap<>(tMap);
        tmap1.putAll(tMap);
        for(Map.Entry<Integer, String> entry: tmap1.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}