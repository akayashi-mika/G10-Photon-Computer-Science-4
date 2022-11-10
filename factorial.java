import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            double number;
            double succeeding_number;

            System.out.println("n!");
            System.out.print("Enter the value of n: ");
            number  =   input.nextInt();

            succeeding_number = number - 1;

            while (succeeding_number > 0) {
                number = number * (succeeding_number);
                succeeding_number--;
            } System.out.println(number);
        }
    }
}

