/** 3) Read a text and show it reversed, and also with each
 *  word reversed in its own place. */

// imports
import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        // variables
        Scanner in = new Scanner(System.in);
        String text = "";
        String reversed = "";
        String wordsReversed = "";

        // data entry
        System.out.print("Enter a text: ");
        text = in.nextLine();

        // whole text reversed
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }

        // each word reversed
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            for (int j = words[i].length() - 1; j >= 0; j--) {
                wordsReversed += words[i].charAt(j);
            }
            wordsReversed += " ";
        }

        // show results
        System.out.println("Reversed: " + reversed);
        System.out.println("Each word reversed: " + wordsReversed.trim());
    }
}
