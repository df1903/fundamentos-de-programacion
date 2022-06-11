/** 7) Read the names and final grades of N students. Show the average
 *  of the group, who has the best grade and who passed (grade >= 3.0). */

// imports
import java.util.Scanner;

public class StudentGrades {

    public static void main(String[] args) {
        // variables
        Scanner in = new Scanner(System.in);
        int n = 0;
        double sum = 0;
        int best = 0;

        // data entry
        System.out.print("How many students? ");
        n = in.nextInt();
        String[] names = new String[n];
        double[] grades = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Name of student " + (i + 1) + ": ");
            names[i] = in.next();
            System.out.print("Grade of " + names[i] + ": ");
            grades[i] = in.nextDouble();
            sum += grades[i];
            if (grades[i] > grades[best]) {
                best = i;
            }
        }

        // show results
        System.out.println("Group average: " + (sum / n));
        System.out.println("Best grade: " + names[best] + " (" + grades[best] + ")");
        System.out.println("Students who passed:");
        for (int i = 0; i < n; i++) {
            if (grades[i] >= 3.0) {
                System.out.println("- " + names[i]);
            }
        }
    }
}
