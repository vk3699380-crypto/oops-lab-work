import java.util.Scanner;

public class array {
    public static void main(String[] args){
        Scanner c = new Scanner(System.in);

        System.out.println("Enter the Size of array: " );

        int size = c.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of array: " );
        for(int i = 0 ; i < size; i++){
            arr[i] = c.nextInt();
        }

        System.out.println("The elements of array are: " );
        for(int i = 0; i < size; i++){
            System.out.print(" " + arr[i]);
        }

        c.close();
    }
}