package LabActivitiesPair_Patrick;
import java.util.Scanner;

public class money {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int money;
            int originalMoney;
            int oneThousand, fiveHundred, twoHundred, oneHundred, fifty, twenty, ten, five, one;
            
            System.out.print("Money: ");
            money   =   sc.nextInt();
            originalMoney   =   money;

            if (money > 0) {
                oneThousand =   money / 1000;
                money       =   money - 1000 * oneThousand;

                fiveHundred =   money / 500;
                money       =   money - 500 * fiveHundred;

                twoHundred =   money / 200;
                money       =   money - 200 * twoHundred;

                oneHundred =   money / 100;
                money       =   money - 100 * oneHundred;
                
                fifty =   money / 50;
                money       =   money - 50 * fifty;
                
                twenty =   money / 20;
                money       =   money - 20 * twenty;

                ten =   money / 10;
                money       =   money - 10 * ten;
                
                five =   money / 5;
                money       =   money - 5 * five;
                
                one =   money / 1;
                money       =   money - 1 * one;

                System.out.println("Input: " + originalMoney + "    Output: " + "1000-" + oneThousand + " 500-" + fiveHundred + " 200-" + twoHundred + " 100-" + oneHundred + " 50-" + fifty + " 20-" + twenty + " 10-" + ten + " 5-" + five + " 1-" + one);
            }

            else {
                System.out.println("Amount must be greater than 0");
            }
        }
    }
}
