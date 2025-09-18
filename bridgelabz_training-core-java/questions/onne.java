package questions;
import java.util.*;
public class onne {
	    public static void reverseArray(int[] arr) {
	        int left = 0, right = arr.length - 1;
	        while (left < right) {
	            int temp = arr[left];
	            arr[left++] = arr[right];
	            arr[right--] = temp;
	        }
	        System.out.println("Reversed Array: " + Arrays.toString(arr));
	    }
}