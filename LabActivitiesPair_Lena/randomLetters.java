package LabActivitiesPair_Lena;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class randomLetters {
    public static void main(String[] args) {
        Random  randr   =   new Random();
        try (Scanner input = new Scanner(System.in)) {
            // Ask the user for the number of random letters it wants
                // Must be <=27
            System.out.print("How many random letters to print?\nNote that it must be LESS THAN OR EQUAL TO 26\n> ");
            int n   =   input.nextInt();
            if (n > 26) System.exit(0);

            // Make an array that will contain the n random letters
            char[]  random_letters  =   new char[n];   

            // Make an array that contains the alphabet
            char[]  alphabet    =   {
                'a',
                'b',
                'c',
                'd',
                'e',
                'f',
                'g',
                'h',
                'i',
                'j',
                'k',
                'l',
                'm',
                'n',
                'o',
                'p',
                'q',
                'r',
                's',
                't',
                'u',
                'v',
                'w',
                'x',
                'y',
                'z'
            };

            // A loop that will generate random letters
            int random_letters_index = 0;
            while (random_letters_index < random_letters.length) {
                // Pick a random letter
                int alphabet_index  =   randr.nextInt(26);

                // If the letter is already used, then ignore
                if (alphabet[alphabet_index]    ==  ' ')
                    continue;      

                // Self-explanatory
                random_letters[random_letters_index]    =   alphabet[alphabet_index];

                // Tell the program that the letter is already used
                alphabet[alphabet_index]    =   ' ';

                random_letters_index++;
            }

            // This will display the random letters generated
            System.out.println("Letters: " + Arrays.toString(random_letters));
        }
    }
}