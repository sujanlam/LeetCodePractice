package leetcode50;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMaps {
    public static void main(String[] args) {
        // Creating a TreeMap with a custom comparator (reverse order)
        Map<String, Integer> sortedMapDesc = new TreeMap<>(Comparator.reverseOrder());
        Map<String, Integer> sortedMap = new TreeMap<>();
        // Adding entries to the TreeMap
        sortedMap.put("Apple", 3);
        sortedMap.put("Banana", 2);
        sortedMap.put("Orange", 5);
        sortedMap.put("Grapes", 4);

        // Printing the TreeMap
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
