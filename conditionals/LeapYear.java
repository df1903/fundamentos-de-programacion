/** 2) Read a year and tell whether it is a leap year.
 *  A year is leap if it is divisible by 4, except centuries,
 *  which must be divisible by 400. */

// imports
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        // variables
        Scanner in = new Scanner(System.in);
        int year = 0;

        // data entry
        System.out.print("Enter a year: ");
        year = in.nextInt();

        // show results
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}
