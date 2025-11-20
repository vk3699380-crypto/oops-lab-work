package Bridgelabz.Java_Collection_Assignment;
import java.util.*;

public class BinaryGenerator {
    public static List<String> generate(int n) {
        List<String> result = new ArrayList<>();
        Queue<String> q = new LinkedList<>();

        q.add("1");

        while (n-- > 0) {
            String s = q.remove();
            result.add(s);

            q.add(s + "0");
            q.add(s + "1");
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(generate(5));
    }
}

