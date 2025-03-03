/*
 * By Wakeland Branz
The Freemont Automobile Factory has discovered that the longer a worker has been on the job, the more parts the worker can produce. 
Write an application that computes and displays a worker’s anticipated output each month for 24 months assuming the worker starts by producing 4,000 parts and increases 
production by 6 percent each month. Also display the month in which production exceeds 7,000 parts (when the worker deserves a raise!). 
Save the file as IncreasedProduction.java.
 */

public class IncreasedProduction {
    public static void main(String[] args) {
        final double BASE_PRODUCTION = 4000;
        final double MONTHLY_INCREASE = 0.06;
        final double RAISE_PRODUCTION_THRESHOLD = 7000;

        double currentProduction = BASE_PRODUCTION;
        int raiseMonth = 0;
        boolean raiseFound = false;

        for (int i = 1; i <= 24; i++) {
            System.out.printf("Month %d worker production: %.2f\n", i, currentProduction);

            // Check if production exceeds raise threshold
            if (!raiseFound && currentProduction > RAISE_PRODUCTION_THRESHOLD) {
                raiseMonth = i;
                raiseFound = true;
            }
            
            // Increase production for next month
            currentProduction *= (1 + MONTHLY_INCREASE);
        }

        System.out.println("\nThe worker deserves a raise in month " + raiseMonth + " when production exceeds 7,000 parts.");
    }
}
