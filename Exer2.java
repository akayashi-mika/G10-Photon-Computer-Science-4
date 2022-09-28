import java.util.Scanner;

public class Exer2 {
    public static void main(String[] args) {
        int     num;
        int     units;
        int     tens;
        int     hundreds;

        Scanner input   =   new Scanner(System.in);
        // Introduces the "input" function to the program

        System.out.print("Enter a 3-digit number: ");
        num =   input.nextInt();
        // Asks the user for a 3-digit number


        units       =   num % 10;
        // The 10th modulo of any number is always its UNITS digit

        tens        =   ((num - units) / 10) % 10;
        // Let's say your number is 176
        // It's units is 6, subtract that to your number
        // And you get 170
        // Now divide it by 10 to remove the trailing 0
        // And you get 17
        // Take its 10th modulo again to get the TENS digit

        hundreds    =   (num - (num % 100)) / 100;
        // The 100th modulo of any number
        // Is always its TENS and UNITS digits
        // So 176 % 100 will return 76
        // Subtract that to your original number
        // Then divide it by 100 to remove the trailing zeroes
        // What remains is your HUNDREDS digit

        // Print the HUNDREDS, TENS, UNITS digit of your 3-digit number
        System.out.println("Hundreds digit: " + hundreds);
        System.out.println("Tens digit: " + tens);
        System.out.println("Units digit: " + units);


        if (units < 0 || tens < 0 || hundreds < 0) {
            System.out.println("Invalid Number. Your number must be GREATER than 0 for the program to work");
        }

        else {
            if (units >= hundreds && units >= tens) {
                if (tens >= hundreds) {
                    System.out.println(units + " " + tens + " " + hundreds);
                }

                else {
                    System.out.println(units + " " + hundreds + " " + tens);
                }
            }

            else if (units >= tens && units <= hundreds) {
                System.out.println(hundreds + " " + units + " " + tens);
            }

            else if (units >= hundreds && units <= tens) {
                System.out.println(tens + " " + units + " " + hundreds);
            }

            else {
                if (tens >= hundreds) {
                    System.out.println(units + " " + tens + " " + hundreds);
                }

                else {
                    System.out.println(units + " " + hundreds + " " + tens);
                }
            }
        }
    }
}
