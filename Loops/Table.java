import java.util.*;

public class Table {

    public static void main(String args[]) {

        int n;
        
        //Create a scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter integer to print its table: ");
        n = sc.nextInt();

        for(int i=1; i<=10; i++) {
            System.out.println(n + " * " + i + " = " + (n*i) );
        }
     }
}
