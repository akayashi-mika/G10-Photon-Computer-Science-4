import java.util.*;

public class FINAL2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Random  random   =   new Random();
            String  result;
            String  winner  =   "";

            int user_score = 0, program_score = 0;
            while (user_score != 5 && program_score != 5) {
                System.out.print ("[1] Stone\n[2] Paper\n[3] Scissors\n> ");

                int user_choice  =   input.nextInt();   

                int programChoice   =   random.nextInt(3)+1;
                String  programChoice_string    =   "";
                if (programChoice   ==  1) {
                    programChoice_string    =   "Stone";
                } else if (programChoice    ==  2) {
                    programChoice_string    =   "Paper";
                } else if (programChoice    ==  3) {
                    programChoice_string    =   "Scissors";
                } else {
                    System.out.println("Choose 1-3 only");
                }

                System.out.print("Program chose " + programChoice_string + "\n");
                
                if (user_choice == 1) {
                    if (programChoice == 1) {
                        result  =   "Draw";
                    } else if (programChoice == 2) {
                        program_score    +=  1;
                    } else {
                        user_score       +=  1;
                    }
                } 
                
                else if (user_choice == 2) {
                    if (programChoice == 1) {
                        user_score      +=  1;
                    } else if (programChoice == 2) {
                        result  =   "Draw";
                    } else {
                        program_score    +=  1;
                    }
                } 
                
                else if (user_score == 3) {
                    if (programChoice == 1) {
                        program_score    +=  1;
                    } else if (programChoice == 2) {
                        user_score       +=  1;
                    } else {
                        result  =   "Draw";
                    }
                }

                System.out.println("User Score: " + user_score + "\nProgram Score: " + program_score + "\n");
            }

            if (user_score == 5) {
                winner  =   "User";
            } else if (program_score == 5) {
                winner  =   "Program";
            } 
            System.out.println(winner + " wins");
        }
    }
}
