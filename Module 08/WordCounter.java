/*
 * By Wakeland Branz
Write an application that counts the words in a String entered by a user. 
Words are separated by any combination of spaces, periods, commas, semicolons, question marks, exclamation points, or dashes. 
Figure 7-17 shows a typical execution.
 */

import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Word Counter Application");
        System.out.println("------------------------");
        System.out.println("Enter a string to count the words (or type 'exit' to quit):");
        
        while (true) {
            System.out.print("\n> ");
            String input = scanner.nextLine();
            
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the application. Goodbye!");
                break;
            }
            
            int wordCount = countWords(input);
            
            System.out.println("Word count: " + wordCount);
        }
        
        scanner.close();
    }
    
    public static int countWords(String text) {
        // Handle empty strings
        if (text == null || text.trim().isEmpty()) {
            return 0;
        }
        
        // Just regex all characters of interest
        return text.split("[\\s.,;?!\\-]+").length;
    }
}