
import java.util.*;
public class CountryCapitalLookup {
    public static void main(String[] args){
        Map<String,String> map = new TreeMap<>();
        map.put("India","New Delhi");
        map.put("USA","Washington DC");
        map.put("UK","London");
        map.put("Japan","Tokyo");
        map.put("France","Paris");
        map.put("Germany","Berlin");
        map.put("China","Beijing");
        map.put("Canada","Ottawa");
        String q="Japan";
        if(map.containsKey(q)) System.out.println(map.get(q));
        else System.out.println("Unknown country");
        for(String k: map.keySet()){
            System.out.println(k+"="+map.get(k));
        }
    }
}
