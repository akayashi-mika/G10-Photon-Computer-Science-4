import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LabChallenge3 extends JFrame {
    public JFrame firstFrame = new JFrame();
    public JFrame secondFrame = new JFrame();
    JLabel passwordFieldText; // initializing instance variables
    JLabel image = new JLabel();
    JLabel space = new JLabel("                               ");
    JPasswordField passwordField = new JPasswordField(15);
    JButton button = new JButton("Submit");
    JLabel hiddenWindowLabel = new JLabel("HAHAHA SAD CAT");
    String passw;
    int attempts = 0;

    LabChallenge3() {
        super("Sample Program"); // sets the title bar
        image.setIcon(new ImageIcon(
                "/home/mitsuki/Pictures/5ad292bd0d94477cf3e9cc9926cacbfc--eskimo-kiss-small-things-1004193472.jpeg"
            )
        );
        add(image);
        passwordFieldText = new JLabel(" Please enter password:");
        passwordFieldText.setFont(new Font(
                "Algerian", 
                Font.BOLD, 
                20
            )
        );
        passwordFieldText.setForeground(new Color(
                0, 
                200, 
                0
            )
        ); // set the text color
        add(passwordFieldText);
        add(space);
        add(passwordField);
        add(button);
        handler handle = new handler();

        button.addActionListener(handle);
        secondFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        secondFrame.getContentPane();
        hiddenWindowLabel.setIcon(new ImageIcon("/home/mitsuki/Pictures/FiN3_4iWQAIdTQv.png"));
        hiddenWindowLabel.setFont(new Font("Algerian", Font.BOLD, 50));
        hiddenWindowLabel.setForeground(new Color(
                0, 
                200, 
                0
            )
        ); // set the text color
        secondFrame.add(hiddenWindowLabel);

    }

    public static void main(String args[]) {

        LabChallenge3 hoho = new LabChallenge3();
        hoho.setLayout(new FlowLayout(
                FlowLayout.LEFT, 
                50, 
                25
            )
        );
        // sets how components are displayed
        hoho.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        hoho.setSize(
            1000, 
            1000
        );
        hoho.setLocation(300, 300);
        hoho.setVisible(true);
        hoho.getContentPane().setBackground(new Color(
                0, 
                100, 
                100
            )
        );
        hoho.setResizable(false);
    }

    private class handler implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            String correctPassword = "Pisay";
            if (e.getSource() == button) {
                passw = passwordField.getText();

                if (!passw.equalsIgnoreCase(correctPassword)) {
                    JOptionPane.showMessageDialog(
                        null, 
                        "Access DENIED!!! Please Try Again!!", 
                        "Alert",
                        JOptionPane.ERROR_MESSAGE
                    );
                    attempts++;

                    if (attempts == 3) {
                        button.setEnabled(false);
                        passwordField.setEditable(false);
                    } return;
                }

                JOptionPane.showMessageDialog(
                    null, 
                    "Access Granted", 
                    "Alert", 
                    JOptionPane.INFORMATION_MESSAGE
                );
                secondFrame.setLayout(new FlowLayout());
                secondFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                secondFrame.setSize(
                    2_000, 
                    2_000
                );
                secondFrame.setLocation(
                    750, 
                    250
                );
                secondFrame.setVisible(true);

                passw = "";
                passwordField.setText(passw);
            }
        }
    }
}