import java.util.Scanner;

public class DriverExam {

	public static void main(String[] args)
	{
			//Variables
		final int SIZE = 20;
		char[] correctAnswers = {'B', 'D', 'A', 'A', 'C', 'A', 'B', 'A', 'C', 'D', 'B', 'C', 'D', 'A', 'D', 'C', 'C', 'B', 'D' , 'A'};
		char oneAnswer = ' ';
		char[] wrongAnswer = new char[SIZE];
		int numberWrong = 0;
		boolean or;
		
			//Scanner
		Scanner keyboard = new Scanner(System.in);
		
		for(int num = 0; num < SIZE; num++)
		{
			
			do
			{
				or = false;
				System.out.println("Question #" + (num + 1) + ":");
				oneAnswer = keyboard.nextLine().toUpperCase().charAt(0);
				
				if(oneAnswer != 'A' && oneAnswer != 'B' && oneAnswer != 'C' && oneAnswer != 'D')
				{
					System.out.println("Please Enter A, B, C, or D.");
					or = true;
				}
				
			}while (or);
			
			if(correctAnswers[num] != oneAnswer)
			{
				wrongAnswer[num] = oneAnswer;
				numberWrong++;
			}
			
		}
		
		keyboard.close();
		
		if (numberWrong >= 5)
		{
		System.out.println("You did not pass the Driver Exam. Sorry.");
		}
		else
		{
		System.out.println("Congratulations! You passed!");
		}
		System.out.println("You answered " + (SIZE - numberWrong) + " right.\nYou answered " + numberWrong + " wrong.");
		
		for (int num = 0; num < SIZE; num++)
		{
			if(wrongAnswer[num] != '\u0000')
			{
				System.out.println("\nYou got question #" + (num + 1) + " wrong.\nYou answered " + wrongAnswer[num] + ". The right answer is " + correctAnswers[num]);
			}
		}
			
	}
	
}
