/*
 * Wakeland Branz
Code the following and when complete zip the project and upload to Blackboard

Create a class named Circle with fields named radius, diameter, and area. Include a constructor that sets the radiusto 1 and calculates the other two values. 
Also include methods named setRadius()and getRadius(). The setRadius()method not only sets the radius, but it also calculates the other two values. 
(The diameter of a circle is twice the radius, and the area of a circle is pi multiplied by the square of the radius. Use the Math class PI constant for this calculation.)

Create aTestCircle class with a main method to test all the functions in your Circle class.
 */

 public class Circle {
    private double radius;
    private double diameter;
    private double area;
    
    // Constructor that sets radius to 1 and calculates other values
    public Circle() {
        setRadius(1.0);
    }
    
    // Getter for radius
    public double getRadius() {
        return radius;
    }
    
    // Setter for radius that also calculates diameter and area
    public void setRadius(double radius) {
        this.radius = radius;
        calculateDiameterAndArea();
    }
    
    // Getter for diameter
    public double getDiameter() {
        return diameter;
    }
    
    // Getter for area
    public double getArea() {
        return area;
    }
    
    // Private helper method to calculate diameter and area
    private void calculateDiameterAndArea() {
        this.diameter = 2 * radius;
        this.area = Math.PI * radius * radius;
    }
}

class TestCircle {
    public static void main(String[] args) {
        // Test default constructor (radius = 1)
        System.out.println("Testing default constructor (radius = 1):");
        Circle circle1 = new Circle();
        displayCircleInfo(circle1);
        
        // Test setRadius with different values
        System.out.println("\nTesting setRadius with radius = 5:");
        circle1.setRadius(5.0);
        displayCircleInfo(circle1);
        
        System.out.println("\nTesting setRadius with radius = 2.5:");
        circle1.setRadius(2.5);
        displayCircleInfo(circle1);
        
        // Test with a very small radius
        System.out.println("\nTesting setRadius with a small radius = 0.1:");
        circle1.setRadius(0.1);
        displayCircleInfo(circle1);
    }
    
    // Helper method to display circle information
    private static void displayCircleInfo(Circle circle) {
        System.out.printf("Radius: %.2f units%n", circle.getRadius());
        System.out.printf("Diameter: %.2f units%n", circle.getDiameter());
        System.out.printf("Area: %.2f square units%n", circle.getArea());
    }
}