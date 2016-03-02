
public class License {


	static boolean passed(int correct)
	{
		
		double percentage = totalCorrect
		return(percentage >= passing);
		
	}
	
	
	static int totalCorrect(char[]correct, char[] answer)
	{
		
		int numberCorrect = 0;
		
		for (int num = 0; num < correct.length; num++)
		{
			if(correct[num] == answer[num])
			{
				numberCorrect++;
			}
		}
		return numberCorrect;
		
	}
	
	static int totalIncorrect(char[]correct, char[] answer)
	{
		
		int numberIncorrect = 0;
		
		for (int num = 0; num < correct.length; num++)
		{
			if (correct[num] != answer[num])
			{
				numberIncorrect++;
			}
		}
		return numberIncorrect;
		
	}
	
	static int[] questionMissed(char[] correct, char[] answer)
	{
		
		int[] missedQuestions = new int[correct.length];
		
		for (int num = 0; num < correct.length; num++)
		{
			if (correct[num] != answer[num])
			{
				missedQuestions[num] = (num + 1);
			}
		}
		return missedQuestions;
		
	}
	
	// Prints the values in a char array.
		static void printArray(char[] exam)
		{
			
			for (int row = 0; row < exam.length; row++)
			{
				System.out.print(exam[row] + " ");
			}
			System.out.println();
			
		}

		// Prints the values in an int array that are non-zero.
		static void printMissedQuest(int[] missedQ)
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
