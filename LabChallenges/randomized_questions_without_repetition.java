package LabChallenges;

import java.util.Random;

public class randomized_questions_without_repetition {
    public static void main(String[] args) {
        Random  randr   =   new Random();
        String questions[]  =   {
            "4 + 1 = ",
            "A 6-faced dice is rolled. What is the probability that the top number is even? ",
            "Sad boy hours fr fr",
            "Ano nami ibutang di",
            "Send spotify playlist",
            "Among Us",
            "hi sir sheeesh"
        };

        String indicator[]     =   {"Untouched", "Untouched", "Untouched", "Untouched", "Untouched", "Untouched", "Untouched"};  
        
        while (true) {
            int counter =   0;
            int element_number  =   randr.nextInt(7);

            if (indicator[element_number]   ==  "Untouched") {
                System.out.println(questions[element_number]);
                indicator[element_number]   =   "Touched";
                counter++;
            }

            if (counter == 7) {
                break;
            }
        }
    }
}