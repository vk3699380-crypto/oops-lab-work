package questions;
import java.util.*;
public class six {
	    public static void unionIntersection(int[] arr1, int[] arr2) {
	        Set<Integer> union = new TreeSet<>();
	        Set<Integer> intersection = new HashSet<>();
	        Set<Integer> set1 = new HashSet<>();
	        for (int num : arr1) {
	            union.add(num);
	            set1.add(num);
	        }
	        for (int num : arr2) {
	            union.add(num);
	            if (set1.contains(num)) intersection.add(num);
	        }
	        System.out.println("Union: " + union);
	        System.out.println("Intersection: " + intersection);
	    }
}