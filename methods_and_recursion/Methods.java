/** 1) Practice with methods: each operation lives in its own method. */

// imports
import java.util.Scanner;

public class Methods {

    // returns the area of a circle
    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    // returns true if the number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // returns the maximum of two numbers
    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    // converts celsius to fahrenheit
    public static double toFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    // prints a line of N asterisks (no return value)
    public static void printLine(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // variables
        Scanner in = new Scanner(System.in);

        System.out.print("Radius: ");
        System.out.printf("Area: %.2f%n", circleArea(in.nextDouble()));

        System.out.print("Number: ");
        System.out.println(isEven(in.nextInt()) ? "Even" : "Odd");

        System.out.println("Max of 8 and 12: " + max(8, 12));

        System.out.print("Celsius: ");
        System.out.println("Fahrenheit: " + toFahrenheit(in.nextDouble()));

        printLine(15);
    }
}
