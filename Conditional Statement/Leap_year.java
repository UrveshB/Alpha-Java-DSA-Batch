import java.util.*;

public class Leap_year {

    public static void main(String arr[]) {
        //new scanner object to take input from user600
        Scanner sc = new Scanner(System.in);

        //take input from user
        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        //check for Leap year
        if(year % 4 == 0) {
            if(year % 100 == 0) {
                if(year % 400 == 0) {
                    System.out.print("Year is a Leap year");
                } else 
                    System.out.print("Year is not a Leap year");
            } else {
                System.out.print("Year is a Leap year");
            }
        } else {
            System.out.print("Year is not a Leap year");
        }
    }
}
