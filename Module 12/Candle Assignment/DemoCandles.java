/*
 * By Wakeland Branz
Mick’s Wicks makes candles in various sizes. Create a class for the business named Candle that contains data fields for color, height, and price. 
Create get methods for all three fields. Create set methods for color and height, but not for price. Instead, when height is set, determine the price as $2 per inch. 
Create a child class named ScentedCandle that contains an additional data field named scent and methods to get and set it. 
In the child class, override the parent’s setHeight() method to set the price of a ScentedCandle object at $3 per inch. 
Write an application that instantiates an object of each type and displays the details. Save the files as Candle.java, ScentedCandle.java, and DemoCandles.java. 
 */

 public class DemoCandles {
    public static void main(String[] args) {
        // Instantiate a regular Candle object
        Candle regularCandle = new Candle("Red", 5.0);
        
        // Instantiate a ScentedCandle object
        ScentedCandle scentedCandle = new ScentedCandle("Blue", 6.0, "Vanilla");
        
        // Display details for both candles
        System.out.println("Regular Candle Details:");
        System.out.println("Color: " + regularCandle.getColor());
        System.out.println("Height: " + regularCandle.getHeight() + " inches");
        System.out.println("Price: $" + regularCandle.getPrice());
        
        System.out.println("\nScented Candle Details:");
        System.out.println("Color: " + scentedCandle.getColor());
        System.out.println("Height: " + scentedCandle.getHeight() + " inches");
        System.out.println("Scent: " + scentedCandle.getScent());
        System.out.println("Price: $" + scentedCandle.getPrice());
        
        // Demonstrate changing properties
        System.out.println("\nChanging candle properties...");
        
        regularCandle.setColor("Green");
        regularCandle.setHeight(8.0);
        
        scentedCandle.setColor("Purple");
        scentedCandle.setHeight(7.0);
        scentedCandle.setScent("Lavender");
        
        // Display updated details
        System.out.println("\nUpdated Regular Candle Details:");
        System.out.println("Color: " + regularCandle.getColor());
        System.out.println("Height: " + regularCandle.getHeight() + " inches");
        System.out.println("Price: $" + regularCandle.getPrice());
        
        System.out.println("\nUpdated Scented Candle Details:");
        System.out.println("Color: " + scentedCandle.getColor());
        System.out.println("Height: " + scentedCandle.getHeight() + " inches");
        System.out.println("Scent: " + scentedCandle.getScent());
        System.out.println("Price: $" + scentedCandle.getPrice());
    }
}