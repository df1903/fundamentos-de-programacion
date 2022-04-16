/** 8) A cinema ticket costs $10000. Children under 12 pay half,
 *  people over 65 get 30% off, students get 20% off (only one discount,
 *  the biggest one that applies). */

// imports
import java.util.Scanner;

public class TicketDiscount {

    public static void main(String[] args) {
        // variables
        Scanner in = new Scanner(System.in);
        final double PRICE = 10000;
        int age = 0;
        String student = "";
        double discount = 0;

        // data entry
        System.out.print("Enter your age: ");
        age = in.nextInt();
        System.out.print("Are you a student? (yes/no): ");
        student = in.next();

        // calculate discount
        if (age < 12) {
            discount = 0.5;
        } else if (age > 65) {
            discount = 0.3;
        } else if (student.equalsIgnoreCase("yes")) {
            discount = 0.2;
        }

        // show results
        System.out.println("You pay: $" + (PRICE - PRICE * discount));
    }
}
