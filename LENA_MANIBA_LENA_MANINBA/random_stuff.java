package LENA_MANIBA_LENA_MANINBA;

import java.util.Arrays;
import java.util.Random;

public class random_stuff {
    public static void main(String[] args) {
        Random  randr   =   new Random();

        char[]  random_letters  =   new char[10];   

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

        for (int random_letters_index = 0; random_letters_index < random_letters.length; random_letters_index++) {
            int alphabet_index  =   randr.nextInt(26);
            if (alphabet[alphabet_index]    ==  ' ') {
                random_letters_index    -=  1;
                continue;
            }
            random_letters[random_letters_index]    =   alphabet[alphabet_index];
            alphabet[alphabet_index]    =   ' ';
        }

        System.out.println("Letters: " + Arrays.toString(random_letters));
    }
}