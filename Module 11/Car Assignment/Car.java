/*
 * By Wakeland Branz
First create a Car class.  It will have three properties and they are make, model and year.  
Create a constructor the will set this three properties after you create getters and setters for each property.  
Add a printProperties method.

 */

 public class Car {
    private String make;
    private String model;
    private int year;
    
    public Car() {
        this.make = "";
        this.model = "";
        this.year = 0;
    }
    
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    
    // Getters
    public String getMake() {
        return make;
    }
    
    public String getModel() {
        return model;
    }
    
    public int getYear() {
        return year;
    }
    
    // Setters
    public void setMake(String make) {
        this.make = make;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
    
    // Print method
    public void printProperties() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

