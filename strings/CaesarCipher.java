/** 5) Caesar cipher: shift every letter K positions in the alphabet
 *  to encrypt a message, and shift back to decrypt it. */

// imports
import java.util.Scanner;

public class CaesarCipher {

    // shift only letters, keep everything else
    public static String shift(String text, int k) {
        String result = "";
        k = ((k % 26) + 26) % 26;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z') {
                result += (char) ('a' + (c - 'a' + k) % 26);
            } else if (c >= 'A' && c <= 'Z') {
                result += (char) ('A' + (c - 'A' + k) % 26);
            } else {
                result += c;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // variables
        Scanner in = new Scanner(System.in);
        String message = "";
        int key = 0;

        // data entry
        System.out.print("Enter a message: ");
        message = in.nextLine();
        System.out.print("Enter the key (shift): ");
        key = in.nextInt();

        String encrypted = shift(message, key);

        // show results
        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + shift(encrypted, -key));
    }
}
