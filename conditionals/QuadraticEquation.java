/** 4) Solve ax^2 + bx + c = 0 using the quadratic formula. */

// imports
import java.util.Scanner;

public class QuadraticEquation {

    public static void main(String[] args) {
        // variables
        Scanner in = new Scanner(System.in);
        double a = 0;
        double b = 0;
        double c = 0;
        double discriminant = 0;

        // data entry
        System.out.print("Enter a: ");
        a = in.nextDouble();
        System.out.print("Enter b: ");
        b = in.nextDouble();
        System.out.print("Enter c: ");
        c = in.nextDouble();

        if (a == 0) {
            System.out.println("It is not a quadratic equation");
            return;
        }

        discriminant = b * b - 4 * a * c;

        // show results
        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Two real solutions: x1 = " + x1 + ", x2 = " + x2);
        } else if (discriminant == 0) {
            System.out.println("One real solution: x = " + (-b / (2 * a)));
        } else {
            System.out.println("There are no real solutions");
        }
    }
}
