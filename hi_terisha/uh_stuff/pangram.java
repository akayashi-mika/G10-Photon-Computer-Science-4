package hi_terisha.uh_stuff;
import java.util.Arrays;
import java.util.Scanner;

public class pangram {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            // DONE Ask the user for a sentence
            System.out.print("Enter a sentence (only use lowercase English letters): ");
            String  sentence    =   input.nextLine();

            // DONE Make an array that contains the alphabet
            char    alphabet[]  =   new char[26];
            int alphabet_index   =   0;
            for (char character = 'a'; character <= 'z'; character++) {
                alphabet[alphabet_index]     =   character;
                alphabet_index++;
            }

            // DOING Break down the given sentence into smaller individual parts
                // "hello"  =>  {'h', 'e', 'l', 'l', o}
                // "gay"    =>  {'g', 'a', 'y'}
            // char    sentence_individual_characters[]    =   new char[sentence.length()];
            char    sentence_individual_characters[]    =   sentence.replaceAll(" ", "").toCharArray();
            System.out.println(sentence.length());
            for (int SIC_index = 0; SIC_index < sentence.replaceAll(" ", "").length(); SIC_index++) {
                // System.out.println("Start of program 1");       
                alphabet_index = 0;  // Reset the value of alphabet_index

                // TODO Change the value of a character to null if found in the sentence

                if (sentence_individual_characters[SIC_index] == alphabet[alphabet_index]) {
                    alphabet[alphabet_index]   =   ' ';
                    continue;
                }
                
                int counter = 0;
                while (sentence_individual_characters[SIC_index] != alphabet[alphabet_index]) {
                    alphabet_index++;   

                    counter++;
                    if (counter == 26) {
                        break;
                    }

                    if (sentence_individual_characters[SIC_index] == alphabet[alphabet_index]) {
                        alphabet[alphabet_index]   =   ' ';
                        break;
                    }
                }
            }

            for (alphabet_index = 0; alphabet_index < alphabet.length; alphabet_index++) {
                if (alphabet[alphabet_index] != ' ') {
                    System.out.println("The unused letters are: " + Arrays.toString(alphabet) + "\nThe sentence is NOT a Pangram");
                    System.exit(0);
                }
            }

            System.out.println("The sentence is Pangram");
        }
    }
}



