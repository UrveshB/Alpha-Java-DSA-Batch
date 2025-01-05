import java.util.*;

public class Day_of_week {

    public static void main(String arr[]) {
        //new scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        //take a number between 1 to 7 from user
        System.out.print("Enter the day number: ");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.print("Monday");
                break;
            case 2:
                System.out.print("Tuesday");
                break;
            case 3:
                System.out.print("Wednesday");
                break;
            case 4:
                System.out.print("Thursday");
                break;
            case 5:
                System.out.print("Friday");
                break;
            case 6:
                System.out.print("Saturday");
                break;
            case 7:
                System.out.print("Sunday");
                break;
            default:
                System.out.print("Invalid input");
                break;
        }
    }
}















