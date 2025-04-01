/*
 * By Wakeland Branz
Create a TeeShirt class for Toby’s Tee Shirt Company. Fields include an order number, size, color, and price. 
Create set methods for the order number, size, and color and get methods for all four fields. 
The price is determined by the size: $22.99 for XXL or XXXL, and $19.99 for all other sizes. 
Create a subclass named CustomTee that descends from TeeShirt and includes a field to hold the slogan requested for the shirt, and include get and set methods this field.
Write an application that creates two objects of each class, and demonstrate that all the methods work correctly. 
Save the files as TeeShirt.java, CustomTee.java, and DemoTees.java. 
 */

public class CustomTee extends TeeShirt {
    // Additional field for custom slogan
    private String slogan;
    
    // Constructor
    public CustomTee() {
        super();
        slogan = "";
    }
    
    // Constructor with parameters
    public CustomTee(int orderNumber, String size, String color, String slogan) {
        super(orderNumber, size, color);
        this.slogan = slogan;
    }
    
    // Set method for slogan
    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }
    
    // Get method for slogan
    public String getSlogan() {
        return slogan;
    }
}
