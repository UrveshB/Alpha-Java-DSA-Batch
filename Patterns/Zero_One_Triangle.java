import java.util.*;
public class Zero_One_Triangle {
    public static void main(String args[]) {
        int n;

        //Create a scanner object to take input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of pattern: ");
        n = sc.nextInt();

        //row
        for(int i=0; i<n; i++) {
            //col
            for(int j=0; j<=i; j++) {
                //condition
                if((i+j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
