/*
 * By Wakeland Branz
Write an application containing an array of 15 String values (that are not originally in alphabetical order), and display them in ascending order. 
Save the file as StringSort.java.
 */

public class StringSort {
    public static void main(String[] args) {
        final String[] STRINGS = {
            "zebra",
            "mountain",
            "coffee",
            "piano",
            "jellyfish",
            "garden",
            "window",
            "apple",
            "ticket",
            "rainbow",
            "dragon",
            "bicycle",
            "notebook",
            "oxygen",
            "forest"
        };

        System.out.println("--- Strings out of order ---");
        for (int i = 0; i < STRINGS.length; i++) {
            System.out.println(STRINGS[i]);
        }

        // Sort strings in ascending order
        sortStrings(STRINGS);

        System.out.println("--- Strings in order ---");
        for (int i = 0; i < STRINGS.length; i++) {
            System.out.println(STRINGS[i]);
        }
    }

    private static void sortStrings(String[] strings) {
        String temp;
        for(int i = 0; i < strings.length; i++) {
            for(int j = 0; j < strings.length - 1; j++) {
                if(strings[j].compareToIgnoreCase(strings[j + 1]) > 0) {
                    temp = strings[j];
                    strings[j] = strings[j + 1];
                    strings[j + 1] = temp;
                }
            }
        }
    }
}
