import java.util.*;

public class Sum_of_odd_even_integers {
    
    public static void main(String arg[]) {

        int choice;
        int evenSum = 0, oddSum = 0;
        //Create a scanner object to take input from user
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            if(num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }

            System.out.print("To continue adding more numbers, enter: 1\nTo print the sum, enter: 2\n");
            choice = sc.nextInt();
        } while(choice == 1);

        System.out.println("Total sum of even integers: " + evenSum);
        System.out.print("Total sum of odd integers: " + oddSum);
    }
}

