import java.util.*;

public class Factorial {

    public static void main(String arg[]) {
        int n;
        int fact = 1;

        //Create a scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            fact *= i;
        }

        System.out.print("Factorial of " + n + " is: " + fact);
    }
}
