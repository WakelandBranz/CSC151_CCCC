/*
 * By Wakeland Branz
Create a class named Salesperson. Data fields for Salesperson include an integer ID number and a double annual sales amount. 
Methods include a constructor that requires values for both data fields, as well as get and set methods for each of the data fields. 
Write an application named DemoSalesperson that declares an array of 10 Salesperson objects. Set each ID number to 9999 and each sales value to zero. 
Display the 10 Salesperson objects. Save the files as Salesperson.java and DemoSalesperson.java.
 */

public class DemoSalesperson {
    public static void main(String[] args) {
        Salesperson[] salesTeam = new Salesperson[10];
        
        // Create 10 Salesperson objects with ID 9999 and sales value 0
        for (int i = 0; i < salesTeam.length; i++) {
            salesTeam[i] = new Salesperson(9999, 0.0);
        }
        
        System.out.println("Salesperson Information:");
        System.out.println("------------------------");
        
        for (int i = 0; i < salesTeam.length; i++) {
            System.out.println("Salesperson #" + (i + 1) + ": " + salesTeam[i]);
        }
    }
}
