/** 2) Read a phrase and tell whether it is a palindrome, ignoring
 *  spaces and uppercase. Ex: "Anita lava la tina" */

// imports
import java.util.Scanner;

public class PalindromeWord {

    public static void main(String[] args) {
        // variables
        Scanner in = new Scanner(System.in);
        String phrase = "";
        String clean = "";
        boolean palindrome = true;

        // data entry
        System.out.print("Enter a phrase: ");
        phrase = in.nextLine();

        // remove spaces and uppercase
        clean = phrase.replace(" ", "").toLowerCase();

        // compare both ends
        for (int i = 0; i < clean.length() / 2; i++) {
            if (clean.charAt(i) != clean.charAt(clean.length() - 1 - i)) {
                palindrome = false;
            }
        }

        // show results
        if (palindrome) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }
    }
}
