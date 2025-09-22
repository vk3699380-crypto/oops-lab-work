import java.util.Scanner;
public class fullname {
    public static void main(String[] args) {
        Scanner b = new Scanner(System.in);
        
        System.out.println("Enter Your First Name :");
        String name1 = b.next();
        
        System.out.println("Enter Your Last Name :");
        String name2 = b.next();
        
        String Fullname = name1 + " " + name2;
        
        System.out.println("Your Full Name is : " + Fullname);
        
        b.close();
    }
}