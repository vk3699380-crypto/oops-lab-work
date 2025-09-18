package questions;
import java.util.*;
public class five {
	    public static void moveNegatives(int[] arr) {
	        int[] result = new int[arr.length];
	        int index = 0;
	        for (int num : arr) if (num < 0) result[index++] = num;
	        for (int num : arr) if (num >= 0) result[index++] = num;
	        System.out.println("Negatives on one side: " + Arrays.toString(result));
	    }
}
