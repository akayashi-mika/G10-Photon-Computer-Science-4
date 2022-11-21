package LabActivitiesPair_Lena;

import java.util.Random;
import java.util.Scanner;

public class rockPaperScissors {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Random  randr   =   new Random();
            String  winner  =   "";

            int userScore = 0, terminalScore = 0;
            while (userScore != 5 && terminalScore != 5) {
                System.out.print ("[1] Rock\n[2] Paper\n[3] Scissors\n> ");

                int userChoice  =   input.nextInt();   

                int terminalChoice   =   randr.nextInt(3)+1;
                String  terminalChoiceOption    =   "";
                if (terminalChoice   ==  1) {
                    terminalChoiceOption    =   "Rock";
                } else if (terminalChoice    ==  2) {
                    terminalChoiceOption    =   "Paper";
                } else if (terminalChoice    ==  3) {
                    terminalChoiceOption    =   "Scissors";
                } else {
                    System.out.println("Choose 1-3 only");
                    System.exit(0);
                }

                System.out.print("Terminal picked " + terminalChoiceOption + "\n");
                
                if (userChoice == 1) {
                    if (terminalChoice == 1) {
                        System.out.println("Draw");
                    } else if (terminalChoice == 2) {
                        terminalScore    +=  1;
                    } else {
                        userScore       +=  1;
                    }
                } 
                
                else if (userChoice == 2) {
                    if (terminalChoice == 1) {
                        userScore      +=  1;
                    } else if (terminalChoice == 2) {
                        System.out.println("Draw");
                    } else {
                        terminalScore    +=  1;
                    }
                } 
                
                else if (userChoice == 3) {
                    if (terminalChoice == 1) {
                        terminalScore    +=  1;
                    } else if (terminalChoice == 2) {
                        userScore       +=  1;
                    } else {
                        System.out.println("Draw");
                    }
                }

                System.out.println("User's Score: " + userScore + "\nTerminal's Score: " + terminalScore + "\n");
            }

            if (userScore == 5) {
                winner  =   "User";
            } else if (terminalScore == 5) {
                winner  =   "Terminal";
            } 
            System.out.println("The winner is " + winner);
        }
    }
}
