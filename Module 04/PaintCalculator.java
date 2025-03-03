/*
 * Wakeland Branz
Assume that a gallon of paint covers about 350 square feet of wall space. Create an application with a main() method that prompts the user for the length, width, 
and height of a rectangular room. Pass these three values to a method that does the following:

    Calculates the wall area for a room
    Passes the calculated wall area to another method that calculates and returns the number of gallons of paint needed
    Displays the number of gallons needed
    Computes the price based on a paint price of $32 per gallon, assuming that the painter can buy any fraction of a gallon of paint at the same price as a whole gallon
    Returns the price to the main()method

The main() method displays the final price. For example, the cost to paint a 15-by-20-foot room with 10-foot ceilings is $64. Save the application as PaintCalculator.java.
 */

import java.util.Scanner;

public class PaintCalculator {
    // A gallon of paint covers 350 square feet
    public static final double PAINT_COVERAGE = 350.0; 
    // Price of one gallon of paint
    public static final double PAINT_PRICE_PER_GALLON = 32.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get room dimensions from user
        System.out.print("Enter the length of the room in feet: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the room in feet: ");
        double width = scanner.nextDouble();

        System.out.print("Enter the height of the room in feet: ");
        double height = scanner.nextDouble();

        double price = calculatePrice(length, width, height);
        System.out.printf("The total price to paint the room is %.2f\n", price);

        scanner.close();
    }

    public static double calculateWallArea(double length, double width, double height) {
        // Calculate total wall area (excluding floor and ceiling)
        return 2 * (length * height + width * height);
    }
    
    public static double calculateGallonsNeeded(double wallArea) {
        // Calculate gallons needed based on coverage
        double gallons = wallArea / PAINT_COVERAGE;
        System.out.printf("Gallons of paint needed: $%.2f%n", gallons);
        return gallons;
    }
    
    public static double calculatePrice(double length, double width, double height) {
        double wallArea = calculateWallArea(length, width, height);
        double gallonsNeeded = calculateGallonsNeeded(wallArea);
        return gallonsNeeded * PAINT_PRICE_PER_GALLON;
    }
}
