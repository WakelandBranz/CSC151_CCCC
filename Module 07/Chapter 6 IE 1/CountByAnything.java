/*
 * By Wakeland Branz
    Write an application that counts by five from 5 through 500 inclusive, and that starts a new line after every multiple of 50 (50, 100, 150, and so on). 
    Save the file as CountByFives.java.
    Modify the CountByFives application so that the user enters the value to count by. Start each new line after 10 values have been displayed. 
    Save the file as CountByAnything.java. 
 */

import java.util.Scanner;

public class CountByAnything {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer to count by: ");
        int number = input.nextInt();

        for (int i = 1; i <= number; i++) {
            if (i % 10 == 0) {
                // Print new line since it's after a multiple of 10
                System.out.println(i);
            }
            else if (i < number) {
                // End line without another comma
                System.out.print(i + ", ");
            }
            else {
                // Print very last number
                System.out.print(i);
                // Add final line break if not already added by a multiple of 10
                if (i % 10 != 0) {
                    System.out.println();
                }
            }
        }

        input.close();
    }
}
