/*
 * Wakeland Branz
    1. Create a class named Student that has fields for an ID number, number of credit hours earned, and number of points earned. (For example, many schools compute grade point 
    averages based on a scale of 4, so a three-credit-hour class in which a student earns an A is worth 12 points.) Include methods to assign values to all fields. A Student also 
    has a field for grade point average. Include a method to compute the grade point average field by dividing points by credit hours earned. Write methods to display the values 
    in each Student field.
    2. Use class named ShowStudent that instantiates a Student object to test your class. Compute the Student grade point average, and then display all the values associated with 
    the Student.
    3. Create a constructor for the Studentclass you created. The constructor should initialize each Student’s ID number to 9999, his or her points earned to 12, and credit hours 
    to 3(resulting in a grade point average of 4.0). Write a program that demonstrates that the constructor works by instantiating an object and displaying the initial values.
 */ 

package Student;

public class Student {
    private int idNumber;
    private int creditHours;
    private int points;
    private double gpa;

    // Default constructor with specified initial values
    public Student() {
        idNumber = 9999;
        points = 12;
        creditHours = 3;
        computeGPA();
    }

      // Setters
      public void setIdNumber(int id) {
        idNumber = id;
    }
    
    public void setCreditHours(int hours) {
        creditHours = hours;
        computeGPA();
    }
    
    public void setPoints(int pts) {
        points = pts;
        computeGPA();
    }

    // Method to compute GPA
    private void computeGPA() {
        if (creditHours != 0) {
            gpa = (double)points / creditHours;
        } else {
            gpa = 0.0;
        }
    }
    
    // Display method
    public void displayStudent() {
        System.out.println("Student ID: " + idNumber);
        System.out.println("Credit Hours: " + creditHours);
        System.out.println("Points Earned: " + points);
        System.out.printf("GPA: %.2f%n", gpa);
    }
}
