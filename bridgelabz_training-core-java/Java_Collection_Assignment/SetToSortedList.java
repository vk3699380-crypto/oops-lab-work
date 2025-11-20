package Bridgelabz.Java_Collection_Assignment;
import java.util.*;

public class SetToSortedList {
    public static void main(String[] args) {
        Set<Integer> set = Set.of(5,3,9,1);
        List<Integer> sorted = new ArrayList<>(set);
        Collections.sort(sorted);
        System.out.println(sorted);
    }
}

