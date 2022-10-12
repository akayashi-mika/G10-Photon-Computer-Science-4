//A four digit number ABCD is called lucky if A + B = C + B

//Write a program that asks the user to enter a 
//four digit number and tell if it is lucky of not
import java.util.*;
public class lucky_number {

	public static void main(String[] args) {

		
		Scanner lucky = new Scanner (System.in);
		
		System.out.print("Enter a four-digit number: ");
		
		int n = lucky.nextInt();
		
		//ABCD 
		//extraction of digits
		int digit4th = n % 10; //D
		int digit3rd = (n / 10) % 10; //C
		int digit2nd = (n / 100) % 10; //B
		int digit1st = (n / 1000) % 10; //A
		
		if (digit1st + digit2nd == digit3rd + digit4th) {
			System.out.print("This is a lucky number!");
		} else {
			System.out.print("This is not a lucky number!");
		}
	}
}








