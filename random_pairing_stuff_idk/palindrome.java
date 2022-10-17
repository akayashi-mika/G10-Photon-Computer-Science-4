package random_pairing_stuff_idk;
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc  =   new Scanner(System.in);
        int number, units, tens, hundreds, thousands, ten_thousands;

        System.out.print("Enter a 5-digit integer: ");
        number  =   sc.nextInt();

        units           =   number % 10;
        tens            =   ((number - units) / 10) % 10;
        hundreds        =   ((number - (units + tens * 10)) / 100) % 10;
        thousands       =   ((number - (units + tens * 10 + hundreds * 100)) / 1000) % 10;
        ten_thousands   =   ((number - (units + tens * 10 + hundreds * 100 + thousands * 1000)) / 10000) % 10;

        if (ten_thousands == 0) {
            System.out.println("The Ten-Thousands digit must not be 0");
            System.exit(0);
        }

        else if (units != ten_thousands || tens != thousands) {
            System.out.println("The number is NOT a palindrome");
            System.exit(0);
        }

        System.out.println("The number is a palindrome");
    }
}
