/*
 * By Wakeland Branz
Create a class named Poem that contains fields for the name of the poem and the number of lines in it. Include a constructor that requires values for both fields. 
Also include get methods to retrieve field values. Create three subclasses: Couplet, Limerick, and Haiku. 
The constructor for each subclass requires only a title; the lines field is set using a constant value. 
A couplet has two lines, a limerick has five lines, and a haiku has three lines. Create an application that demonstrates usage of an object of each type. 
Save the files as Poem.java, Couplet.java, Limerick.java, Haiku.java, and DemoPoems.java. 
 */

public class DemoPoems {
    public static void main(String[] args) {
        // Create one object of each poem type
        Poem genericPoem = new Poem("Ode to Java", 12);
        Couplet couplet = new Couplet("Roses are Red");
        Limerick limerick = new Limerick("There Once Was a Programmer");
        Haiku haiku = new Haiku("Autumn Leaves");
        
        // Display information about each poem
        System.out.println("Different Types of Poems:\n");
        
        System.out.println("Generic Poem:");
        genericPoem.display();
        System.out.println();
        
        System.out.println("Couplet:");
        couplet.display();
        System.out.println();
        
        System.out.println("Limerick:");
        limerick.display();
        System.out.println();
        
        System.out.println("Haiku:");
        haiku.display();
        System.out.println();
        
        // Demonstrate polymorphism with an array of Poem objects
        System.out.println("Demonstrating Polymorphism:");
        Poem[] poems = {genericPoem, couplet, limerick, haiku};
        
        for(Poem poem : poems) {
            poem.display();
            System.out.println();
        }
    }
}
