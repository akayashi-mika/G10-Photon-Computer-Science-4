// Given your prior knowledge on capturing user inputs from the console and any decision 
 //making statements, write a program that will accept numeric value from 1 to 7 (numeric 
 //value of days in a week). Your program will then output the string equivalent of the inputed 
// numeric day value, invalid day otherwise. 

import java.util.*;
public class numeric_value_of_days_in_a_string {

	public static void main(String[] args) {
		String day;
		
		
		Scanner week = new Scanner(System.in);
		System.out.print("Please enter numeric value of day in a week: ");
		int n = week.nextInt();
		
		switch (n) {
			case 1:
				day = "Monday";
				System.out.print("Day equivalent is: " + day);
				break;
			case 2:
				day = "Tuesday";
				System.out.print("Day equivalent is: " + day);
				break;
			case 3:
				day = "Wednesday";
				System.out.print("Day equivalent is: " + day);
				break;
			case 4:
				day = "Thursday";
				System.out.print("Day equivalent is: " + day);
				break;
			case 5:
				day = "Friday";
				System.out.print("Day equivalent is: " + day);
				break;
			case 6:
				day = "Saturday";
				System.out.print("Day equivalent is: " + day);
				break;
			case 7:
				day = "Sunday";
				break;
			default:
				System.out.print("Day String equivalent is invalid");
		} System.out.print("Day equivalent is: " + day);

		
		

	}

}