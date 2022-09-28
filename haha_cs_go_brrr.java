import java.security.DrbgParameters.Reseed;
import java.util.Scanner;

public class haha_cs_go_brrr {
    public static void main(String[] args) {
        Scanner input   =   new Scanner(System.in);

        double firstNumber;
        double secondNumber;
        double res;

        System.out.print("Enter the base: ");
        firstNumber     =   input.nextInt();

        System.out.print("Enter the exponent: ");
        secondNumber    =   input.nextInt();

        res =   Math.pow(firstNumber, secondNumber);
        System.out.println(res);
    }
}