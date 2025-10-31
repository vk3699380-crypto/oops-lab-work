public class Assignment5 {
    public static void main(String[] args) {
        int a = Integer.parseInt("123");
        double b = Double.parseDouble("3.14");
        boolean c = Boolean.parseBoolean("true");
        String bin = Integer.toBinaryString(10);
        boolean isDigit = Character.isDigit('5');
        char upper = Character.toUpperCase('a');
        System.out.println(a + ", " + b + ", " + c);
        System.out.println("Binary of 10: " + bin);
        System.out.println("Is '5' a digit? " + isDigit);
        System.out.println("Uppercase of 'a': " + upper);
    }
}