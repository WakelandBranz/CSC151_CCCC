/*
 * Wakeland Branz
Herbert’s Home Repair estimates each job cost as the cost of materials plus $35 per hour while on the job, plus $12 per hour for travel time to the job site.
The main() method prompts the user for the name of a job (for example, Smith bathroom remodel), the cost of materials, the number of hours of work required, and the number 
of hours travel time.
Pass the numeric data to a method that computes an estimate for the job and returns the computed value to the main() method which displays the job name and estimated price.
 */

import java.util.Scanner;

public class HerbertsHomeRepair {
    // Price per hour of the job
    private static final double HOURLY_RATE = 35.0;
    // Price per hour of travelling to/from the job
    private static final double TRAVEL_RATE = 12.0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter job name: ");
        String jobName = input.nextLine();
        
        System.out.print("Enter cost of materials: $");
        double materials = input.nextDouble();
        
        System.out.print("Enter work hours required: ");
        double workHours = input.nextDouble();
        
        System.out.print("Enter travel hours: ");
        double travelHours = input.nextDouble();
        
        double estimate = calculateEstimate(materials, workHours, travelHours);
        
        System.out.printf("%nJob: %s%n", jobName);
        System.out.printf("Estimated Cost: $%.2f%n", estimate);
        
        input.close();
    }
    
    public static double calculateEstimate(double materials, double workHours, 
            double travelHours) {
        double laborCost = workHours * HOURLY_RATE;
        double travelCost = travelHours * TRAVEL_RATE;
        return materials + laborCost + travelCost;
    }
}
