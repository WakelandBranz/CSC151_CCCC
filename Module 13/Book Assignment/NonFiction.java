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

 public class NonFiction extends Book {
    public NonFiction(String title) {
        super(title);
        setPrice();
    }
    
    @Override
    public void setPrice() {
        setBookPrice(37.99);
    }
}