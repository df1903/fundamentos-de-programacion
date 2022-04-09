/** 5) Basic calculator with a menu using switch. */

// imports
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        // variables
        Scanner in = new Scanner(System.in);
        double a = 0;
        double b = 0;
        int option = 0;

        // data entry
        System.out.print("Enter the first number: ");
        a = in.nextDouble();
        System.out.print("Enter the second number: ");
        b = in.nextDouble();

        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.print("Choose an option: ");
        option = in.nextInt();

        // show results
        switch (option) {
            case 1:
                System.out.println("Result: " + (a + b));
                break;
            case 2:
                System.out.println("Result: " + (a - b));
                break;
            case 3:
                System.out.println("Result: " + (a * b));
                break;
            case 4:
                if (b == 0) {
                    System.out.println("Cannot divide by zero");
                } else {
                    System.out.println("Result: " + (a / b));
                }
                break;
            default:
                System.out.println("Invalid option");
        }
    }
}
