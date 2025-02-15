package Student;

public class ShowStudent {
    public static void main(String[] args) {
        // Test constructor initialization
        System.out.println("Testing constructor initialization:");
        Student student1 = new Student();
        student1.displayStudent();
        
        System.out.println("\nTesting setters:");
        // Test setting custom values
        Student student2 = new Student();
        student2.setIdNumber(1234);
        student2.setCreditHours(15);
        student2.setPoints(45);
        student2.displayStudent();
    }
}
