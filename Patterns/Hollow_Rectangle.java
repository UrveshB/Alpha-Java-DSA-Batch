import java.util.*;
public class Hollow_Rectangle {
    public static void main(String args[]) {
        int row, col;

        //Create a scanner object to take input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        row = sc.nextInt();
        System.out.print("enter number of columns: ");
        col = sc.nextInt();

        //rows
        for(int i=0; i<row; i++) {
            //col
            for(int j=0; j<col; j++) {
                //boundry condition
                if(i==0 || i==row-1 || j==0 || j==col-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
