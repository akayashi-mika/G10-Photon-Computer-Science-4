package hi_terisha;
import java.util.*;

public class sumOfEvenNumbersBeforeN {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int sum = 0;

            System.out.print("Please input a positive integer: ");
            int N   =   sc.nextInt();

            if (N == 0) {
                System.out.println("Integer must be greater than 0");
                System.exit(0); // This terminates the entire program
            }

            int numbers[]   =   new int[N / 2];
            int numbers_index   =   0;
            
            // int even_numbers[]  =   new int[N / 2];
            // For every N numbers, there are int N/2 total number of even numbers
            // EXAMPLES:
            // N = 10   =>  [2, 4, 6, 8, 10]    =>  5   =>  int 10/2
            // N = 7    =>  [2, 4, 6]           =>  3   =>  int 3/2

            for (int counter = 1;   counter <= N;    counter++) {
                if (counter % 2 == 0) { 
                    // even_numbers[index]   =   counter;
                    // System.out.print(even_numbers[index] + ", ");
                    // sum     +=   even_numbers[index];
                    // index++;

                    numbers[numbers_index]  =   counter;
                    numbers_index++;
                    sum     +=   counter;
                } 
            } System.out.print("Even Numbers before N: " + Arrays.toString(numbers) + "\nSum: " + sum);
        }
    }
}

// COMMENTS;
    // Difference between "break;" and "System.exit(0);"
        // break;
            // - Terminate a FUNCTION

        // System.exit(0);
            // -Terminates the ENTIRE PROGRAM
