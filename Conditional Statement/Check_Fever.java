import java.util.*;

public class Check_Fever {

    public static void main(String arr[]) {
        
        //new scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        //take input from user
        System.out.print("Enter your body temperature: ");
        double temp = sc.nextDouble();

        //check if you have fever or not
        if(temp > 100) {
            System.out.print("You have fever");
        } else {
            System.out.print("You don't have fever");
        }
    }
}
