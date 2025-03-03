package BloodData;

public class Patient {
    private int idNumber;
    private int age;
    private BloodData bloodData;

    // Default constructor
    public Patient() {
        idNumber = 0;
        age = 0;
        bloodData = new BloodData(); // This will set blood type to O and Rh to +
    }
    
    // Overloaded constructor
    public Patient(int idNumber, int age, BloodData bloodData) {
        this.idNumber = idNumber;
        this.age = age;
        this.bloodData = bloodData;
    }
    
    // Getter for ID number
    public int getIdNumber() {
        return idNumber;
    }
    
    // Getter for age
    public int getAge() {
        return age;
    }
    
    // Getter for blood data
    public BloodData getBloodData() {
        return bloodData;
    }
}
