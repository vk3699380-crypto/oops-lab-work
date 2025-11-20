package Bridgelabz.Java_Collection_Assignment;
import java.util.*;
public class ReverseList {
    public static <T> void reverse(List<T> list) {
        int i = 0, j = list.size() - 1;
        while (i < j) {
            T temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(List.of(1,2,3,4,5));
        List<Integer> link = new LinkedList<>(List.of(1,2,3,4,5));
        reverse(arr);
        reverse(link);
        System.out.println(arr);
        System.out.println(link);
    }
}

