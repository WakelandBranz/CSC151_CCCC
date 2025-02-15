/*
program the solution in your eclipse IDE, when complete, create a zip file and upload it to Blackboard

Write a program that accepts a number of minutes and converts it both to hours and days. For example, 6,000 minutes equals 100 hours and equals 4.167 days. 
Save the program as MinutesConversion.java.
 */

 import java.util.Scanner;

 public class MinutesConversion {
     public static void main(String[] args) {
         final int MINUTES_IN_HOUR = 60;
         final int HOURS_IN_DAY = 24;
         
         Scanner input = new Scanner(System.in);
         
         System.out.print("Enter number of minutes: ");
         int minutes = input.nextInt();
         
         // Calculate conversions
         double hours = (double)minutes / MINUTES_IN_HOUR;
         double days = hours / HOURS_IN_DAY;
         
         System.out.println(minutes + " minutes equals " + hours + " hours and equals " + days + " days.");
         
         input.close();
     }
 }
