/*
 * Assignment description:
 * Write, compile, and test a class that displays the pattern shown in Figure 1-26. You can name this class Triangle.java
 * Pattern looks like this:
        T
       TTT
      TTTTT
     TTTTTTT
    TTTTTTTTT
   TTTTTTTTTTT
  TTTTTTTTTTTTT
 */

public class Triangle {
    public static void main(String[] args) {
        int rows = 7;

        // Had a little fun with this
        for (int i = 0; i < rows; i++) {
            // Calculate and print spaces needed
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }
            
            // Calculate and print characters needed
            // (for example, if we are on row 2 [index 1] then we print 3 since 2 * 1 + 1 = 3)
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("T");
            }
            
            System.out.println();
        }
    }
}
