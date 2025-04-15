/* 
 * By Wakeland Branz
Create an abstract class named Book. Include a String field for the book’s title and a double field for the book’s price. 
Within the class, include a constructor that requires the book title, and add two get methods—one that returns the title and one that returns the price. 
Include an abstract method named setPrice(). Create two child classes of Book: Fiction and NonFiction. 
Each must include a setPrice() method that sets the price for all Fiction Books to $24.99 and for all NonFiction Books to $37.99. 
Write a constructor for each subclass, and include a call to setPrice() within each. 
Write an application demonstrating that you can create both a Fiction and a NonFiction Book, and display their fields. 
Save the files as Book.java, Fiction.java, NonFiction.java, and UseBook.java.

Write an application named BookArray in which you create an array that holds 10 Books, some Fiction and some NonFiction. 
Using a for loop, display details about all 10 books. Save the file as BookArray.java.
 */

 public class UseBook {
    public static void main(String[] args) {
        Fiction fiction = new Fiction("The Great Gatsby");
        NonFiction nonFiction = new NonFiction("A Brief History of Time");
        
        System.out.println("Fiction Book:");
        System.out.println("Title: " + fiction.getTitle());
        System.out.println("Price: $" + fiction.getPrice());
        
        System.out.println("\nNonFiction Book:");
        System.out.println("Title: " + nonFiction.getTitle());
        System.out.println("Price: $" + nonFiction.getPrice());
    }
}