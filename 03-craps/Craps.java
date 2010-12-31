/*
	Assignment - due 8 October 2010

	Write a craps game

	The player's status (win, lose, playing) should be indicated after every roll.

	The player's point should be indicated after every roll (if applicable)

	How to Play Craps
	A player roles two dice. Each die has six faces. These faces contain 1, 2, 3, 4, 5,
	and 6 spots. After the dice have come to rest, the sum of the spots on the two
	upward faces is calculated. If the sum is 7 or 11 on the first throw, the player wins.
	If the sum is 2, 3, or 12 on the first throw ( called "craps"), the player loses
	(i.e., the "house" wins). If the sum is 4, 5, 6, 8, 9, or 10 on the first throw, then
	that sum becomes the player's "point."  To win, the player must continue rolling
	the dice until he (Note: gender bias here) "makes his point." The player loses by
	rolling a 7 before making the point.

	Extra credit
	Write a menu-driven craps game with these options:
		Read the rules
		Play craps
		Quit
*/

import java.util.Scanner;  // Needed for the Scanner class
import java.util.Random;

public class Craps {
   public static void main(String [] args)    {
		int point, sum;

		// Create a Random class object.
		Random randomNumbers = new Random();

		// Create a Scanner object to read input.
		Scanner keyboard = new Scanner(System.in);

		System.out.println("First roll.\n");
		sum = roleDice(randomNumbers);
		System.out.println("Sum:\t" + sum + "\n");

		switch (sum) {

			case 7: case 11:
				System.out.println("Player wins.");
				break;

			case 2: case 3: case 12:
				System.out.println("Player loses.");
				break;

			default:
				point = sum;
				do {
					sum = roleDice(randomNumbers);
					System.out.println("Sum:\t" + sum + "\n");

				} while (sum != 7 && sum != point);

				if (sum == point)
					System.out.println("Player wins.");
				else
					System.out.println("Player loses.");

		}
	}

		public static int roleDice(Random randomNumbers) {
			int dice1, dice2;

			dice1 = randomNumbers.nextInt(7);
			dice2 = randomNumbers.nextInt(7);

			System.out.println("Dice 1:\t" + ++dice1);
			System.out.println("Dice 2:\t" + ++dice2);

			return dice1 + dice2;
		}


	// create role method
}