

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LabChallenge2 extends JFrame {
    private JLabel      space;

    private JTextField  passField,
                        withdrawField, depositField;
    private JLabel      title;
    private JButton     submitButton, 
                        withdrawButton, depositButton;

    double  password    =   102_522,
            inputPassword, 
            withdrawAmount, depositAmount,
            balance = 50_000;

    public static void main(String[] args) {
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
        
        // MOVE bank menu => public class handler
            // int balance =   50000;
            // while (true) {
            //     System.out.print("\nMenu:\n[1] Balance\n[2] Deposit\n[3] Withdraw\n[4] Quit\n\nEnter Choice: ");
            //     int option  =   input.nextInt();

            //     switch (option) {
            //         case 1:
            //             System.out.println("Balance: " + balance);
            //             break;

            //         case 2:
            //             System.out.print("Amount to Deposit: ");
            //             int depositAmount   =   input.nextInt();

            //             balance +=  depositAmount;
            //             break;

            //         case 3:
            //             System.out.print("Amount to Withdraw: ");
            //             int withdrawAmount  =   input.nextInt();

            //             balance -=  withdrawAmount;
            //             break;

            //         case 4:
            //             System.out.println("Quitting");
            //             System.exit(0);

            //         default:
            //             System.out.println("Choose only options 1-4");
            //     }
            // }
    }
}
