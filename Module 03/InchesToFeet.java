/*
8. Write a program that declares a variable named inches, which holds a length in inches, and assign a value. 
Display the value in feet and inches; for example: 86 inches is 7 feet and 2 inches. Be sure to use a named constant where appropriate. 
You can name the class InchesToFeet.java.
9. Write an interactive version of the InchesToFeet class that accepts the inches value from a user. 
 */

public class InchesToFeet {
    public static void main(String[] args) {
        final int INCHES_IN_FOOT = 12;
        
        int inches = 86;
        
        int feet = inches / INCHES_IN_FOOT;
        int remainingInches = inches % INCHES_IN_FOOT;
        
        System.out.println(inches + " inches is " + feet + " feet and " + remainingInches + " inches");
    }
}
