/*
 * By Wakeland Branz
Create a class named Salesperson. Data fields for Salesperson include an integer ID number and a double annual sales amount. 
Methods include a constructor that requires values for both data fields, as well as get and set methods for each of the data fields. 
Write an application named DemoSalesperson that declares an array of 10 Salesperson objects. Set each ID number to 9999 and each sales value to zero. 
Display the 10 Salesperson objects. Save the files as Salesperson.java and DemoSalesperson.java.
 */

 public class Salesperson {
    private int idNumber;
    private double annualSales;
    
    public Salesperson(int id, double sales) {
        idNumber = id;
        annualSales = sales;
    }
    
    /* GETTERS */

    public int getIdNumber() {
        return idNumber;
    }

    public double getAnnualSales() {
        return annualSales;
    }

    /* SETTERS */
    
    public void setIdNumber(int id) {
        idNumber = id;
    }
    
    public void setAnnualSales(double sales) {
        annualSales = sales;
    }

    /// I learned this from AP Computer Science A
    @Override
    public String toString() {
        return "Salesperson ID: " + idNumber + ", Annual Sales: $" + annualSales;
    }
}