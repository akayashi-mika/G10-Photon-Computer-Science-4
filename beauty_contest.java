import java.util.Random;
import java.util.Scanner;

public class beauty_contest {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Random  randr   =   new Random();
            int     number_of_questions;
            int     question;

            System.out.print("Enter the number of questions to be asked: ");
            number_of_questions =   sc.nextInt();
            // number_of_questions =   6;

            // for (question_number = 0; question_number <= number_of_questions; question_number++) 
            for (int counter = 0; counter < number_of_questions; counter++) {
                question    =   randr.nextInt(number_of_questions)+1;
                switch(question) {
                    case 1: 
                        System.out.println("What are your thoughts on Abortion?");
                        break;
                    
                    case 2: 
                        System.out.println("To you, which is the much more superior sex?");
                        break;

                    case 3: 
                        System.out.println("What is the achievement that you're so proud of");
                        break;
                        
                    case 4: 
                        System.out.println("What's your take on the ongoing Feminism and MRAs War in the internet?");
                        break;

                    case 5: 
                        System.out.println("Do you think you got what it takes to win the pageant");
                        break;
                }
            }
        }
    }
}