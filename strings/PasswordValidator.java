/** 7) Validate a password: at least 8 characters, one uppercase letter,
 *  one lowercase letter and one digit. */

// imports
import java.util.Scanner;

public class PasswordValidator {

    public static void main(String[] args) {
        // variables
        Scanner in = new Scanner(System.in);
        String password = "";
        boolean upper = false;
        boolean lower = false;
        boolean digit = false;

        // data entry
        System.out.print("Enter a password: ");
        password = in.nextLine();

        // check every character
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)) {
                upper = true;
            } else if (Character.isLowerCase(c)) {
                lower = true;
            } else if (Character.isDigit(c)) {
                digit = true;
            }
        }

        // show results
        if (password.length() >= 8 && upper && lower && digit) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password. It needs 8+ characters, uppercase, lowercase and a digit");
        }
    }
}
