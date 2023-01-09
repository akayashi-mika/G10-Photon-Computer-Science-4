package LabQuiz1Pair_Nico_nico_niii;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;
import javax.swing.*;

/*
This program is a game that displays a 4 letter word "ISDA" on the screen. 
The player is asked to enter anagrams (words made up of the same letters as the original word) 
and press a "Submit" button. When the player enters a correct anagram and presses "Submit", 
their score is increased by 1. The game continues until the player has found all the anagrams for 
the word "ISDA". The game will then display a message saying "You have won!". The overall goal of 
the program is to create a simple game for the user to play.
 */

public class Anagram extends JFrame {
    private JLabel wordLabel = new JLabel("The 4 letter word is \"ISDA\"");
    private JTextField wordField = new JTextField(18);
    private JButton submitButton = new JButton("Submit");
    private JLabel scoreLabel = new JLabel("Score: ");
    private JTextField scoreField = new JTextField(8);

    public static void main(String[] args) {
        Anagram Anagram = new Anagram();
        Anagram.setLayout(new FlowLayout(FlowLayout.LEFT, 50, 50));
        Anagram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Anagram.setSize(500, 800);
        Anagram.setLocationRelativeTo(null);
        Anagram.getContentPane().setBackground(new Color(221, 160, 221));
        Anagram.setVisible(true);
    }

    Anagram() {
        add(wordLabel);
        add(wordField);
        add(scoreLabel);
        scoreField.setEditable(false);
        add(scoreField);
        add(submitButton);
        handler handle = new handler();
        submitButton.addActionListener(handle);
    }

    // The default score is 0
    private int score = 0;

    // An Array containing all the possible valid answers for the Anagram
    public static final String[] wordSlice = {
            "SAD",
            "AID",
            "ADS",
            "SAID",
            "AIDS",
    };

    private class handler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == submitButton) {
                // get the word given by the user, and store it in a variable called "answer"
                String answer = wordField.getText();

                /* 
                iterate through the loop to determine if the given word is found inside the 
                array containing the valid answers for the given word
                 */ 
                
                for (int i = 0; i < wordSlice.length; i++) {
                    // If the user's answer is valid, execute these stuff
                    if (wordSlice[i].equalsIgnoreCase(answer)) {
                        // Increment the user's score by 1
                        score++;

                        // Change the answer inside the array to an empty string
                        // Indicating that the answer has already been used
                        wordSlice[i] = "";

                        // Set the user's score
                        scoreField.setText(Integer.toString(score));

                        /*
                         * If the user has given all the possible valid answers, 
                         * Then show a pop-up stating "You have won!"
                         */
                        if (score == wordSlice.length) {
                            JOptionPane.showMessageDialog(null, "You have won!");
                        }
                        break;
                    }
                }
            }
        }
    }
}
