/** 7) Calculate the body mass index (weight / height^2)
 *  and show the category. */

// imports
import java.util.Scanner;

public class BodyMassIndex {

    public static void main(String[] args) {
        // variables
        Scanner in = new Scanner(System.in);
        double weight = 0;
        double height = 0;
        double bmi = 0;

        // data entry
        System.out.print("Enter your weight in kg: ");
        weight = in.nextDouble();
        System.out.print("Enter your height in meters: ");
        height = in.nextDouble();

        bmi = weight / (height * height);

        // show results
        System.out.printf("Your BMI is %.2f%n", bmi);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal weight");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obesity");
        }
    }
}
