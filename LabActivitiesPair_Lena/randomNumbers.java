package LabActivitiesPair_Lena;

import java.util.Arrays;
import java.util.Random;

public class randomNumbers {
    public static void main(String[] args) {
        Random  randr   =   new Random();

        // An array that contains 50 random numbers
        int[]   random_numbers  =   new int[20];
        for (int index = 0; index < random_numbers.length; index++) {
            random_numbers[index]   =   randr.nextInt(51)+50;
        }

        int firstCounter    =   0;
        int secondCounter   =   firstCounter + 1;
        int[]   duplicates  =   new int[random_numbers.length];
        int     duplicates_index    =   0;
        while (firstCounter < (random_numbers.length - 1)) {
            // If the number of the counters are equal, then mark it as duplicates
            if (random_numbers[firstCounter]    ==  random_numbers[secondCounter]) {
                duplicates[duplicates_index]    =   random_numbers[firstCounter];
                duplicates_index++;
            } 
            
            secondCounter++;
            // Once the second counter hits the last element of the array, 
            // Increase the first counter by 1, and reset the value of the second counter
            if (secondCounter   ==  random_numbers.length) {
                firstCounter    +=  1;
                secondCounter   =   firstCounter + 1;
            }
        }

        System.out.println("Random Numbers: " + Arrays.toString(random_numbers));
        System.out.println("Duplicates: " + Arrays.toString(duplicates));
    }
}
