/*
 * By Wakeland Branz
Write an application that uses a loop to create the pattern of Os shown in Figure 6-32, in which each O is displayed one additional space to the right. 
Save the file as DiagonalOs.java.
Figure 6-32
Output of the DiagonalOs application
 */

public class DiagonalOs {
    public static void main(String[] args) {
        final int NUM_LINES = 10;

        // Print 10 diagonal Os
        for (int i = 0; i < NUM_LINES; i++) {
            // Print the corresponding number of spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Now print the O
            System.out.println("O");
        }
    }
}
