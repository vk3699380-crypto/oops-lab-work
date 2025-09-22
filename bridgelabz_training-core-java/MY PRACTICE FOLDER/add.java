import java.util.Scanner;

public class add {

    public static void main(String [] args){
        Scanner a = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num = a.nextInt();


        System.out.println("Enter second number: ");
        int b = a.nextInt();
        num = num + b;
        System.out.println("The sum of two number is : " + num);

        a.close();
    }
    
}

