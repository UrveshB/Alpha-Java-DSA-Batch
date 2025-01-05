import java.util.*;

public class Cost_of_items {

    public static void main(String arr[]) {
        //new scanner object to take inputs from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cost of Pencil: ");
        float pencil = sc.nextFloat();
        System.out.print("Enter the cost of Pen: ");
        float pen = sc.nextFloat();
        System.out.print("Enter the cost of Eraser: ");
        float eraser = sc.nextFloat();

        //calculating the total cost of the items
        float total = pencil + pen + eraser;

        //additional 18% gst
        float tax = (total * 18) / 100;

        //grandTotal wth tax
        float grandTotal = total + tax;
        System.out.print("The total cost of the items is: " + grandTotal);
    }
}
