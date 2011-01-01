/**
	#07
	11/22/2010
	Rectangle class, phase 5
*/

public class ArrayExercise
{

   /**
      Constructor
      @param len The length of the rectangle.
      @param w The width of the rectangle.
   */

   public static void main(String[] args)
   {

	   final int MAX_ROWS = 3;
	   final int MAX_COLS = 4;

	   // Create an array init to 0
	   int[][] numbers = new int[MAX_ROWS][MAX_COLS];

		// print out
	   printArray(numbers, MAX_ROWS, MAX_COLS);
	   System.out.println();

	   // insert 1-12
	   insertSequential(numbers, MAX_ROWS, MAX_COLS);

	   // print out
	   printArray(numbers, MAX_ROWS, MAX_COLS);
	   System.out.println();

	   // add it up
	   int summer = sum(numbers, MAX_ROWS, MAX_COLS);

	   // print total
	   System.out.println("Sum = " + summer);

   }

   private static void insertSequential(int[][] array, int Rows, int Cols)
   {
	   int s = 1;
	   for (int row = 0; row < Rows; row++)
	   {
			for (int col = 0; col < Cols; col++)
			{
				array[row][col] = s++;
			}
		}

	}

	private static int sum(int[][] array, int Rows, int Cols)
	{
		int s = 1;
		for (int row = 0; row < Rows; row++)
		{
			for (int col = 0; col < Cols; col++)
			{
				s += array[row][col];
			}
		}
		return s;
	}

   private static void printArray(int[][] array, int Rows, int Cols)
   {
	   for (int row = 0; row < Rows; row++)
	   {
			for (int col = 0; col < Cols; col++)
			{
				System.out.print(array[row][col] + "\t");
			}
			System.out.println();
		}

	}



}