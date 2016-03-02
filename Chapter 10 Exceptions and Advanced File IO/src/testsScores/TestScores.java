package testsScores;
import java.io.IOException;
import java.util.Scanner;

public class TestScores {

	public static void main(String[] args) throws IOException
	{
		
			//variables
		double[] scores = new double[3];
		
		
			//Scanner
		Scanner keyboard = new Scanner(System.in);
		
			//instance
		//Test tests = new Test(scores);
		MyTest tests = new MyTest();
		
		/*
		try
		{
			tests.setScore(100);
		}
		catch(MyOwnTest ex)
		{
			System.out.println(ex.getMessage());
		}
		*/
		try
		{
			for(int i = 0; i < scores.length; i++)
			{
				System.out.println("Please enter test score #" + (i + 1));
				scores[i] = keyboard.nextDouble();
				tests.setScores(scores[i]);;
			}
			
			System.out.println("\nThe average of the tests are " + tests.calAvg(scores));
			
		}
		catch(MyOwnTest ex)
		{
			System.out.println(ex.getMessage());
		}
		
		keyboard.close();
		
			//Input
		/*
		System.out.println("Please enter the 1st test score.");
		scores[0] = keyboard.nextDouble();
	
		System.out.println("Please enter the 2nd test score.");
		scores[1] = keyboard.nextDouble();
	
		System.out.println("Please enter the 3rd test score.");
		scores[2] = keyboard.nextDouble();
		*/
			
		
			//print results
		

		}
	}

