package Bridgelabz.Java_Collection_Assignment;
import java.util.*;

public class NthFromEnd {
    public static <T> T getNthFromEnd(LinkedList<T> list, int n) {
        Iterator<T> fast = list.iterator();
        Iterator<T> slow = list.iterator();

        for (int i = 0; i < n; i++) {
            fast.next();
        }

        while (fast.hasNext()) {
            fast.next();
            slow.next();
        }

        return slow.next();
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(List.of("A","B","C","D","E"));
        System.out.println(getNthFromEnd(list, 2));  // D
    }
}

