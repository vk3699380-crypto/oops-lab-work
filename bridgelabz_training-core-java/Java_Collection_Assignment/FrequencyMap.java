package Bridgelabz.Java_Collection_Assignment;
import java.util.*;

public class FrequencyMap {
    public static Map<String, Integer> getFrequency(List<String> list) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : list) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        return map;
    }

    public static void main(String[] args) {
        List<String> items = List.of("apple", "banana", "apple", "orange");
        System.out.println(getFrequency(items));
    }
}

