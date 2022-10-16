package hi_terisha;
import java.util.*;

public class sum_of_even_numbers {
    public static void main(String[] args) {
        Scanner sc  =   new Scanner(System.in);
        int N;
        // int index = 0;
        int sum = 0;

        System.out.print("Please input a positive integer: ");
        N   =   sc.nextInt();

        if (N == 0) {
            System.out.println("Integer must be greater than 0");
            System.exit(0); // This terminates the entire program
        }
        
        // int even_numbers[]  =   new int[N / 2];
        // For every N numbers, there are int N/2 total number of even numbers
        // EXAMPLES:
        // N = 10   =>  [2, 4, 6, 8, 10]    =>  5   =>  int 10/2
        // N = 7    =>  [2, 4, 6]           =>  3   =>  int 3/2

        System.out.print("[");
        for (int counter = 1;   counter <= N;    counter++) {
            if (counter % 2 == 0) { 
                // even_numbers[index]   =   counter;
                // System.out.print(even_numbers[index] + ", ");
                // sum     +=   even_numbers[index];
                // index++;

                System.out.print(counter + ", ");
                sum     +=   counter;
            } 
        } System.out.print("]" + "\nSum: " + sum);
    }
}

// COMMENTS;
    // Difference between "break;" and "System.exit(0);"
        // break;
            // - Terminate a FUNCTION

        // System.exit(0);
            // -Terminates the ENTIRE PROGRAM
