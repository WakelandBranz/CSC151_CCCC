/*
 * By Wakeland Branz
Create a class named Poem that contains fields for the name of the poem and the number of lines in it. Include a constructor that requires values for both fields. 
Also include get methods to retrieve field values. Create three subclasses: Couplet, Limerick, and Haiku. 
The constructor for each subclass requires only a title; the lines field is set using a constant value. 
A couplet has two lines, a limerick has five lines, and a haiku has three lines. Create an application that demonstrates usage of an object of each type. 
Save the files as Poem.java, Couplet.java, Limerick.java, Haiku.java, and DemoPoems.java. 
 */

 public class Limerick extends Poem {
    // Constant for number of lines
    private static final int LINES = 5;
    
    // Constructor
    public Limerick(String name) {
        super(name, LINES);
    }
    
    // Override display method
    public void display() {
        System.out.println("Limerick: " + getName());
        System.out.println("Lines: " + getLines());
    }
}