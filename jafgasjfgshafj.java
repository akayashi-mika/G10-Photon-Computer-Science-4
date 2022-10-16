
import java.util.*;

public class jafgasjfgshafj {
    public static void main(String[] args) {
        Scanner sc      =   new Scanner(System.in);
        Random  randr   =   new Random();

        // int collection_of_numbers[]   =   new int[100];










        System.out.print("Enter the number of questions you want to ask: ");
        int  number_of_questions  =   sc.nextInt();

        String  example_array[] =   new String[number_of_questions];


        String  question    =   "stuff";
        int counter =   0;
        while (counter <= number_of_questions) {
        // while (question != "") {
            if (counter == number_of_questions) {
                for (int counter1 = 0; counter1 < number_of_questions; counter1++) {
                    System.out.println(example_array[counter1]);
                }
                break;
            }

            System.out.print("Enter the question you want to ask: ");
            question    =   sc.nextLine();
            example_array[counter]   =  question;
            counter++;
        }
    }
}
