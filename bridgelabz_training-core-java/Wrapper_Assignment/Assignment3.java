import java.util.ArrayList;
public class Assignment3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) list.add(i);
        int sum = 0;
        for (int n : list) sum += n;
        System.out.println("Sum of numbers = " + sum);
    }
}