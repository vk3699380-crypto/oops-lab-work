package Bridgelabz.Java_Collection_Assignment;
import java.util.*;

public class SetUnionIntersection {
    public static void main(String[] args) {
        Set<Integer> a = new HashSet<>(List.of(1,2,3));
        Set<Integer> b = new HashSet<>(List.of(3,4,5));

        Set<Integer> union = new HashSet<>(a);
        union.addAll(b);

        Set<Integer> intersection = new HashSet<>(a);
        intersection.retainAll(b);

        System.out.println(union);
        System.out.println(intersection);
    }
}

