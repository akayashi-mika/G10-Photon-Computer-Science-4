package LENA_MANIBA_LENA_MANINBA;

import java.util.Scanner;

public class LENA_OMG_IS_THAT_YOU_WOW_POG {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Passcode: ");
            int userPasscode    =   input.nextInt();
            int correctPasscode =   12345;

            int attempt =   1;
            while (userPasscode !=  correctPasscode) {
                if (attempt > 3) {
                    System.out.println("Account Blocked");
                    System.exit(0);
                }
                
                attempt++;
                System.out.print("Attempt " + attempt + "/3\nWrong Passcode.\nRe-enter Passcode: ");
                System.out.print("\n");
                userPasscode    =   input.nextInt();


            }

            int balance =   50000;
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
