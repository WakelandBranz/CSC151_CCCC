/*
 * Wakeland Branz
Create a class named Billing that includes three overloaded computeBill()methods for a photo book store.

• When computeBill() receives a single parameter, it represents the price of one photo book ordered. Add 8% tax, and return the total due.

• When computeBill() receives two parameters, they represent the price of a photo book and the quantity ordered. Multiply the two values, add 8% tax, and return the total due.

• When computeBill() receives three parameters, they represent the price of a photo book, the quantity ordered, and a coupon value. Multiply the quantity and price, 
reduce the result by the coupon value, and then add 8% tax and return the total due.
 */

public class Billing {
    // Method 1: Takes single parameter for price
    public double computeBill(double price) {
        double subtotal = price;
        double tax = subtotal * 0.08;
        return subtotal + tax;
    }

    // Method 2: Takes price and quantity as parameters
    public double computeBill(double price, int quantity) {
        double subtotal = price * quantity;
        double tax = subtotal * 0.08;
        return subtotal + tax;
    }

    // Method 3: Takes price, quantity, coupon value
    public double computeBill(double price, int quantity, double coupon) {
        double subtotal = (price * quantity) - coupon;
        double tax = subtotal * 0.08;
        return subtotal + tax;
    }

    public static void main(String[] args) {
        Billing bill = new Billing();
        System.out.println(bill.computeBill(10.00));              // Single book
        System.out.println(bill.computeBill(10.00, 2));           // Two books
        System.out.println(bill.computeBill(10.00, 2, 5.00));     // Two books with $5 coupon
    }
}
