
import java.util.*;
public class StudentGradeTracker {
    public static void main(String[] args){
        Map<String,Double> map = new TreeMap<>();
        map.put("Ankit",85.0);
        map.put("Rohan",78.0);
        map.put("Priya",92.0);
        map.put("Rohan",80.0);
        map.remove("Priya");
        for(String k: map.keySet()){
            System.out.println(k+"="+map.get(k));
        }
    }
}
