
import java.util.*;
public class AttendanceTracker {
    public static void main(String[] args){
        Map<String,Integer> map = new HashMap<>();
        String[] students={"A","B","C","D","E"};
        for(String s: students) map.put(s,0);
        List<List<String>> days = new ArrayList<>();
        days.add(Arrays.asList("A","B"));
        days.add(Arrays.asList("A","C","D"));
        days.add(Arrays.asList("B","E"));
        days.add(Arrays.asList("A","D"));
        days.add(Arrays.asList("A","B","C","D","E"));
        days.add(Arrays.asList("A"));
        days.add(Arrays.asList("B","C"));
        days.add(Arrays.asList("A","E"));
        days.add(Arrays.asList("C","D"));
        days.add(Arrays.asList("A","B"));
        days.add(Arrays.asList("D"));
        days.add(Arrays.asList("A","E"));
        days.add(Arrays.asList("C"));
        days.add(Arrays.asList("A","B","C"));
        days.add(Arrays.asList("D","E"));
        for(List<String> day: days){
            for(String p: day){
                map.put(p, map.get(p)+1);
            }
        }
        for(String k: map.keySet()){
            if(map.get(k)<10) System.out.println(k);
        }
    }
}
