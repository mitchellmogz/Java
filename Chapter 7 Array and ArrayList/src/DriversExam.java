import java.util.Scanner;

public class DriversExam {

	public static void main(String[] args) {
		
			//Varibles
		char[] correctAnswers = {'B', 'D', 'A', 'A', 'C', 'A', 'B', 'A', 'C', 'D', 'B', 'C', 'D', 'A', 'D', 'C', 'C', 'B', 'D' , 'A'};
		char[] inputAnswers = new char[correctAnswers.length];
		double passingGrade = 75.0;
		char answer;
		boolean or;
		
		
	
		
			//Scanner
		Scanner keyboard = new Scanner(System.in);
		
			//Constructor
		
		
		for(int num = 0; num < correctAnswers.length; num++)
		{
			
			do
			{
				or = false;
				System.out.println("Question #" + (num + 1) + ":");
				answer = keyboard.nextLine().toUpperCase().charAt(0);
				
				if(answer != 'A' && answer != 'B' && answer != 'C' && answer != 'D')
				{
					System.out.println("Please Enter A, B, C, or D.");
					or = true;
				}
				
		      	inputAnswers[num] = answer;
				
			}while (or);
			
		}

		// Demonstrate the totalCorrect() function.
	 	System.out.println("Total correct: " + License.totalCorrect(inputAnswers, correctAnswers) );


		// Demonstrate the totalncorrect() function.
	 	System.out.println("Total incorrect: " + License.totalIncorrect(inputAnswers, correctAnswers) );


		// Demonstrate the questionsMissed() function.
	 	int[] missedQuestions = License.questionMissed(inputAnswers, correctAnswers);
		License.printMissedQuest(missedQuestions);


		// Demonstrate the passed() function.
		if (License.passed(inputAnswers, correctAnswers, passingGrade) )
			System.out.print("You passed!");
		else
			System.out.print("You failed. Better luck next time.");

      	System.out.println(" Passing is " + passingGrade + "%.");
      	
		
		
		
	}

}
