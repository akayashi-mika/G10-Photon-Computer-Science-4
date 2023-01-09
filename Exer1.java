import java.util.Scanner;

public class Exer1 {
    public static void main(String[] args) {        // This line is always added sa start sang code ta
        int     integer     =   10;     // The "int" datatype can ONLY store Integers
        float   floatt      =   10.2233333f;     // TODO EDIT THIS AFEWG
        double  doublee     =   10.5;   // The "double" datatype can store BOTH Integers and Decimals
        char    character   =   'a';    // The "char" datatype can store ONLY ONE character
        String  Adwrfewgewgtring      =   "abbcccdddd eeeeeffffff";   // The "String" datatype can store MULTIPLE characters

        int     three_digit_number;     // This is important kay we need to introduce the variable "three_digit_number" to our program before we can use it
                                        // Without this, the code wouldn't know what the "three_digit_number" variable is since we failed to introduce it first
        int     units;
        int     tens;
        int     hundreds;
        
        // It is necessary to first introduce the variables before we can use them to store our data/input
        // If diritsuhon mo lang siya na gamiton sa code mo without introducing it first, ma error lang na ang program mo



        System.out.println("This is an \"integer\": " + integer);
        System.out.println("This is a \"float\": " + floatt);
        // Notice how same lang sila value, pero ang "float" ya may decimal point sa gilid

        System.out.println("This is a \"double\": " + doublee);
        System.out.println("This is a \"char\": " + character);
        System.out.println("This is a \"String\": " + Adwrfewgewgtring);
        // By default, "" are used to enclose text
        // So if gusto mo mag gamit sang "" inside the "", you have to prefix the "\" symbol before the quotation marks
        // Check this post if you want to learn more Escape Sequences
        // https://stackoverflow.com/questions/1367322/what-are-all-the-escape-characters#1367339



        try (Scanner input = new Scanner(System.in)) {
            // The variable name "input" is interchangeable 
      System.out.print("\nEnter a 3-digit number: "); // The "\n" adds a new line before the text
      three_digit_number =   input.nextInt();         // This will ask the user for their input
            // Then store it in the variable "three_digit_number"
            // You can change the variable name to anything you want
            // NOTE that it's the "input.nextInt();" that will ask the user for their input, not the "System.out.print()"
        }
                                                        


                                                        
        // SOLVE for the UNITS, TENS, HUNDREDS digit

        units       =   three_digit_number % 10;
        // The 10th modulo of any number is always its UNITS digit

        tens        =   ((three_digit_number - units) / 10) % 10;
        // Let's say your number is 176
        // It's UNITS digit is 6, subtract that to your number
        // And you get 170
        // Now divide it by 10 to remove the trailing 0
        // And you get 17
        // Take its 10th modulo again to get the TENS digit

        hundreds    =   (three_digit_number - (three_digit_number % 100)) / 100;
        // The 100th modulo of any number
        // Is always its TENS and UNITS digits
        // So 176 % 100 will return 76
        // Subtract that to your original number
        // Then divide it by 100 to remove the trailing zeroes
        // What remains is your HUNDREDS digit



        // Print the HUNDREDS, TENS, UNITS digit of your 3-digit number
        System.out.println("Hundreds digit: " + hundreds);
        System.out.println("Tens digit: " + tens);
        System.out.println("Units digit: " + units);
    }
}