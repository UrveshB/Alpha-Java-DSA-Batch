import java.util.*;
public class FLOYDS_Triangle {
    public static void main(String args[]) {
        int n;
        int num = 1;

        //Create a scanner object to take input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of pattern: ");
        n = sc.nextInt();

        //row
        for(int i=0; i<n; i++) {
            //col
            for(int j=0; j<=i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
