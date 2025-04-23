/*
 * By Wakeland Branz
The Double.parseDouble() method requires a String argument, but it fails if the String cannot be converted to a floating-point number. 
Write an application in which you try accepting a double input from a user and catch a NumberFormatException if one is thrown. 
The catch block forces the number to 0 and displays an appropriate error message. 
Following the catch block, display the number. Save the file as TryToParseDouble.java.
 */

import java.util.Scanner;

public class TryToParseDouble {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double inputValue = 0;
        
        System.out.print("Enter a floating-point number >> ");
        String userInput = input.nextLine();
        
        try {
            inputValue = Double.parseDouble(userInput);
        } catch (NumberFormatException e) {
            System.out.println("Error: '" + userInput + "' is not a valid floating-point number.");
            System.out.println("Value has been set to 0.");
            inputValue = 0;
        }
        
        System.out.println("The value is: " + inputValue);
        
        input.close();
    }
}
