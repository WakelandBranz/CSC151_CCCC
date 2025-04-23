/*
 * By Wakeland Branz
In Chapter 2, you created an application named QuartsToGallonsInteractive that accepts a number of quarts from a user and converts the value to gallons. 
Now, add exception-handling capabilities to this program and continuously reprompt the user while any nonnumeric value is entered. 
Save the file as QuartsToGallonsWithExceptionHandling.java.
 */

import java.util.Scanner;

public class QuartsToGallonsWithExceptionHandling {
    public static void main(String[] args) {
        // Constants
        final int QUARTS_IN_GALLON = 4;
        
        // Variables
        int quartsNeeded = 0;
        int gallons;
        int quartsRemaining;
        boolean validInput = false;
        Scanner input = new Scanner(System.in);
        
        // Input with exception handling
        while (!validInput) {
            try {
                System.out.print("Enter the number of quarts needed >> ");
                String userInput = input.nextLine();
                quartsNeeded = Integer.parseInt(userInput);
                validInput = true;  // If we get here, the input was valid
            } catch (NumberFormatException e) {
                System.out.println("Error: Please enter a valid numeric value.");
                // Loop will continue and reprompt
            }
        }
        
        // Calculation
        gallons = quartsNeeded / QUARTS_IN_GALLON;
        quartsRemaining = quartsNeeded % QUARTS_IN_GALLON;
        
        // Output
        System.out.println("A job that needs " + quartsNeeded + " quarts requires " + 
                           gallons + " gallons plus " + quartsRemaining + " quarts.");
                           
        input.close();
    }
}