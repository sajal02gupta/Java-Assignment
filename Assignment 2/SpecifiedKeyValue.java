import java.util.Map;
import java.util.TreeMap;

import javafx.beans.binding.IntegerExpression;

/**
 * SpecifiedKeyValue
 */
public class SpecifiedKeyValue {

    public static void main(String[] args) {
        TreeMap<Integer, String> tMap= new TreeMap<>();
        tMap.put(1, "Apple");
        tMap.put(2, "Banana");
        tMap.put(3, "Grapes");
        tMap.put(4, "Orange");

        for(Map.Entry<Integer, String> entry: tMap.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}