import java.io.PrintStream;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

public class Exer1 {
    private static final PrintStream    out = System.out;
    public static void main(String[] args) {
        Scanner input   =   new Scanner(System.in);
        int     num;
        int     units;
        int     tens;
        int     hundreds;

        // Ask the user for a 3-digit number
        out.print("Enter a 3-digit number: ");
        num     =   input.nextInt();

        units       =   num % 10;
        tens        =   ((num - units) / 10) % 10;
        hundreds    =   (num - (num % 100)) / 100;

        out.println("Hundreds digit: " + hundreds);
        out.println("Tens digit: " + tens);
        out.println("Units digit: " + units);
    }
}
