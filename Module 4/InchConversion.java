/*
 * Wakeland Branz
There are 12 inches in a foot and 3 feet in a yard.

Create a class named InchConversion. Its main() method accepts a value in inches from a user at the keyboard, and in turn passes the entered value to two methods. 
One converts the value from inches to feet, and the other converts the same value from inches to yards.

Each method displays the results with appropriate explanation.
 */

import java.util.Scanner;

public class InchConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a value in inches: ");
        double inches = scanner.nextDouble();

        // Convert to other unit types
        convertToFeet(inches);
        convertToYards(inches);

        scanner.close();
    }

    public static void convertToFeet(double inches) {
        double feet = inches / 12.0;
        System.out.println(inches + " inches is equal to " + feet + " feet.");
    }

    public static void convertToYards(double inches) {
        double yards = inches / 36.0;
        System.out.println(inches + " inches is equal to " + yards + " yards.");
    }
}
