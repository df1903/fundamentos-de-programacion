/** 6) Read a number from 1 to 7 and show the day of the week. */

// imports
import java.util.Scanner;

public class DayOfWeek {

    public static void main(String[] args) {
        // variables
        Scanner in = new Scanner(System.in);
        int day = 0;

        // data entry
        System.out.print("Enter a number between 1 and 7: ");
        day = in.nextInt();

        // show results
        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            case 7: System.out.println("Sunday"); break;
            default: System.out.println("Invalid day");
        }
    }
}
