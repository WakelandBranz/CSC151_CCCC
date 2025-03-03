package BloodData;

public class TestPatient {
    public static void main(String[] args) {
        // Test default constructor
        System.out.println("Testing default constructor:");
        Patient patient1 = new Patient();
        displayPatientInfo(patient1);
        
        // Test overloaded constructor
        System.out.println("\nTesting overloaded constructor:");
        BloodData bloodData = new BloodData("AB", "-");
        Patient patient2 = new Patient(12345, 35, bloodData);
        displayPatientInfo(patient2);
        
        // Test BloodData setters
        System.out.println("\nTesting BloodData setters:");
        BloodData bloodData2 = patient1.getBloodData();
        bloodData2.setBloodType("B");
        bloodData2.setRhFactor("-");
        displayPatientInfo(patient1);
    }
    
    // Helper method to display patient information
    private static void displayPatientInfo(Patient patient) {
        System.out.println("Patient ID: " + patient.getIdNumber());
        System.out.println("Age: " + patient.getAge());
        System.out.println("Blood Type: " + patient.getBloodData().getBloodType());
        System.out.println("Rh Factor: " + patient.getBloodData().getRhFactor());
    }
}
