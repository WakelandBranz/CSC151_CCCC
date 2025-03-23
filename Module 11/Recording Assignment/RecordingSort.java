/*
 * By Wakeland Branz
Write an application that instantiates five Recording objects and prompts the user for values for the data fields. 
Then prompt the user to enter which field the Recordings should be sorted by—song title, artist, or playing time. 
Perform the requested sort procedure, and display the Recording objects. Save the file as RecordingSort.java.
 */

import java.util.Scanner;

public class RecordingSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Recording[] recordings = new Recording[5];
        
        // Prompt user for Recording data
        for (int i = 0; i < recordings.length; i++) {
            recordings[i] = new Recording();
            System.out.println("\nEnter data for Recording #" + (i + 1));
            
            System.out.print("Enter title: ");
            recordings[i].setTitle(scanner.nextLine());
            
            System.out.print("Enter artist: ");
            recordings[i].setArtist(scanner.nextLine());
            
            System.out.print("Enter playing time in seconds: ");
            try {
                recordings[i].setPlayTime(Double.parseDouble(scanner.nextLine()));
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Setting play time to 0.");
                recordings[i].setPlayTime(0);
            }
        }
        
        // Prompt user for sort field
        System.out.println("\nSort by:");
        System.out.println("1 - Title");
        System.out.println("2 - Artist");
        System.out.println("3 - Playing Time");
        System.out.print("Enter your choice (1-3): ");
        
        int sortChoice = 1; // Default to sorting by title
        try {
            sortChoice = Integer.parseInt(scanner.nextLine());
            if (sortChoice < 1 || sortChoice > 3) {
                System.out.println("Invalid choice. Defaulting to sort by title.");
                sortChoice = 1;
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Defaulting to sort by title.");
        }

        // Sort the recordings based on user choice
        switch (sortChoice) {
            case 1: // Sort by title
                sortTitle(recordings);
                System.out.println("\nRecordings sorted by title:");
                break;
            case 2: // Sort by artist
                sortArtist(recordings);
                System.out.println("\nRecordings sorted by artist:");
                break;
            case 3: // Sort by playing time
                sortTime(recordings);
                System.out.println("\nRecordings sorted by playing time:");
                break;
        }

        displayRecordings(recordings);
        
        scanner.close();
    }

    private static void sortTitle(Recording[] recordings) {
        Recording temp;
        for(int i = 0; i < recordings.length; i++) {
            for(int j = 0; j < recordings.length - 1; j++) {
                if(recordings[j].getTitle().compareToIgnoreCase(recordings[j + 1].getTitle()) > 0) {
                    temp = recordings[j];
                    recordings[j] = recordings[j + 1];
                    recordings[j + 1] = temp;
                }
            }
        }
    }

    private static void sortArtist(Recording[] recordings) {
        Recording temp;
        for(int i = 0; i < recordings.length; i++) {
            for(int j = 0; j < recordings.length - 1; j++) {
                if(recordings[j].getArtist().compareToIgnoreCase(recordings[j + 1].getArtist()) > 0) {
                    temp = recordings[j];
                    recordings[j] = recordings[j + 1];
                    recordings[j + 1] = temp;
                }
            }
        }
    }

    private static void sortTime(Recording[] recordings) {
        Recording temp;
        for(int i = 0; i < recordings.length; i++) {
            for(int j = 0; j < recordings.length - 1; j++) {
                if(recordings[j].getPlayTime() > recordings[j + 1].getPlayTime()) {
                    temp = recordings[j];
                    recordings[j] = recordings[j + 1];
                    recordings[j + 1] = temp;
                }
            }
        }
    }

    private static void displayRecordings(Recording[] recordings) {
        System.out.println("\n----------------------------------------------");
        System.out.printf("%-25s %-25s %-10s\n", "TITLE", "ARTIST", "TIME (sec)");
        System.out.println("----------------------------------------------");
        
        for (Recording recording : recordings) {
            System.out.printf("%-25s %-25s %-10.2f\n", 
                              recording.getTitle(), 
                              recording.getArtist(), 
                              recording.getPlayTime());
        }
        System.out.println("----------------------------------------------");
    }
}
