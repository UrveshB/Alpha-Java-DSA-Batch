import java.util.*;

public class Average {

    public static void main(String arr[]) {
        //new scanner object to take input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.print("Enter the third number: ");
        int c = sc.nextInt();

        //calculating the average of the three numbers
        int avg = (a + b + c) / 3;
        System.out.println("The average of the three numbers is: " + avg);
    }

}