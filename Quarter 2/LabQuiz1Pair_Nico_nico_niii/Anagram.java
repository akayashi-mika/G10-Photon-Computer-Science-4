package LabQuiz1Pair_Nico_nico_niii;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;
import javax.swing.*;

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

    private int score = 0;
    public static final String[] wordSlice = {
            "SAD",
            "AID",
            "ADS",
            "SAID",
            "AIDS",
    };

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

    private class handler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == submitButton) {
                String answer = wordField.getText();
                for (int i = 0; i < wordSlice.length; i++) {
                    if (wordSlice[i].equalsIgnoreCase(answer)) {
                        score++;
                        wordSlice[i] = "";
                        scoreField.setText(Integer.toString(score));
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
