/** 4) Read a sentence and count its words and the longest word. */

// imports
import java.util.Scanner;

public class WordCounter {

    public static void main(String[] args) {
        // variables
        Scanner in = new Scanner(System.in);
        String sentence = "";
        String longest = "";

        // data entry
        System.out.print("Enter a sentence: ");
        sentence = in.nextLine().trim();

        if (sentence.isEmpty()) {
            System.out.println("Words: 0");
            return;
        }

        String[] words = sentence.split("\\s+");
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        // show results
        System.out.println("Words: " + words.length);
        System.out.println("Longest word: " + longest);
    }
}
