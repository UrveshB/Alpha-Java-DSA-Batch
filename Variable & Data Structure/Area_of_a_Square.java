import java.util.Scanner;

public class Area_of_a_Square {

    public static void main(String arr[]) {
        
        //new scanner object to take input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the side of the square: ");
        int side = sc.nextInt();

        //Calcuate area of the square
        int area = side * side;
        System.out.print("Area of the square is: "+ area);
    }
}
