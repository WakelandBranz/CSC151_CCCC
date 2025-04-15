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

public class BookArray {
    public static void main(String[] args) {
        Book[] books = new Book[10];
        
        // Create an array with a mix of Fiction and NonFiction books
        books[0] = new Fiction("To Kill a Mockingbird");
        books[1] = new NonFiction("Sapiens");
        books[2] = new Fiction("1984");
        books[3] = new NonFiction("Thinking, Fast and Slow");
        books[4] = new Fiction("The Catcher in the Rye");
        books[5] = new NonFiction("Cosmos");
        books[6] = new Fiction("Lord of the Flies");
        books[7] = new NonFiction("Guns, Germs, and Steel");
        books[8] = new Fiction("The Hobbit");
        books[9] = new NonFiction("Silent Spring");

        // Display details about all books using a for loop
        for (int i = 0; i < books.length; i++) {
            System.out.println("Book " + (i + 1) + ":");
            System.out.println("Title: " + books[i].getTitle());
            System.out.println("Price: $" + books[i].getPrice());
            System.out.println("Type: " + (books[i] instanceof Fiction ? "Fiction" : "NonFiction"));
            System.out.println();
        }
    }
}
