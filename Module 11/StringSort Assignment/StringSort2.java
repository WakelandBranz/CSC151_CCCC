/*
 * By Wakeland Branz
Write an application that accepts any number of String values from a user up to 15, and display them in ascending order. Save the file as StringSort2.java.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class StringSort2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> userStrings = new ArrayList<String>();

        System.out.println("Input up to 15 strings. Enter 'done' to finish early.");
        int count = 0;
        while (count < 15) {
            System.out.print("> ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("done")) {
                break;
            }
            else if (input.equals("")) {
                System.out.println("Detected no input. Restarting last input.");
                continue;
            }
            
            userStrings.add(input);
            count++;
        }

        System.out.println("--- User-inputted strings out of order ---");
        for (int i = 0; i < userStrings.size(); i++) {
            System.out.println(userStrings.get(i));
        }

        // Sort strings in ascending order
        sortStrings(userStrings);

        System.out.println("--- User-inputted strings in order ---");
        for (int i = 0; i < userStrings.size(); i++) {
            System.out.println(userStrings.get(i));
        }

        scanner.close();
    }

    private static void sortStrings(ArrayList<String> strings) {
        String temp;
        for(int i = 0; i < strings.size(); i++) {
            for(int j = 0; j < strings.size() - 1; j++) {
                if(strings.get(j).compareToIgnoreCase(strings.get(j + 1)) > 0) {
                    temp = strings.get(j);
                    strings.set(j, strings.get(j + 1));
                    strings.set(j + 1, temp);
                }
            }
        }
    }
}
