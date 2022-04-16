/** 3) Read the three sides of a triangle and classify it as
 *  equilateral, isosceles or scalene. Check that it can exist first. */

// imports
import java.util.Scanner;

public class TriangleType {

    public static void main(String[] args) {
        // variables
        Scanner in = new Scanner(System.in);
        double a = 0;
        double b = 0;
        double c = 0;

        // data entry
        System.out.print("Enter side a: ");
        a = in.nextDouble();
        System.out.print("Enter side b: ");
        b = in.nextDouble();
        System.out.print("Enter side c: ");
        c = in.nextDouble();

        // triangle inequality
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Those sides do not form a triangle");
        } else if (a == b && b == c) {
            System.out.println("Equilateral triangle");
        } else if (a == b || a == c || b == c) {
            System.out.println("Isosceles triangle");
        } else {
            System.out.println("Scalene triangle");
        }
    }
}
