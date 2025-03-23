/*
 * By Wakeland Branz
Radio station KJAVA wants a class to keep track of recordings it plays. 
Create a class named Recording that contains fields to hold methods for setting and getting a Recording’s title, artist, and playing time in seconds. 
Save the file as Recording.java.
 */

 public class Recording {
    private String title;
    private String artist;
    private double playTime;
    
    public Recording() {
        this.title = "";
        this.artist = "";
        this.playTime = 0.0;
    }
    
    public Recording(String title, String artist, double playTime) {
        this.title = title;
        this.artist = artist;
        this.playTime = playTime;
    }

    /* GETTERS */
    
    // Getter for title
    public String getTitle() {
        return title;
    }

    // Getter for playTime
    public double getPlayTime() {
        return playTime;
    }

    // Getter for artist
    public String getArtist() {
        return artist;
    }

    /* SETTERS */
    
    // Setter for title
    public void setTitle(String title) {
        this.title = title;
    }
    
    // Setter for artist
    public void setArtist(String artist) {
        this.artist = artist;
    }
    
    // Setter for playTime
    public void setPlayTime(double playTime) {
        this.playTime = playTime;
    }
}