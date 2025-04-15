/*
 * By Wakeland Branz
Create an interface named Turner, with a single method named turn(). Create a class named Leaf that implements turn() to display Changing colors. 
Create a class named Page that implements turn() to display Going to the next page. Create a class named Pancake that implements turn() to display Flipping. 
Write an application named DemoTurners that creates one object of each of these class types and demonstrates the turn() method for each class. 
Save the files as Turner.java, Leaf.java, Page.java, Pancake.java, and DemoTurners.java.
Think of two more objects that use turn(), create classes for them, and then add objects to the DemoTurners application, renaming it DemoTurners2.java. 
Save the files, using the names of new objects that use turn().
 */

 public class DemoTurners {
    public static void main(String[] args) {
        // Create objects of each class type
        Turner leaf = new Leaf();
        Turner page = new Page();
        Turner pancake = new Pancake();
        Turner tide = new Tide();
        Turner key = new Key();
        
        // Demonstrate the turn() method for each object
        System.out.println("Turning a Leaf:");
        leaf.turn();
        
        System.out.println("\nTurning a Page:");
        page.turn();
        
        System.out.println("\nTurning a Pancake:");
        pancake.turn();

        System.out.println("\nTurning a tide:");
        tide.turn();

        System.out.println("\nTurning a key:");
        key.turn();
    }
}