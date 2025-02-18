/*
 * Wakeland Branz
Program the solution in your eclipse IDE, when complete, create a zip file and upload it to Blackboard. Ensure your app prints out the value of each item with explainatory text 
such as

The square root of 37 is 6.12.... 

The sine of 300 is ....... 

The cosine of 300 is .....

Write a Java application that uses the Math class to determine the answers for each of the following:

    The square root of 37
    The sine and cosine of 300
    The value of the floor, ceiling, and round of 22.8
    The larger and the smaller of the character ‘D’ and the integer 71
    A random number between 0 and 20(Hint: The random() method returns a value between 0 and 1; you want a number that is 20 times larger.)
 */

public class MathDemo {
    public static void main(String[] args) {
        double sqrt37 = Math.sqrt(37);
        System.out.printf("The square root of 37 is %.3f%n", sqrt37);
        
        double sin300 = Math.sin(Math.toRadians(300));  // Convert to radians
        double cos300 = Math.cos(Math.toRadians(300));
        System.out.printf("The sine of 300 degrees is %.3f%n", sin300);
        System.out.printf("The cosine of 300 degrees is %.3f%n", cos300);
        
        double number = 22.8;
        System.out.printf("The floor of %.1f is %.0f%n", number, Math.floor(number));
        System.out.printf("The ceiling of %.1f is %.0f%n", number, Math.ceil(number));
        System.out.printf("The rounded value of %.1f is %d%n", number, Math.round(number));
        
        char charD = 'D';
        int num71 = 71;
        System.out.printf("Between 'D' (ASCII %d) and %d:%n", (int)charD, num71);
        System.out.printf("The larger value is %d%n", Math.max(charD, num71));
        System.out.printf("The smaller value is %d%n", Math.min(charD, num71));
        
        double random = Math.random() * 20;
        System.out.printf("A random number between 0 and 20 is %.2f%n", random);
    }
}