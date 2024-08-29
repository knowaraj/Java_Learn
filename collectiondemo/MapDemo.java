package collectiondemo;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("A", 65);
        myMap.put("B", 66);
        myMap.put("C", 67);
        myMap.put("A", 68);

        Set<String> keys = myMap.keySet();
        System.out.println(keys);
        Collection<Integer> values = myMap.values();
        System.out.println(values);

        for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
            System.out.println("Key = "+ entry.getKey() + " values = " + entry.getValue());
        }
    }
}
