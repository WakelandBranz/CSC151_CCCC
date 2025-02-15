/*
 * program the solution in your eclipse IDE, when complete, create a zip file and upload it to Blackboard, 

Meadowdale Dairy Farm sells organic brown eggs to local customers. It charges $3.25 for a dozen eggs, or 45 cents for individual eggs that are not part of a dozen. 
Write a program that prompts a user for the number of eggs in the order and then display the amount owed with a full explanation using the following wording: 
You ordered 27 eggs. That’s 2 dozen at $3.25 per dozen and 3 loose eggs at 45 cents each for a total of $7.85.  
You can name the class Eggs.java
 */

 import java.util.Scanner;

 public class Eggs {
     public static void main(String[] args) {
         final double PRICE_PER_DOZEN = 3.25;
         final double PRICE_PER_EGG = 0.45;
         final int EGGS_IN_DOZEN = 12;
         
         Scanner input = new Scanner(System.in);
         
         System.out.print("Enter the number of eggs in your order: ");
         int totalEggs = input.nextInt();
         
         // Calculate dozens and loose eggs
         int dozens = totalEggs / EGGS_IN_DOZEN;
         int looseEggs = totalEggs % EGGS_IN_DOZEN;
         
         // Calculate total cost
         double dozensCost = dozens * PRICE_PER_DOZEN;
         double looseEggsCost = looseEggs * PRICE_PER_EGG;
         double totalCost = dozensCost + looseEggsCost;
         
         System.out.print("You ordered " + totalEggs + " eggs. That's " + dozens + " dozen at $" + PRICE_PER_DOZEN + " per dozen " +
                        "and " + looseEggs + " loose eggs at 45 cents each for a total of $" + totalCost + ".");
         
         input.close();
     }
 }
