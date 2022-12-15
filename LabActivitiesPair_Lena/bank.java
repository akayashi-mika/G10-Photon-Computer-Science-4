package LabActivitiesPair_Lena;

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

            int balance =   50000;
            while (true) {
                System.out.print("\nMenu:\n[1] Balance\n[2] Deposit\n[3] Withdraw\n[4] Quit\n\nEnter Choice: ");
                int option  =   input.nextInt();

                switch (option) {
                    case 1:
                        if (balance < 0) System.out.println("You're in debt!");
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
