import java.util.ArrayList;
import java.util.Objects;
public class Assignment9 {
    public static void main(String[] args) {
        String[] inputs = {"85", "95", "88", "null", "abc"};
        ArrayList<Integer> marks = new ArrayList<>();
        for (String s : inputs) {
            try {
                if (!s.equalsIgnoreCase("null")) marks.add(Integer.valueOf(s));
            } catch (Exception e) {}
        }
        int sum = marks.stream().filter(Objects::nonNull).mapToInt(Integer::intValue).sum();
        double avg = (double) sum / marks.size();
        System.out.println("Average marks: " + avg);
    }
}