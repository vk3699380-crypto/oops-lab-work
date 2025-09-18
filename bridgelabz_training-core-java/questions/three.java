package questions;
import java.util.*;
public class three {
	    public static void findKthMaxMin(int[] arr, int k) {
	        Arrays.sort(arr);
	        System.out.println(k + "rd Min = " + arr[k - 1] + ", " + k + "rd Max = " + arr[arr.length - k]);
	    }
}