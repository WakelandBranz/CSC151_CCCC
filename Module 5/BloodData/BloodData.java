/*
 * Wakeland Branz
    Create a class named BloodData that includes fields that hold a blood type (the four blood types are O, A, B, and AB) and an Rh factor (the factors are + and –). 
    Create a default constructor that sets the fields to O and +, and an overloaded constructor that requires values for both fields. Include get and set methods for each field.
    Create a class named Patient that includes an ID number, age, and BloodData. Provide a default constructor that sets the ID number to 0, the age to 0, and the BloodData 
    values to O and +. Create an overloaded constructor that provides values for each field. Also provide get methods for each field. Save the file as Patient.java. 
    Create an application that demonstrates that each method works correctly, and save it as TestPatient.java
 */

package BloodData;

public class BloodData {
    private String bloodType;
    private String rhFactor;
    
    // Default constructor
    public BloodData() {
        bloodType = "O";
        rhFactor = "+";
    }
    
    // Overloaded constructor
    public BloodData(String bloodType, String rhFactor) {
        this.bloodType = bloodType;
        this.rhFactor = rhFactor;
    }
    
    // Getter for blood type
    public String getBloodType() {
        return bloodType;
    }
    
    // Setter for blood type
    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }
    
    // Getter for Rh factor
    public String getRhFactor() {
        return rhFactor;
    }
    
    // Setter for Rh factor
    public void setRhFactor(String rhFactor) {
        this.rhFactor = rhFactor;
    }
}
