/*
 * Assignment Description:
Page 47 number 1 -- Game zone Problem 1
Code into Eclipse, test and run. 


program the solution in your eclipse IDE, when complete, create a zip file and upload it to Blackboard

In 1952, A. S. Douglas wrote his University of Cambridge Ph.D. dissertation on human-computer interaction, and created the first graphical computer game—a version of Tic-Tac-Toe.
 The game was programmed on an EDSAC vacuum-tube mainframe computer. The first computer game is generally assumed to be “Spacewar!”, developed in 1962 at MIT; the first commercially
 available video game was “Pong,” introduced by Atari in 1973. In 1980, Atari’s “Asteroids” and “Lunar Lander” became the first video games to be registered in the U.S. Copyright
 Office. Throughout the 1980s, players spent hours with games that now seem very simple and unglamorous; do you recall playing “Adventure,” “Oregon Trail,” “Where in the World Is 
 Carmen Sandiego?,” or “Myst”?

Today, commercial computer games are much more complex; they require many programmers, graphic artists, and testers to develop them, and large management and marketing staffs are 
needed to promote them. A game might cost many millions of dollars to develop and market, but a successful game might earn hundreds of millions of dollars. Obviously, with the brief
 introduction to programming you have had in this chapter, you cannot create a very sophisticated game. However, you can get started.

For games to hold your interest, they almost always include some random, unpredictable

behavior. For example, a game in which you shoot asteroids loses some of its fun if the asteroids follow the same, predictable path each time you play the game. Therefore, generating
 random values is a key component in creating most interesting computer games.

Appendix D contains information about generating random numbers. To fully understand the process, you must learn more about Java classes and methods. For now, however, you can copy
 the following statement to generate and use a dialog box that displays a random number between 1 and 10:

JOptionPane.showMessageDialog(null,"The number is "+

(1 + (int)(Math.random() * 10)));

Write a Java application that displays two dialog boxes in sequence. The first asks you to think of a number between 1 and 10. The second displays a randomly generated number;
 the user can see whether his or her guess was accurate. (In future chapters, you will improve this game so that the user can enter a guess and the program can determine whether 
 the user was correct. If you wish, you also can tell the user how far off the guess was, whether the guess was high or low, and provide a specific number of repeat attempts.) 
 Save the file as RandomGuess.java.
 */

import javax.swing.JOptionPane;

public class RandomGuess {
    public static void main(String[] args) {
        
        int randomNum = (1 + (int)(Math.random() * 10));
        int guess = 0;
        try {
            while (true) {
                guess = Integer.parseInt(JOptionPane.showInputDialog("Enter your guess between 1-10:"));
                if (guess < 1 || guess > 10) {
                    JOptionPane.showMessageDialog(null, "Please enter a number between 1-10!");
                    continue;
                }
                break;
            }
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid number!");
        }

        String messageDialog = "You got it right! The number was " + randomNum + "!";
        if (guess != randomNum) {
            messageDialog = "Sorry, but the number was " + randomNum + ".";
        }

        JOptionPane.showMessageDialog(null,messageDialog);
    }
}
