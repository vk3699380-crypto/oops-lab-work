package questions;
import java.util.*;
public class four {
	    public static void sort012(int[] arr) {
	        int low = 0, mid = 0, high = arr.length - 1;
	        while (mid <= high) {
	            switch (arr[mid]) {
	                case 0 -> {
	                    int temp = arr[low];
	                    arr[low++] = arr[mid];
	                    arr[mid++] = temp;
	                }
	                case 1 -> mid++;
	                case 2 -> {
	                    int temp = arr[mid];
	                    arr[mid] = arr[high];
	                    arr[high--] = temp;
	                }
	            }
	        }
	        System.out.println("Sorted 0s, 1s, 2s: " + Arrays.toString(arr));
	    }
}
	  