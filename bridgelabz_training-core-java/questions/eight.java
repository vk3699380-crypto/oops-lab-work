package questions;
import java.util.*;
public class eight {
	    public static void reverseArray(int[] arr) {
	        int left = 0, right = arr.length - 1;
	        while (left < right) {
	            int temp = arr[left];
	            arr[left++] = arr[right];
	            arr[right--] = temp;
	        }
	        System.out.println("Reversed Array: " + Arrays.toString(arr));
	    }
	    public static void findMaxMin(int[] arr) {
	        int max = arr[0], min = arr[0];
	        for (int num : arr) {
	            max = Math.max(max, num);
	            min = Math.min(min, num);
	        }
	        System.out.println("Max = " + max + ", Min = " + min);
	    }
	    public static void findKthMaxMin(int[] arr, int k) {
	        Arrays.sort(arr);
	        System.out.println(k + "rd Min = " + arr[k - 1] + ", " + k + "rd Max = " + arr[arr.length - k]);
	    }
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
	    public static void moveNegatives(int[] arr) {
	        int[] result = new int[arr.length];
	        int index = 0;
	        for (int num : arr) if (num < 0) result[index++] = num;
	        for (int num : arr) if (num >= 0) result[index++] = num;
	        System.out.println("Negatives on one side: " + Arrays.toString(result));
	    }
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
	    public static void rotateByOne(int[] arr) {
	        int last = arr[arr.length - 1];
	        for (int i = arr.length - 1; i > 0; i--) arr[i] = arr[i - 1];
	        arr[0] = last;
	        System.out.println("Cyclically Rotated: " + Arrays.toString(arr));
	    }   
	    public static void kadane(int[] arr) {
	        int maxSoFar = arr[0], maxEndingHere = arr[0];
	        int start = 0, end = 0, s = 0;
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] > maxEndingHere + arr[i]) {
	                maxEndingHere = arr[i];
	                s = i;
	            } else {
	                maxEndingHere += arr[i];
	            }
	            if (maxEndingHere > maxSoFar) {
	                maxSoFar = maxEndingHere;
	                start = s;
	                end = i;
	            }
	        }
	        System.out.println("Max Sum = " + maxSoFar + " (Subarray: " + Arrays.toString(Arrays.copyOfRange(arr, start, end + 1)) + ")");
	    }

	    public static void main(String[] args) {
	        reverseArray(new int[]{1, 2, 3, 4, 5});
	        findMaxMin(new int[]{3, 5, 1, 8, -2});
	        findKthMaxMin(new int[]{7, 10, 4, 3, 20, 15}, 3);
	        sort012(new int[]{0, 2, 1, 2, 0});
	        moveNegatives(new int[]{1, -1, 3, 2, -7, -5, 11, 6});
	        unionIntersection(new int[]{1, 2, 4, 5}, new int[]{2, 3, 5, 6});
	        rotateByOne(new int[]{1, 2, 3, 4, 5});
	        kadane(new int[]{-2, -3, 4, -1, -2, 1, 5, -3});
	    }
	}

