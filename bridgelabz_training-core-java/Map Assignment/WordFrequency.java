
import java.util.*;
import java.nio.file.*;
public class WordFrequency {
    public static void main(String[] args) throws Exception {
        String text = "Hello world, hello Java!";
        text = text.toLowerCase().replaceAll("[^a-z ]", " ");
        String[] words = text.split("\s+");
        Map<String,Integer> map = new HashMap<>();
        for(String w: words){
            if(w.isEmpty()) continue;
            map.put(w, map.getOrDefault(w,0)+1);
        }
        System.out.println(map);
    }
}
