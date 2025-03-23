/*
 * By Wakeland Branz
Modify the DemoSalesperson application so each Salesperson has a successive ID number from 111 through 120 and a sales value that ranges from $25,000 to $70,000, 
increasing by $5,000 for each successive Salesperson. Save the file as DemoSalesperson2.java.
 */

public class DemoSalesperson2 {
    public static void main(String[] args) {
        Salesperson[] salesTeam = new Salesperson[10];
        
        // Base values for IDs and sales
        int baseId = 111;
        double baseSales = 25000.0;
        
        // Create 10 Salesperson objects with successive IDs and increasing sales values
        for (int i = 0; i < salesTeam.length; i++) {
            // Calculate ID and sales value for current salesperson
            int id = baseId + i;  // IDs: 111, 112, 113, ..., 120
            double sales = baseSales + (i * 5000.0);  // Sales: 25000, 30000, 35000, ..., 70000
            
            // Create new Salesperson with calculated values
            salesTeam[i] = new Salesperson(id, sales);
        }
        
        System.out.println("Salesperson Information:");
        System.out.println("------------------------");
        
        for (int i = 0; i < salesTeam.length; i++) {
            System.out.println("Salesperson #" + (i + 1) + ": " + salesTeam[i]);
        }
    }
}
