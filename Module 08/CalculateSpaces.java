/*
 * By Wakeland Branz
 Create a program that contains a String that holds your favorite inspirational quote. Pass the quote to the calculateSpaces method and return the number of spaces
 to be displayed in the main method. 
 */

public class CalculateSpaces {
    public static void main(String[] args) {
       String quote = "\"I begin to speak only when I'm certain what I'll say isn't better left unsaid.\" ~ Cato";

        int numberOfSpaces = calculateSpaces(quote);
        System.out.println("The quote: " + quote + "");
        System.out.println("Number of spaces in the quote: " + numberOfSpaces);
    }

    public static int calculateSpaces(String text) {
        int spaceCount = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        return spaceCount;
    }
}
