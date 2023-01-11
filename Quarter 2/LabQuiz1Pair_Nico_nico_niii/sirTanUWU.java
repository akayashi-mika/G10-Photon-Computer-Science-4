import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;
import javax.swing.*;

public class sirTanUWU extends JFrame {
    private static JButton sirTanMyLoafs = new JButton("sir tan bbghorl kadto di");
    private static JButton Tanskisedesu = new JButton("shiou simp");
    private static JButton konokokorowadaisukedesutan_sama = new JButton("hahaha my grades in physics after sir reads this 📉");
    private static JButton submitToMeBBGHORL = new JButton("Submit");
    private static JLabel questionForYouhehehe;
    private static JTextField ansorrrrrr;
    String sirTanSupremacy = "Sir Tan";

    public static void main(String[] args) {
        sirTanUWU sirTanUWU = new sirTanUWU();
        sirTanUWU.setLayout(new FlowLayout(FlowLayout.LEFT, 50, 50));
        sirTanUWU.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sirTanUWU.setTitle("sir tan UWU");
        sirTanUWU.getContentPane().setBackground(new Color(221, 160, 221));
        sirTanUWU.add(questionForYouhehehe);
        sirTanUWU.add(ansorrrrrr);
        sirTanUWU.add(submitToMeBBGHORL);
        sirTanUWU.add(sirTanMyLoafs);
        sirTanUWU.add(konokokorowadaisukedesutan_sama);
        sirTanUWU.add(Tanskisedesu);
        sirTanMyLoafs.setEnabled(false);
        konokokorowadaisukedesutan_sama.setEnabled(false);
        Tanskisedesu.setEnabled(false);
        sirTanUWU.pack();
        sirTanUWU.setLocationRelativeTo(null);
        sirTanUWU.setVisible(true);
    }

    sirTanUWU() {
        questionForYouhehehe = new JLabel("If you were given the chance to simp over a teacher, who would it be?");
        ansorrrrrr = new JTextField(18);
        handler handle = new handler();
        submitToMeBBGHORL.addActionListener(handle);
    }

    private class handler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == submitToMeBBGHORL) {
                if (ansorrrrrr.getText().equalsIgnoreCase(sirTanSupremacy)) {
                    sirTanMyLoafs.setEnabled(true);
                    konokokorowadaisukedesutan_sama.setEnabled(true);
                    Tanskisedesu.setEnabled(true);
                }
            }
        }
    }
}
