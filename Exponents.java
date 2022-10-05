import java.security.DrbgParameters.Reseed;
import java.util.Scanner;

public class Exponents {
    public static void main(String[] args) {
        Scanner input   =   new Scanner(System.in);

        double base;
        double y;
        double exponent;

        System.out.print("Enter the base: ");
        base     =   input.nextInt();

        System.out.print("Enter the exponent: ");
        exponent    =   input.nextInt();

        y = base + 0;

        // System.out.println(Math.pow(base, exponent));

        double res = 1;
        while (res < exponent) {
            base = base * y;
            res++;
        } System.out.println(base);
    }
}

