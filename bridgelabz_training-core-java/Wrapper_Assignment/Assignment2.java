public class Assignment2 {
    public static void main(String[] args) {
        Double dObj = 45.67;
        double dVal = dObj;
        int iVal = (int) dObj.doubleValue();
        System.out.println("Double value: " + dVal);
        System.out.println("Integer value (casted): " + iVal);
    }
}