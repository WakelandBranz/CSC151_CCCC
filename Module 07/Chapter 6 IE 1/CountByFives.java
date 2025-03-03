/*
 * By Wakeland Branz
    Write an application that counts by five from 5 through 500 inclusive, and that starts a new line after every multiple of 50 (50, 100, 150, and so on). 
    Save the file as CountByFives.java.
    Modify the CountByFives application so that the user enters the value to count by. Start each new line after 10 values have been displayed. 
    Save the file as CountByAnything.java. 
 */

public class CountByFives {
    public static void main(String[] args) {
        for (int i = 5; i <= 500; i += 5) {
            if (i % 50 == 5) {
                // Print new line since it's after a multiple of 50
                System.out.print("\n" + i + ", ");
            }
            else if (i % 50 == 0) {
                // End line without another comma
                System.out.print(i);
            }
            else {
                // Print normally
                System.out.print(i + ", ");
            }
        }
    }
}
