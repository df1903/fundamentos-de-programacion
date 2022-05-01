/** 3) Show the multiplication table of a number from 1 to 10. */

// imports
import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        // variables
        Scanner in = new Scanner(System.in);
        int number = 0;

        // data entry
        System.out.print("Enter a number: ");
        number = in.nextInt();

        // show table
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
