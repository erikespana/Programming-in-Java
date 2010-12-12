// Sorted Names, pg 176 #7
// Write a program that asks for 3 names and displays them in ascending order.

import java.util.Scanner;  // Needed for the Scanner class

public class Chpt03Number07 {
   public static void main(String [] args)    {
		String name1, name2, name3, temp;

		// Create a Scanner object to read input.
		Scanner keyboard = new Scanner(System.in);

		System.out.print("What is the first name? ");
		name1 = keyboard.nextLine();

		System.out.print("What is the second name? ");
		name2 = keyboard.nextLine();

		System.out.print("What is the third name? ");
		name3 = keyboard.nextLine();

		if (name1.charAt(0) > name2.charAt(0)) {
			temp = name1;
			name1 = name2;
			name2 = temp;
		}

		if (name1.charAt(0) > name3.charAt(0)) {
			temp = name1;
			name1 = name3;
			name3 = temp;
		}

		if (name2.charAt(0) > name3.charAt(0)) {
			temp = name2;
			name2 = name3;
			name3 = temp;
		}

		System.out.println();
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);

	}
}