package LabChallenges;

import java.util.Arrays;
import java.util.Scanner;

public class ascending_numbers {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("How many numbers to store in the array: ");
            int     number_of_questions =   sc.nextInt();

            int  array_of_numbers[]  =   new int[number_of_questions];

            for (int index = 0; index < number_of_questions; index++) {
                System.out.print("Enter Number " + (index + 1) + ": ");
                array_of_numbers[index] = sc.nextInt();
            } 

            Arrays.sort(array_of_numbers);
            System.out.println(Arrays.toString(array_of_numbers));
        }
    }
}