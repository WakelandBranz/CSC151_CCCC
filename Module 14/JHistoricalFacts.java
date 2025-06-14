/*
 * By Wakeland Branz
Create an application with a JFrame and at least five labels that contain interesting historical facts. 
Every time the user clicks a JButton, remove one of the labels and add a different one. Save the file as JHistoricalFacts.java
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;

public class JHistoricalFacts extends JFrame implements ActionListener {
    private JPanel factPanel;
    private JButton changeButton;
    private ArrayList<JLabel> currentLabels;
    private ArrayList<String> allFacts;
    private Random random;
    
    public JHistoricalFacts() {
        super("Historical Facts");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLayout(new BorderLayout());
        
        // Initialize collections
        currentLabels = new ArrayList<>();
        allFacts = new ArrayList<>();
        random = new Random();
        
        // Add facts to the collection
        populateFactsList();
        
        // Create the panel to hold facts
        factPanel = new JPanel();
        factPanel.setLayout(new BoxLayout(factPanel, BoxLayout.Y_AXIS));
        factPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        
        // Create the button
        changeButton = new JButton("Show Another Fact");
        changeButton.addActionListener(this);
        
        // Initialize with 5 facts
        for (int i = 0; i < 5; i++) {
            addNewFact();
        }
        
        // Add components to the frame
        add(factPanel, BorderLayout.CENTER);
        add(changeButton, BorderLayout.SOUTH);
        
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    /* GENERATED BY CLAUDE! */
    private void populateFactsList() {
        // Add many historical facts
        allFacts.add("The Great Wall of China took over 2,000 years to build.");
        allFacts.add("Ancient Egyptians used to mummify not just humans, but cats, crocodiles, and other animals.");
        allFacts.add("The printing press was invented by Johannes Gutenberg around 1440.");
        allFacts.add("The shortest war in history was between Britain and Zanzibar in 1896, lasting only 38 minutes.");
        allFacts.add("Vikings used melted snow mixed with ash as soap for washing.");
        allFacts.add("The Leaning Tower of Pisa was never straight. It started leaning during construction.");
        allFacts.add("Cleopatra lived closer in time to the invention of the iPhone than to the building of the Great Pyramid of Giza.");
        allFacts.add("The first computer programmer was a woman, Ada Lovelace, in the 1840s.");
        allFacts.add("The ancient Romans used crushed mouse brains as toothpaste.");
        allFacts.add("During the 1908 Olympics in London, the marathon was extended so it would finish in front of the royal family's viewing box.");
        allFacts.add("Ancient Olympic athletes competed in the nude.");
        allFacts.add("Ice cream cones were popularized at the 1904 World's Fair in St. Louis.");
        allFacts.add("Napoleon Bonaparte was once attacked by thousands of rabbits when hunting.");
        allFacts.add("The world's oldest known living tree is over 5,000 years old.");
        allFacts.add("In Ancient Rome, committing suicide was seen as an honorable death.");
    }
    
    private void addNewFact() {
        // Get a random fact that isn't currently displayed
        String newFact = getUniqueRandomFact();
        
        // Create and format a new label
        JLabel factLabel = new JLabel(newFact);
        factLabel.setFont(new Font("Serif", Font.PLAIN, 14));
        factLabel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));
        
        // Add to our tracking list and panel
        currentLabels.add(factLabel);
        factPanel.add(factLabel);
        
        // Refresh the panel
        factPanel.revalidate();
        factPanel.repaint();
    }
    
    private String getUniqueRandomFact() {
        // Create a list of facts not currently displayed
        ArrayList<String> availableFacts = new ArrayList<>(allFacts);
        for (JLabel label : currentLabels) {
            availableFacts.remove(label.getText());
        }
        
        // If we've used all facts, just return a random one
        if (availableFacts.isEmpty()) {
            return allFacts.get(random.nextInt(allFacts.size()));
        }
        
        // Return a random fact from available ones
        return availableFacts.get(random.nextInt(availableFacts.size()));
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == changeButton) {
            // Remove one random fact if we have at least one
            if (!currentLabels.isEmpty()) {
                int indexToRemove = random.nextInt(currentLabels.size());
                JLabel labelToRemove = currentLabels.remove(indexToRemove);
                factPanel.remove(labelToRemove);
            }
            
            // Add a new fact
            addNewFact();
            
            // Refresh the panel
            factPanel.revalidate();
            factPanel.repaint();
        }
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new JHistoricalFacts());
    }
}
