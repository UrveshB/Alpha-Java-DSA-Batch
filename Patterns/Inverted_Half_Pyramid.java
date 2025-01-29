import java.util.*;
public class Inverted_Half_Pyramid {
    public static void main(String args[]) {
        int n;

        //Create a scanner object to take input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of pattern: ");
        n = sc.nextInt();

        //row
        for(int i=0; i<n; i++) {
            //col
            for(int j=1; j<=n-i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
