package hi_terisha.uh_stuff;
import java.util.Scanner;

public class bank {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Attempts: 1/3\nPasscode: ");
            int userPasscode    =   input.nextInt();
            int correctPasscode =   12345;

            int attempts    =   1;
            while (userPasscode !=  correctPasscode) {
                if (attempts    ==  3) {
                    System.out.print("Account Blocked");
                    System.exit(0);
                }

                attempts++;
                System.out.print("\nAttempt: " + attempts + "/3\nWrong Passcode. Please Try Again\nPasscode: ");
                userPasscode    =   input.nextInt();
            }

            int balance     =   50000;
            while (true) {
                System.out.print("\n1. Balance\n2. Deposit\n3. Withdraw\n4. Quit\n\nEnter Choice: ");
                int menuChoice  =   input.nextInt();

                switch (menuChoice) {
                    case 1:
                        System.out.print("Balance: " + balance);
                        break;
                    case 2:
                        System.out.print("Amount to Deposit: ");
                        int depositAmount   =   input.nextInt();
    
                        balance +=  depositAmount;
                        System.out.print("Balance: " + balance);
                        break;
                    case 3:
                        System.out.print("Amount to Withdraw: ");
                        int withdrawAmount  =   input.nextInt();

                        balance -=  withdrawAmount;
                        System.out.print("Balance: " + balance);
                        break;
                    case 4:
                        System.out.print("Quitting");
                        System.exit(0);

                    default:
                        System.out.print("Only choose from options 1-4");
                }
            }
        }
    }
}




