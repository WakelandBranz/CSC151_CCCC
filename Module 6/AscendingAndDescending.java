/*
 * Wakeland Branz
Write an application that asks a user to enter three integers. 
Display them in ascending and descending order. 
Save the file as AscendingAndDescending.java.
 */

import java.util.Scanner;

public class AscendingAndDescending {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Used for storing the three integers from user input
        int num1, num2, num3;
        
        // Prompt the user to enter three integers
        System.out.println("Enter three integers:");
        
        // Get the three integers from the user
        System.out.print("First integer: ");
        num1 = input.nextInt();
        
        System.out.print("Second integer: ");
        num2 = input.nextInt();
        
        System.out.print("Third integer: ");
        num3 = input.nextInt();

        int[] arr = {num1, num2, num3};
        
        int[] ascendingArray = sortAscending(arr);
        int[] descendingArray = sortDescending(arr);
        
        System.out.println("\n--- The numbers in ascending order ---");
        printArray(ascendingArray);
        
        System.out.println("\n--- The numbers in descending order ---");
        printArray(descendingArray);
        
        input.close();
    }

    // Simple bubble sort implementation
    static int[] sortAscending(int[] array) {
        // Create a copy of the input array
        int[] result = array.clone();
        
        for (int i = 0; i < result.length - 1; i++) {
            for (int j = 0; j < result.length - i - 1; j++) {
                if (result[j] > result[j + 1]) {
                    // Swap elements
                    int temp = result[j];
                    result[j] = result[j + 1];
                    result[j + 1] = temp;
                }
            }
        }
        
        return result;
    }

    // Simple bubble sort implementation for descending order
    static int[] sortDescending(int[] array) {
        // Create a copy of the input array
        int[] result = array.clone();
        
        for (int i = 0; i < result.length - 1; i++) {
            for (int j = 0; j < result.length - i - 1; j++) {
                if (result[j] < result[j + 1]) {
                    // Swap elements
                    int temp = result[j];
                    result[j] = result[j + 1];
                    result[j + 1] = temp;
                }
            }
        }
        
        return result;
    }
    
    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
