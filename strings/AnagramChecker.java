/** 6) Tell whether two words are anagrams (same letters, different order).
 *  Ex: roma - amor */

// imports
import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {

    public static void main(String[] args) {
        // variables
        Scanner in = new Scanner(System.in);
        String first = "";
        String second = "";

        // data entry
        System.out.print("Enter the first word: ");
        first = in.next().toLowerCase();
        System.out.print("Enter the second word: ");
        second = in.next().toLowerCase();

        // sort the letters of both words and compare
        char[] a = first.toCharArray();
        char[] b = second.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

        // show results
        if (Arrays.equals(a, b)) {
            System.out.println("They are anagrams");
        } else {
            System.out.println("They are not anagrams");
        }
    }
}
