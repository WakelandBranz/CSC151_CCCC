/*
 * By Wakeland Branz
The Cullerton Park District holds a mini-Olympics each summer. Create a class named Participant with fields for a name, age, and street address. 
Include a constructor that assigns parameter values to each field and a toString() method that returns a String containing all the values. 
Also include an equals() method that determines two Participants are equal if they have the same values in all three fields. 
Create an application with two arrays of at least eight Participants each--one holds Participants in the mini-marathon, and the other holds Participants in the diving competition. 
Prompt the user for participant values. After the data values are entered, display values for Participants who are in both events. 
Save the files as Participant.java and TwoEventParticipants.java.
 */

import java.util.Scanner;

public class TwoEventParticipants {
    public static void main(String[] args) {
        final int NUM_PARTICIPANTS = 8;
        Scanner input = new Scanner(System.in);
        
        // Create arrays for each event
        Participant[] marathonParticipants = new Participant[NUM_PARTICIPANTS];
        Participant[] divingParticipants = new Participant[NUM_PARTICIPANTS];
        
        // Get marathon participants data
        System.out.println("Enter data for Marathon participants:");
        for (int i = 0; i < NUM_PARTICIPANTS; i++) {
            System.out.println("\nParticipant #" + (i + 1));
            marathonParticipants[i] = getParticipantData(input);
        }
        
        // Get diving participants data
        System.out.println("\nEnter data for Diving participants:");
        for (int i = 0; i < NUM_PARTICIPANTS; i++) {
            System.out.println("\nParticipant #" + (i + 1));
            divingParticipants[i] = getParticipantData(input);
        }
        
        // Display participants who are in both events
        System.out.println("\nParticipants in both events:");
        boolean foundCommonParticipants = false;
        
        for (int i = 0; i < NUM_PARTICIPANTS; i++) {
            for (int j = 0; j < NUM_PARTICIPANTS; j++) {
                if (marathonParticipants[i].equals(divingParticipants[j])) {
                    System.out.println(marathonParticipants[i]);
                    foundCommonParticipants = true;
                }
            }
        }
        
        if (!foundCommonParticipants) {
            System.out.println("No participants are registered for both events.");
        }
        
        input.close();
    }
    
    // Helper method to get participant data from user
    private static Participant getParticipantData(Scanner input) {
        System.out.print("Enter name: ");
        String name = input.nextLine();
        
        System.out.print("Enter age: ");
        int age = Integer.parseInt(input.nextLine());
        
        System.out.print("Enter street address: ");
        String address = input.nextLine();
        
        return new Participant(name, age, address);
    }
}
