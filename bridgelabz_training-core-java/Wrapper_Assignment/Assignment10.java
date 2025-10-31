import java.util.ArrayList;
public class Assignment10 {
    public static void main(String[] args) {
        int size = 1000000;
        long start, end;
        int[] arr = new int[size];
        ArrayList<Integer> list = new ArrayList<>();
        start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) arr[i] = i;
        long sum1 = 0;
        for (int n : arr) sum1 += n;
        end = System.currentTimeMillis();
        System.out.println("int[] time: " + (end - start) + " ms");
        
        start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) list.add(i);
        long sum2 = 0;
        for (int n : list) sum2 += n;
        end = System.currentTimeMillis();
        System.out.println("ArrayList<Integer> time: " + (end - start) + " ms");
    }
}