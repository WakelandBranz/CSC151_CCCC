/*
 * By Wakeland Branz
Write a program that inserts parentheses, a space, and a dash into a string of 10 user-entered numbers to format it as a phone number. 
For example, 5153458912 becomes (515) 345-8912. If the user does not enter exactly 10 digits, display an error message. 
Continue to accept user input until the user enters 999.
 */

import java.util.Scanner;

public class PhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        
        System.out.println("Phone Number Formatter");
        System.out.println("Enter a 10-digit number to format as a phone number.");
        System.out.println("Enter 999 to exit the program.");
        
        while (true) {
            System.out.print("\nEnter a number: ");
            input = scanner.nextLine();
            
            // Check if user wants to exit
            if (input.equals("999")) {
                System.out.println("Exiting program. Goodbye!");
                break;
            }
            
            // Check if input contains exactly 10 digits
            if (isValidInput(input)) {
                String formattedNumber = formatPhoneNumber(input);
                System.out.println("Formatted phone number: " + formattedNumber);
            } 
            else {
                System.out.println("Error: Please enter exactly 10 digits.");
            }
        }
        
        scanner.close();
    }
    
    public static boolean isValidInput(String input) {
        // Check if input is exactly 10 characters long
        if (input.length() != 10) {
            return false;
        }
        
        // Check if all characters are digits
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                return false;
            }
        }
        
        return true;
    }
    
    public static String formatPhoneNumber(String input) {
        // Format as (XXX) XXX-XXXX
        return "(" + input.substring(0, 3) + ") " + 
               input.substring(3, 6) + "-" + 
               input.substring(6, 10);
    }
}
