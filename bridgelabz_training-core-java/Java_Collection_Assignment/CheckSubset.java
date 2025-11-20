package Bridgelabz.Java_Collection_Assignment;
import java.util.*;

public class CheckSubset {
    public static void main(String[] args) {
        Set<Integer> a = Set.of(2,3);
        Set<Integer> b = Set.of(1,2,3,4);

        System.out.println(b.containsAll(a));
    }
}

