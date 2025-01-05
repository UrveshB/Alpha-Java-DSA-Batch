import java.util.*;

public class Positive_Or_Negative {

    public static void main(String arr[]) {
        //new scanner object to take input from user
        Scanner sc = new Scanner(System.in);
        
        //take input from user
        System.out.print("Enter a number: ");
        float a = sc.nextFloat();

        //check if the number is positive or negative
        if(a == 0) {
            System.out.print("The number is zero");
        } else if(a > 0) {
            System.out.print("The number is positive");
        } else {
            System.out.print("The number is negative");
        }
    }
}
