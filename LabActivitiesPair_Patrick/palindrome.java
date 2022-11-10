package LabActivitiesPair_Patrick;
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a 5-digit integer: ");
            int number  =   sc.nextInt();

            int units           =   number % 10;
            int tens            =   ((number - units) / 10) % 10;
            int hundreds        =   ((number - (units + tens * 10)) / 100) % 10;
            int thousands       =   ((number - (units + tens * 10 + hundreds * 100)) / 1000) % 10;
            int ten_thousands   =   ((number - (units + tens * 10 + hundreds * 100 + thousands * 1000)) / 10000) % 10;

            if (ten_thousands == 0) {
                System.out.println("The Ten-Thousands digit must not be 0");
                System.exit(0);
            }

            else if (units != ten_thousands || tens != thousands) {
                System.out.println("The number is NOT a palindrome");
                System.exit(0);
            }
        }

        System.out.println("The number is a palindrome");
    }
}
