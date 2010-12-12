import java.util.Scanner;  // Needed for the Scanner class

/**
   This program demonstrates the Scanner class.
*/

public class Chpt2Number10
{
   public static void main(String[] args)
   {
      double test1;				// First test score
      double test2;				// Second test score
      double test3;           		// Third test score
      double averageScore;		// Average Score

      // Create a Scanner object to read input.
      Scanner keyboard = new Scanner(System.in);

      // Get the first test score.
      System.out.print("What was your first test score? ");
      test1 = keyboard.nextInt();

      // Get the second test score.
      System.out.print("What was your second test score? ");
      test2 = keyboard.nextInt();

      // Get the third test score.
      System.out.print("What was your third test score? ");
      test3 = keyboard.nextInt();

      // Calculate the gross pay.
      averageScore = (test1 + test2 + test3) / 3;

      // Display the resulting information.
      System.out.println();
      System.out.println("Your first test score was " + test1);
      System.out.println("Your second test score was " + test2);
      System.out.println("Your third test score was " + test3);
      System.out.println("The average of the 3 scores is " + averageScore);
   }
}
