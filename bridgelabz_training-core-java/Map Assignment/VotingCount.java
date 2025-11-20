
import java.util.*;
public class VotingCount {
    public static void main(String[] args){
        Map<String,Integer> map = new HashMap<>();
        String[] votes = {"A","B","C","A","A","B","C","A","B","A"};
        for(String v: votes){
            map.put(v, map.getOrDefault(v,0)+1);
        }
        String win=null;
        int max=-1;
        for(String k: map.keySet()){
            if(map.get(k)>max){max=map.get(k);win=k;}
        }
        System.out.println(map);
        System.out.println(win);
    }
}
