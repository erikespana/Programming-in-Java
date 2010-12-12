/* Page 653, # 1
   Backward String

   Write a method that accepts a String object as an argument
   and displays its contents backward. For instance, if the
   string argument is "gravity" the method should display "ytivarg".
   Demonstrate the method in a program that asks the user to input
   a string and then passes it to the method.

*/

import java.util.Scanner;  // Needed for the Scanner class

public class BackwardString
{
	public static void main(String[] args)
	{
		// Create an array init to 0
		char[] answerKey = {'B','D','A','A','C','A','B','A','C','D','B','C','D','A','D','C','C','B','D','A'},
			   studentAns = new char[answerKey.length];

		double passing = 65.0;

		// Create a Scanner object to read input.
      	Scanner keyboard = new Scanner(System.in);
		String input;	// To hold a line of input
		char answer;	// To hold a single character;

      	// Ask the user to enter a student's answers.
      	for (int i = 0; i < answerKey.length; i++)
      	{
			System.out.print("What is the answer to question #" + (i + 1) + "? ");
	      	input = keyboard.nextLine();
	      	studentAns[i] = input.charAt(0);
	 	}

		// Demonstrate the totalCorrect() function.
	 	System.out.println("Total correct: " + totalCorrect(studentAns, answerKey) );


		// Demonstrate the totalncorrect() function.
	 	System.out.println("Total incorrect: " + totalIncorrect(studentAns, answerKey) );


		// Demonstrate the questionsMissed() function.
	 	int[] missedQuestions = questionMissed(studentAns, answerKey);
		printMissedQuest(missedQuestions);


		// Demonstrate the passed() function.
		if (passed(studentAns, answerKey, passing) )
			System.out.print("You passed!");
		else
			System.out.print("You failed. Better luck next time.");

      	System.out.println(" Passing is " + passing + "%.");


	}

	// Returns true if the student passed the exam or false if the student failed.
	private static boolean passed(char[] exam, char[] answers, double passing)
	{
		double percentageCorrect = (totalCorrect(exam, answers) / answers.length * 100);
		return (percentageCorrect >= passing);
	}

	// Returns the total number of correctly answered questions
	private static int totalCorrect(char[] exam, char[] answers)
	{
		int numCorrect = 0;
		for (int i = 0; i < exam.length; i++)
			if (exam[i] == answers[i])
				numCorrect++;

		return numCorrect;
	}

	// Returns the total number of incorrectly answered questions
	private static int totalIncorrect(char[] exam, char[] answers)
	{
		int numIncorrect = 0;
		for (int i = 0; i < exam.length; i++)
			if (exam[i] != answers[i])
				numIncorrect++;

		return numIncorrect;
	}

	// An int array containing the question numbers of the questions that the student missed.
	private static int[] questionMissed(char[] exam, char[] answers)
	{
		int[] missedQuestions = new int[exam.length];
		for (int i = 0; i < exam.length; i++)
			if (exam[i] != answers[i])
				missedQuestions[i] = (i+1);

		return missedQuestions;
	}

	// Prints the values in a char array.
	private static void printArray(char[] exam)
	{
		for (int row = 0; row < exam.length; row++)
		{
			System.out.print(exam[row] + " ");
		}
		System.out.println();
	}

	// Prints the values in an int array that are non-zero.
	private static void printMissedQuest(int[] missedQ)
	{
		System.out.print("Questions missed: ");
		for (int row = 0; row < missedQ.length; row++)
		{
			if (missedQ[row] != 0)
				System.out.print(missedQ[row] + ", ");
		}
		System.out.println();
	}

}