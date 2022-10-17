package lab_challenges;
import java.util.Random;
import java.util.ArrayList;

public class sort_even_odd_arrays {
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

        System.out.print("Even Numbers: [");
        for (int even_numbers_index  =   0; even_numbers_index < even_numbers.size(); even_numbers_index++) {
            System.out.print(even_numbers.get(even_numbers_index) + ",");
        } System.out.print("]\n");

        System.out.print("Odd Numbers: [");
        for (int odd_numbers_index  =   0; odd_numbers_index < odd_numbers.size(); odd_numbers_index++) {
            System.out.print(odd_numbers.get(odd_numbers_index) + ",");
        } System.out.print("]");    
    }
}
