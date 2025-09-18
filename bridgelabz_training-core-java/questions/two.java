package questions;
import java.util.*;
public class two {
	    public static void findMaxMin(int[] arr) {
	        int max = arr[0], min = arr[0];
	        for (int num : arr) {
	            max = Math.max(max, num);
	            min = Math.min(min, num);
	        }
	        System.out.println("Max = " + max + ", Min = " + min);
	    }
}