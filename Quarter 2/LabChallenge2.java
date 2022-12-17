import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.*;
import java.util.logging.Handler;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class LabChallenge2 extends JFrame {
    JLabel  space   =   new JLabel("                               ");

    private JTextField  withdrawField, depositField;
    private JLabel      title,
                        passwordFieldText;
    private JButton     submitButton    =   new JButton("Submit"), 
                        withdrawButton  =   new JButton("Amount to Withdraw"), 
                        depositButton   =   new JButton("Amount to Deposit");
    
    JPasswordField  passwordField    =   new JPasswordField(18);  
    double  password    =   10_25_22,
            inputPassword, 
            withdrawAmount, depositAmount,
            balance = 50_000;

    LabChallenge2() {
        super("Bank Simulator");
        passwordFieldText   =   new JLabel("Please Enter Password:");
        add(passwordFieldText);
        add(space);
        add(passwordField);
        add(submitButton);
        handler handle  =   new handler();
        submitButton.addActionListener(handle);
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
            // TODO Ask the user for the password
                // IF the password is wrong, display and error and ask for another input
                // TERMINATE program after 3 tries
                // EDIT
                    // int attempts    =   1;
                    // while (userPasscode !=  correctPasscode) {
                    //     if (attempts    ==  3) {
                    //         System.out.print("Account Blocked");
                    //         System.exit(0);
                    //     }

                    //     attempts++;
                    //     System.out.print("\nAttempt: " + attempts + "/3\nWrong Passcode. Please Try Again\nPasscode: ");
                    //     userPasscode    =   input.nextInt();
                    // }
                    
            while (true) {
                System.out.print("\nMenu:\n[1] Balance\n[2] Deposit\n[3] Withdraw\n[4] Quit\n\nEnter Choice: ");
                int option  =   input.nextInt();

                switch (option) {
                    case 1:
                        System.out.println("Balance: " + balance);
                        break;

                    case 2:
                        System.out.print("Amount to Deposit: ");
                        int depositAmount   =   input.nextInt();

                        balance +=  depositAmount;
                        break;

                    case 3:
                        System.out.print("Amount to Withdraw: ");
                        int withdrawAmount  =   input.nextInt();

                        balance -=  withdrawAmount;
                        break;

                    case 4:
                        System.out.println("Quitting");
                        System.exit(0);

                    default:
                        System.out.println("Choose only options 1-4");
                }
            } 
        }
    }
}
