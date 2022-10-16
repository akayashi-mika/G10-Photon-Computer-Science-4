package lab_challenges;
import java.util.*;

public class even_ones_out {
    public static void main(String[] args) {
        Scanner sc      =   new Scanner(System.in);
        Random  randr   =   new Random();

        // int collection_of_numbers[]   =   new int[100];










        System.out.println("Enter the number of questions you want to ask");
        int  number_of_questions  =   sc.nextInt();

        String  example_array[] =   new String[number_of_questions];

        for (int counter = 0; counter < number_of_questions; counter++) {
            System.out.println("Enter the question you want to ask: ");
            String  question    =   sc.nextLine();
            example_array[counter]   =  question;
            System.out.println(example_array);
        }
    }
}
