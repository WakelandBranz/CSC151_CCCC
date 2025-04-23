/*
 * By Wakeland Branz
Write an application named BadSubscriptCaught in which you declare an array of eight first names. 
Write a try block in which you prompt the user for an integer and display the name in the requested position. 
Create a catch block that catches the potential ArrayIndexOutOfBoundsException thrown when the user enters a number that is out of range. 
The catch block also should display an error message. Save the file as BadSubscriptCaught.java.
 */

import java.util.Scanner;

public class BadSubscriptCaught {
    public static void main(String[] args) {
        // Declare an array of eight first names
        String[] names = {"James", "Mary", "John", "Patricia", "Robert", "Jennifer", "Michael", "Linda"};
        
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user and handle potential exception
        try {
            System.out.print("Enter a position number (0-7) to display a name: ");
            int position = input.nextInt();
            System.out.println("The name at position " + position + " is " + names[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: The position you entered is out of bounds.");
            System.out.println("Valid positions are 0 through " + (names.length - 1));
        } finally {
            input.close();
        }
    }
}