import java.io.PrintStream;
import java.util.Scanner;

public class tmp {
    private static final PrintStream    out = System.out;

    public static void main(String[] args) {
        Scanner input   =   new Scanner(System.in);
        int     x   =   10;
        float   y   =   5;
        int     firstNumber;
        int     secondNumber;
        int     sum,    difference, product,    quotient;

        out.println("IM NOT A FURRY FFS");
        out.println(x);
        out.println(y);
        out.println(x + y);

        // Print my Name, Grade Level and Section
        out.println("Name: John Willian Espino");
        out.println("Grade Level and Section: 10 - Photon");

        // Ask the user for a number
        out.print("Enter the first number: ");
        firstNumber     =   input.nextInt();

        // Ask the user for a second number
        out.print("Enter the second number: ");
        secondNumber    =   input.nextInt();

        // Add the two numbers
        sum =   firstNumber + secondNumber;
        difference  =   firstNumber - secondNumber;
        product     =   firstNumber * secondNumber;
        quotient    =   firstNumber / secondNumber;
        out.println("The sum of " + firstNumber + " and " + secondNumber + " is " + sum);
    }
}
