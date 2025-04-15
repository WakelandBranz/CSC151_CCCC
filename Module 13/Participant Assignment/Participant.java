/*
 * By Wakeland Branz
The Cullerton Park District holds a mini-Olympics each summer. Create a class named Participant with fields for a name, age, and street address. 
Include a constructor that assigns parameter values to each field and a toString() method that returns a String containing all the values. 
Also include an equals() method that determines two Participants are equal if they have the same values in all three fields. 
Create an application with two arrays of at least eight Participants each--one holds Participants in the mini-marathon, and the other holds Participants in the diving competition. 
Prompt the user for participant values. After the data values are entered, display values for Participants who are in both events. 
Save the files as Participant.java and TwoEventParticipants.java.
 */

public class Participant {
    private String name;
    private int age;
    private String streetAddress;

    public Participant(String name, int age, String streetAddress) {
        this.name = name;
        this.age = age;
        this.streetAddress = streetAddress;
    }
    
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Address: " + streetAddress;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        
        Participant other = (Participant) obj;
        
        return age == other.age && 
               name.equals(other.name) && 
               streetAddress.equals(other.streetAddress);
    }
}
