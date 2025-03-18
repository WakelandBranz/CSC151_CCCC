/*
 * By Wakeland Branz
Create an application containing an array that stores eight integers. 
The application should call five methods that in turn (1) display all the integers, (2) display all the integers in reverse order, 
(3) display the sum of the integers, (4) display all values less than a limiting argument, and (5) display all values that are higher than the calculated average value. 
Save the file as ArrayMethodDemo.java.
 */

public class ArrayMethodDemo {
    public static void main(String[] args) {
        int[] testArray = { 0, 1, 2, 3, 4, 5, 6, 7 };
        
        System.out.println("--------- ARRAY METHODS DEMONSTRATION ---------");
        
        System.out.println("\n1. Display all integers:");
        displayIntegers(testArray);
        
        System.out.println("\n2. Display integers in reverse order:");
        displayIntegersReversed(testArray);
        
        System.out.println("\n3. Sum of all integers:");
        sumIntegerArray(testArray);
        
        System.out.println("\n4. Values less than limit (4):");
        valuesLessThanLimitArray(testArray, 4);
        
        System.out.println("\n5. Values greater than average:");
        valuesGreaterThanAverage(testArray);
        
        System.out.println("\n----------- END OF DEMONSTRATION -------------");
    }

    public static void displayIntegers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                System.out.print(array[i] + ", ");
            }
            // This is for once the last line is reached
            else {
                System.out.println(array[i]);
            }
        }
    }

    public static void displayIntegersReversed(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(array[i] + ", ");
            }
            // This is for once the last line is reached
            else {
                System.out.println(array[i]);
            }
        }
    }

    public static void sumIntegerArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Sum of array: " + sum);
    }

    public static void valuesLessThanLimitArray(int[] array, int limit) {
        System.out.println("--- Values in array less than inputted limit ---");
        for (int i = 0; i < array.length; i++) {
            if (array[i] < limit) {
                System.out.println(array[i]);
            }
        }
        System.out.println("------------------------------------------------");
    }

    public static void valuesGreaterThanAverage(int[] array) {
        System.out.println("--- Values in array greater than average of array values ---");

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double average = (double)sum / array.length;
        System.out.println("Calculated average: " + average);

        for (int i = 0; i < array.length; i++) {
            if (array[i] > average) {
                System.out.println(array[i]);
            }
        }
        System.out.println("------------------------------------------------------------");
    }
}
