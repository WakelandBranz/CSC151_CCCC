/*
 * By Wakeland Branz
a. Write an application that displays a JFrame containing the opening sentence or two from your favorite book. Save the file as JBookQuote.java. 
b. Add a button to the frame in the JBookQuote program. When the user clicks the button, display the title of the book that contains the quote. Save the file as JBookQuote2.java.
 */

import javax.swing.*;
import java.awt.*;

public class JBookQuote {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Book Quote");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 200);
        
        JLabel quoteLabel = new JLabel("<html>\"Ada! Get back from that window!\"</html>");
        quoteLabel.setFont(new Font("Serif", Font.ITALIC, 16));
        
        JPanel panel = new JPanel();
        panel.add(quoteLabel);
        
        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}