/** 7) Convert a decimal number to binary with recursion and
 *  a binary string back to decimal. */

// imports
import java.util.Scanner;

public class BinaryConverter {

    public static String toBinary(int n) {
        if (n < 2) {
            return String.valueOf(n);
        }
        return toBinary(n / 2) + (n % 2);
    }

    public static int toDecimal(String binary) {
        int result = 0;
        for (int i = 0; i < binary.length(); i++) {
            result = result * 2 + (binary.charAt(i) - '0');
        }
        return result;
    }

    public static void main(String[] args) {
        // variables
        Scanner in = new Scanner(System.in);
        int number = 0;
        String binary = "";

        // data entry
        System.out.print("Enter a decimal number: ");
        number = in.nextInt();
        binary = toBinary(number);

        // show results
        System.out.println("Binary: " + binary);
        System.out.println("Back to decimal: " + toDecimal(binary));
    }
}
