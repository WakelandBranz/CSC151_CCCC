/*
 * By Wakeland Branz
Write an application that allows a user to enter the names and birthdates of up to 10 friends. 
Continue to prompt the user for names and birthdates until the user enters the sentinel value ZZZ for a name or has entered 10 names, whichever comes first. 
When the user is finished entering names, produce a count of how many names were entered, and then display the names. 
In a loop, continuously ask the user to type one of the names and display the corresponding birthdate or an error message if the name has not been previously entered. 
The loop continues until the user enters ZZZ for a name. Save the application as BirthdayReminder.java.
 */

import java.util.Scanner;

public class BirthdayReminder {
    public static void main(String[] args) {
        final int MAX_FRIENDS = 10;
        final String SENTINEL = "ZZZ";
        
        // Arrays to store friends' names and birthdates
        String[] names = new String[MAX_FRIENDS];
        String[] birthdates = new String[MAX_FRIENDS];
        int count = 0;
        
        Scanner input = new Scanner(System.in);
        String name;
        String birthdate;
        
        // Input phase - collect names and birthdates
        System.out.println("Birthday Reminder Application");
        System.out.println("Enter up to " + MAX_FRIENDS + " friends' names and birthdates.");
        System.out.println("Enter '" + SENTINEL + "' as a name to quit entering data.");
        
        System.out.print("\nEnter friend's name: ");
        name = input.nextLine();
        
        while (!name.equals(SENTINEL) && count < MAX_FRIENDS) {
            System.out.print("Enter " + name + "'s birthdate (MM/DD/YYYY): ");
            birthdate = input.nextLine();
            
            // Validate birthdate format (checking for MM/DD/YYYY format - 10 characters)
            while (birthdate.length() != 10) {
                System.out.println("Error: Invalid birthdate format. Please use MM/DD/YYYY format.");
                System.out.print("Enter " + name + "'s birthdate (MM/DD/YYYY): ");
                birthdate = input.nextLine();
            }
            
            names[count] = name;
            birthdates[count] = birthdate;
            count++;
            
            // Check if we've reached the maximum number of friends
            if (count == MAX_FRIENDS) {
                System.out.println("Maximum number of friends reached.");
                break;
            }
            
            // Prompt for the next name
            System.out.print("\nEnter friend's name: ");
            name = input.nextLine();
        }
        
        System.out.println("\n" + count + " names have been entered:");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + names[i]);
        }
        
        System.out.println("\nBirthdate Lookup");
        System.out.println("Enter a friend's name to look up their birthdate.");
        System.out.println("Enter '" + SENTINEL + "' to quit the application.");
        
        boolean found;
        
        while (true) {
            System.out.print("\nEnter a name to look up: ");
            name = input.nextLine();
            
            if (name.equals(SENTINEL)) {
                break;
            }
            
            // Search for the name in the array
            found = false;
            for (int i = 0; i < count; i++) {
                if (names[i].equalsIgnoreCase(name)) {
                    System.out.println(names[i] + "'s birthdate is: " + birthdates[i]);
                    found = true;
                    break;
                }
            }
            
            if (!found) {
                System.out.println("Error: The name '" + name + "' was not found.");
            }
        }
        
        System.out.println("\nThank you for using the Birthday Reminder Application!");
        input.close();
    }
}
