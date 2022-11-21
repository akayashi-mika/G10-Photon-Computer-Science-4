package LabChallenges;
import java.util.Random;
import java.util.ArrayList;

public class sortEvenOddArrays {
    public static void main(String[] args) {
        Random  randr   =   new Random();    

        ArrayList<Integer> even_numbers = new ArrayList<Integer>();
        ArrayList<Integer> odd_numbers = new ArrayList<Integer>();

        for (int index = 1; index <= 10; index++) {
            int random_number   =   randr.nextInt(100)+1;
                // Generates a random number from 1-100
            
            if (random_number % 2 == 0) {
                // "random_number" is an Even number
                even_numbers.add(random_number);
            } else {
                // If "random_number" is not Even, then it must be Odd
                odd_numbers.add(random_number);
            }
        }

        System.out.println("Even Numbers: " + even_numbers);
        System.out.println("Odd Numbers: " + odd_numbers);
    }
}
