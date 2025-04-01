/*
 * By Wakeland Branz
Create a TeeShirt class for Toby’s Tee Shirt Company. Fields include an order number, size, color, and price. 
Create set methods for the order number, size, and color and get methods for all four fields. 
The price is determined by the size: $22.99 for XXL or XXXL, and $19.99 for all other sizes. 
Create a subclass named CustomTee that descends from TeeShirt and includes a field to hold the slogan requested for the shirt, and include get and set methods this field.
Write an application that creates two objects of each class, and demonstrate that all the methods work correctly. 
Save the files as TeeShirt.java, CustomTee.java, and DemoTees.java. 
 */

 public class DemoTees {
    public static void main(String[] args) {
        // Create two TeeShirt objects
        TeeShirt tee1 = new TeeShirt(101, "L", "Blue");
        TeeShirt tee2 = new TeeShirt(102, "XXL", "Black");
        
        // Create two CustomTee objects
        CustomTee custom1 = new CustomTee(201, "M", "Red", "OOP Stinks!");
        CustomTee custom2 = new CustomTee(202, "XXXL", "Green", "OOP Is Awesome!");
        
        // Display information for all four shirts
        System.out.println("Regular T-Shirts:");
        displayShirt(tee1);
        displayShirt(tee2);
        
        System.out.println("\nCustom T-Shirts:");
        displayCustomShirt(custom1);
        displayCustomShirt(custom2);
        
        // Demonstrate changing values
        System.out.println("\nChanging shirt properties...");
        
        // Change regular shirt properties
        tee1.setSize("XXXL");
        tee1.setColor("Yellow");
        
        tee2.setOrderNumber(103);
        tee2.setSize("S");
        
        // Change custom shirt properties
        custom1.setSize("XXL");
        custom1.setSlogan("Java Bleh!");
        
        custom2.setColor("Purple");
        custom2.setOrderNumber(203);
        
        // Display updated information
        System.out.println("\nUpdated Regular T-Shirts:");
        displayShirt(tee1);
        displayShirt(tee2);
        
        System.out.println("\nUpdated Custom T-Shirts:");
        displayCustomShirt(custom1);
        displayCustomShirt(custom2);
    }
    
    // Helper method to display TeeShirt information
    public static void displayShirt(TeeShirt shirt) {
        System.out.println("\nOrder #: " + shirt.getOrderNumber());
        System.out.println("Size: " + shirt.getSize());
        System.out.println("Color: " + shirt.getColor());
        System.out.println("Price: $" + shirt.getPrice());
    }
    
    // Helper method to display CustomTee information
    public static void displayCustomShirt(CustomTee shirt) {
        displayShirt(shirt); // Display the basic shirt info
        System.out.println("Slogan: " + shirt.getSlogan());
    }
}
