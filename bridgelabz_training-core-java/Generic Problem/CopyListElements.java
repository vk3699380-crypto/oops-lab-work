import java.util.*;
class CopyListElements {
    public static void copyList(List<? super Number> dest, List<? extends Number> src) {
        dest.addAll(src);
    }
    public static void main(String[] args) {
        List<Number> nums = new ArrayList<>();
        List<Integer> ints = Arrays.asList(1,2,3);
        copyList(nums, ints);
        System.out.println(nums);
    }
}