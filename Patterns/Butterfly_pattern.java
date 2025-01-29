import java.util.*;
public class Butterfly_pattern {
    public static void main(String args[]) {
        int n;

        //Create a scanner object to take input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of pattern: ");
        n = sc.nextInt();

        //upper half
        //row
        for(int i=1; i<=n; i++) {
            //col
            //stars
            for(int j=0; j<i; j++) {
                System.out.print("*");
            }
            //spaces
            for(int j=1; j<=2*(n-i); j++) {
                System.out.print(" ");
            }
            //stars
            for(int j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
