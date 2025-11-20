
import java.util.*;
public class InventoryManagement {
    public static void main(String[] args){
        Map<String,Integer> map = new HashMap<>();
        map.put("Pen",50);
        map.put("Book",30);
        map.put("Bag",10);
        map.put("Pen", map.get("Pen")-20);
        if(map.get("Pen")<=0) map.put("Pen",0);
        map.put("Book", map.get("Book")+40);
        String q="Bag";
        if(map.containsKey(q)) System.out.println(map.get(q));
        else System.out.println("not stocked");
        for(String k: map.keySet()){
            if(map.get(k)==0) System.out.println(k+" out of stock");
        }
    }
}
