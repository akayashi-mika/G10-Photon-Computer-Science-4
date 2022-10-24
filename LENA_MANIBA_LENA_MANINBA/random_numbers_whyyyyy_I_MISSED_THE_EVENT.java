package LENA_MANIBA_LENA_MANINBA;

import java.util.Arrays;
import java.util.Random;

public class random_numbers_whyyyyy_I_MISSED_THE_EVENT {
    public static void main(String[] args) {
        Random  randr   =   new Random();

        int[]   random_numbers  =   new int[20];
        for (int index = 0; index < random_numbers.length; index++) {
            random_numbers[index]   =   randr.nextInt(51)+50;
        }

        int firstCounter    =   0;
        int secondCounter   =   firstCounter + 1;

        int[]   duplicates  =   new int[random_numbers.length];
        int     duplicates_index    =   0;
        while (firstCounter < (random_numbers.length - 1)) {
            if (random_numbers[firstCounter]    ==  random_numbers[secondCounter]) {
                duplicates[duplicates_index]    =   random_numbers[firstCounter];
                duplicates_index++;
            } secondCounter++;

            if (secondCounter   ==  random_numbers.length) {
                firstCounter    +=  1;
                secondCounter   =   firstCounter + 1;
            }
        }

        System.out.println("Random Numbers: " + Arrays.toString(random_numbers));
        System.out.println("Duplicates: " + Arrays.toString(duplicates));
    }
}
