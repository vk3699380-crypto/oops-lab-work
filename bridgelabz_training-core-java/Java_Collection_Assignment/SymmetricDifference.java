package Bridgelabz.Java_Collection_Assignment;
import java.util.*;

public class SymmetricDifference {
    public static void main(String[] args) {
        Set<Integer> a = new HashSet<>(List.of(1,2,3));
        Set<Integer> b = new HashSet<>(List.of(3,4,5));

        Set<Integer> result = new HashSet<>(a);
        result.addAll(b);

        Set<Integer> common = new HashSet<>(a);
        common.retainAll(b);

        result.removeAll(common);

        System.out.println(result);
    }
}

