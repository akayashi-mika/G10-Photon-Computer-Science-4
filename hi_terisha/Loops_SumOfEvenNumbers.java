package hi_terisha;

import java.util.Scanner;
public class Loops_SumOfEvenNumbers {

	public static void main(String[] args) {
		
		int sum = 0;
		
		Scanner input = new Scanner (System.in);
        System.out.print ("Please input a positive integer: "); // When asking the user for input, don't use "println"
        int N = input.nextInt();
        
        for (int number = 1; number <=N ; number++) {  // Use more readable variable names preeeee
        	// n%2 == 0 --> to get even numbers
        	if (number % 2 == 0) {
        		 System.out.println("Even number(s):" + number);
        		 
        		 sum = sum + number;
        		//  System.out.println("Sum of even numbers:" + sum);
                    // Dapat sa sagwa sang for-loop mo ni siya gin butang
        	}
        } System.out.println("Sum of even numbers:" + sum);
	}
}
