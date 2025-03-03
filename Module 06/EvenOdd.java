/*
 * Wakeland Branz
Write an application that asks a user to enter an integer. 
Display a statement that indicates whether the integer is even or odd. Save the file as EvenOdd.java.
*/
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        }
        else {
            System.out.println(number + " is odd.");
        }

        input.close();
    }
}