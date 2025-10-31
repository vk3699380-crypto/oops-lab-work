public class Assignment4 {
    public static void main(String[] args) {
        Integer a = 100, b = 100, c = 200, d = 200;
        System.out.println("a == b: " + (a == b));
        System.out.println("c == d: " + (c == d));
        System.out.println("a.equals(b): " + a.equals(b));
        System.out.println("\nExplanation: Integer values between -128 and 127 are cached, so 'a' and 'b' refer to the same object.");
    }
}