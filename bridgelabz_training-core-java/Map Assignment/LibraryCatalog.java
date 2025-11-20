
import java.util.*;
public class LibraryCatalog {
    public static void main(String[] args){
        Map<String,String> map = new TreeMap<>();
        map.put("978-111","Java Basics");
        map.put("978-222","DSA");
        map.put("978-333","Networks");
        String s="978-111";
        if(map.containsKey(s)) System.out.println(map.get(s));
        else System.out.println("Book not found");
        map.remove("978-333");
        for(String k: map.keySet()){
            System.out.println(k+" "+map.get(k));
        }
        String t="DSA";
        for(String k: map.keySet()){
            if(map.get(k).equals(t)) System.out.println(k);
        }
    }
}
