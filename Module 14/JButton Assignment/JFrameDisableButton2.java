/*
 * By Wakeland Branz
2 a. Write an application that instantiates a JFrame that contains a JButton. Disable the JButton after the user clicks it. Save the file as JFrameDisableButton.java.
b. Modify the JFrameDisableButton program so that the JButton is not disabled until the user has clicked at least eight times. 
At that point, display a JLabel that indicates “That’s enough!”. Save the file as JFrameDisableButton2.java.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JFrameDisableButton2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Disable Button Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        
        JPanel buttonPanel = new JPanel();
        JButton button = new JButton("Click Me");
        
        JPanel messagePanel = new JPanel();
        JLabel messageLabel = new JLabel("");
        messagePanel.add(messageLabel);
        
        final int[] clickCount = {0};
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickCount[0]++;
                button.setText("Clicks: " + clickCount[0]);
                
                if (clickCount[0] >= 8) {
                    button.setEnabled(false);
                    messageLabel.setText("That's enough!");
                }
            }
        });
        
        buttonPanel.add(button);
        panel.add(buttonPanel, BorderLayout.CENTER);
        panel.add(messagePanel, BorderLayout.SOUTH);
        
        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}