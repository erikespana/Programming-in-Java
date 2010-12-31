/*
   Password Verifier
   Page 654, # 5

   Imagine you are developing a software package for Amazon.com that
   requires users to enter their own passwords. Your software requires
   that users' passwords meet the following criteria:
   	-The password should be at least six characters long.
   	-The password should contain at least one uppercase and at least
   	 one lowercase letter.
   	-The password should have at least one digit.
   Write a class that verifies that a password meets the stated criteria.
   Demonstrate the class in a program that allows the user to enter a
   password and then displays a message indicating whether it is valid or not.

*/

import java.util.Scanner;  // Needed for the Scanner class

public class Chpt10Number05
{
	public static void main(String[] args)
	{
		// Create a Scanner object to read input.
		Scanner keyboard = new Scanner(System.in);
		String input;	// To hold the input

		// Ask the user to enter their password
		System.out.print("Please enter your password: ");
		input = keyboard.nextLine();

		// Demonstrate the method by passing it the inputted string.
	 	if (authenticate(input))
	 		System.out.print("Thank you for entering your password.");
	 	else
	 		System.out.print("Error: This password is not valid.");

	 	System.out.println();
	}

	/*
		Method: Accepts a String object (password) as an argument
   		and verifies whether it meets the criteria of a valid password.
	*/
	private static boolean authenticate(String password)
	{
		// The password should be at least six characters long.
		// The password should contain at least one uppercase
		//  and at least one lowercase letter.
   		// The password should have at least one digit.
		return ( (password.length() == 6) &&
				 (password.matches("[A-Z]")) &&
				 (password.matches("[a-z]")) &&
				 (password.matches("[0-9]") )
			   );
	}
}