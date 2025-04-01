/*
 * By Wakeland Branz
Create a TeeShirt class for Toby’s Tee Shirt Company. Fields include an order number, size, color, and price. 
Create set methods for the order number, size, and color and get methods for all four fields. 
The price is determined by the size: $22.99 for XXL or XXXL, and $19.99 for all other sizes. 
Create a subclass named CustomTee that descends from TeeShirt and includes a field to hold the slogan requested for the shirt, and include get and set methods this field.
Write an application that creates two objects of each class, and demonstrate that all the methods work correctly. 
Save the files as TeeShirt.java, CustomTee.java, and DemoTees.java. 
 */

 public class TeeShirt {
    // Fields
    private int orderNumber;
    private String size;
    private String color;
    private double price;
    
    // Constructor
    public TeeShirt() {
        orderNumber = 0;
        size = "";
        color = "";
        price = 0.0;
    }
    
    // Constructor with parameters
    public TeeShirt(int orderNumber, String size, String color) {
        this.orderNumber = orderNumber;
        setSize(size); // This will also set the price
        this.color = color;
    }

    /* SETTERS */
    
    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }
    
    public void setSize(String size) {
        this.size = size;
        // Set price based on size
        if(size.equals("XXL") || size.equals("XXXL")) {
            this.price = 22.99;
        } else {
            this.price = 19.99;
        }
    }
    
    public void setColor(String color) {
        this.color = color;
    }

    /* GETTERS */
    
    public int getOrderNumber() {
        return orderNumber;
    }
    
    public String getSize() {
        return size;
    }
    
    public String getColor() {
        return color;
    }
    
    public double getPrice() {
        return price;
    }
}