/** 1) Read a sentence and count its vowels, consonants and spaces. */

// imports
import java.util.Scanner;

public class VowelCounter {

    public static void main(String[] args) {
        // variables
        Scanner in = new Scanner(System.in);
        String sentence = "";
        int vowels = 0;
        int consonants = 0;
        int spaces = 0;

        // data entry
        System.out.print("Enter a sentence: ");
        sentence = in.nextLine().toLowerCase();

        // count
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if ("aeiou".indexOf(c) >= 0) {
                vowels++;
            } else if (c >= 'a' && c <= 'z') {
                consonants++;
            } else if (c == ' ') {
                spaces++;
            }
        }

        // show results
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Spaces: " + spaces);
    }
}
