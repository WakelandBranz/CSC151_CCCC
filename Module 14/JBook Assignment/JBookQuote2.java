/*
 * By Wakeland Branz
a. Write an application that displays a JFrame containing the opening sentence or two from your favorite book. Save the file as JBookQuote.java. 
b. Add a button to the frame in the JBookQuote program. When the user clicks the button, display the title of the book that contains the quote. Save the file as JBookQuote2.java.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JBookQuote2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Book Quote");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 250);
        
        JLabel quoteLabel = new JLabel("<html>\"Ada! Get back from that window!\"</html>");
        quoteLabel.setFont(new Font("Serif", Font.ITALIC, 16));
        
        JButton titleButton = new JButton("Show Book Title");
        
        JLabel titleLabel = new JLabel("");
        titleLabel.setFont(new Font("Serif", Font.BOLD, 16));
        titleLabel.setForeground(Color.BLUE);
        
        titleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                titleLabel.setText("The War That Saved My Life by Kimberly Brubaker Bradley");
            }
        });
        
        JPanel quotePanel = new JPanel();
        quotePanel.add(quoteLabel);
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(titleButton);
        
        JPanel titlePanel = new JPanel();
        titlePanel.add(titleLabel);
        
        frame.setLayout(new BorderLayout());
        frame.add(quotePanel, BorderLayout.NORTH);
        frame.add(buttonPanel, BorderLayout.CENTER);
        frame.add(titlePanel, BorderLayout.SOUTH);
        
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}