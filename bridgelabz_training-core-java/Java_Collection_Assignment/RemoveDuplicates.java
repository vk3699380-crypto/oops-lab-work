package Bridgelabz.Java_Collection_Assignment;
import java.util.*;

public class RemoveDuplicates {
    public static <T> List<T> removeDup(List<T> list) {
        Set<T> seen = new HashSet<>();
        List<T> result = new ArrayList<>();

        for (T item : list) {
            if (seen.add(item)) {
                result.add(item);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        List<Integer> list = List.of(3,1,2,2,3,4);
        System.out.println(removeDup(list));
    }
}

