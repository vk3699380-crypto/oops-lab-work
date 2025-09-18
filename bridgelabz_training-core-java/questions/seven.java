package questions;
import java.util.*;
public class seven {
	    public static void rotateByOne(int[] arr) {
	        int last = arr[arr.length - 1];
	        for (int i = arr.length - 1; i > 0; i--) arr[i] = arr[i - 1];
	        arr[0] = last;
	        System.out.println("Cyclically Rotated: " + Arrays.toString(arr));
	    }
}