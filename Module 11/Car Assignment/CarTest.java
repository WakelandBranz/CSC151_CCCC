/*
 * By Wakeland Branz
Create a CarTest class.  
You will create three Car objects, put them in an ArrayList and pass the list to a function that will take the objects out of the list and print the object’s properties

*/

 import java.util.ArrayList;

 public class CarTest {
    public static void main(String[] args) {
        // Create three Car objects
        Car car1 = new Car("Toyota", "Camry", 2020);
        Car car2 = new Car("Honda", "Civic", 2019);
        Car car3 = new Car("Ford", "Mustang", 2021);
        
        // Add them to an ArrayList
        ArrayList<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        
        // Pass the list to a function that will print properties
        printCarProperties(carList);
    }
    
    // Function to print properties of all cars in the list
    public static void printCarProperties(ArrayList<Car> cars) {
        System.out.println("Car List Properties:");
        System.out.println("====================");
        
        for (int i = 0; i < cars.size(); i++) {
            System.out.println("Car #" + (i + 1) + ":");
            cars.get(i).printProperties();
            System.out.println();
        }
    }
 }
