import java.text.DecimalFormat;
import java.util.Scanner;
public class RunnerDriver {
	
	public static void main (String[] args) 
		{
			//Variables
		String run1;
		String run2;
		String run3;
		double time1;
		double time2;
		double time3;
		
			//Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);
		
			//Decimal Format
		DecimalFormat formatter = new DecimalFormat("0.00");
		
			//Get the first runners name.
		System.out.print("Enter the first runners name. ");
		run1 = keyboard.nextLine();
		
			//Get the first runners time.
		System.out.print("Enter the first runners time. ");
		time1 = keyboard.nextDouble();
		
			//Keyboard buffer
		keyboard.nextLine();
		
			//Get the second runners name.
		System.out.print("Enter the second runners name. ");
		run2 = keyboard.nextLine();
		
			//Get the second runners time.
		System.out.print("Enter the second runners time. ");
		time2 = keyboard.nextDouble();
		
			//Keyboard buffer
		keyboard.nextLine();
		
			//Get the third runners name.
		System.out.print("Enter the third runners name. ");
		run3 = keyboard.nextLine();
		
			//Get the third runners time.
		System.out.print("Enter the third runners time. ");
		time3 = keyboard.nextDouble();
		
			//Creating an instance
		Runner firstPl = new Runner(run1, run2, run3, time1, time2, time3);
		
			//Output
		if (time1 < time2 && time1 < time3)
		{
			if (time2 < time3)
			{
			System.out.println("First place is " + firstPl.getRun1() + " which ran the time at "
					+ formatter.format(firstPl.getTime1()) + " minutes.\nSecond place is "
					+ firstPl.getRun2() + " which ran the time at " + formatter.format(firstPl.getTime2())
					+ " minutes.\nAnd third place is " + firstPl.getRun3() + " which ran the time at " 
					+ formatter.format(firstPl.getTime3()) + " minutes." );
			}
			else if (time3 < time2)
			{
			System.out.println("First place is " + firstPl.getRun1() + " which ran the time at "
					+ formatter.format(firstPl.getTime1()) + " minutes.\nSecond place is "
					+ firstPl.getRun3() + " which ran the time at " + formatter.format(firstPl.getTime3())
					+ " minutes.\nAnd third place is " + firstPl.getRun2() + " which ran the time at " 
					+ formatter.format(firstPl.getTime2()) + " minutes." );
			}
		}
		else if (time2 < time1 && time2 < time3)
		{
			if (time1 < time3)
			{
			System.out.println("First place is " + firstPl.getRun2() + " which ran the time at "
					+ formatter.format(firstPl.getTime2()) + " minutes.\nSecond place is "
					+ firstPl.getRun1() + " which ran the time at " + formatter.format(firstPl.getTime1())
					+ " minutes.\nAnd third place is " + firstPl.getRun3() + " which ran the time at " 
					+ formatter.format(firstPl.getTime3()) + " minutes." );
			}
			else if (time3 < time1)
			{
			System.out.println("First place is " + firstPl.getRun2() + " which ran the time at "
					+ formatter.format(firstPl.getTime2()) + " minutes.\nSecond place is "
					+ firstPl.getRun3() + " which ran the time at " + formatter.format(firstPl.getTime3())
					+ " minutes.\nAnd third place is " + firstPl.getRun1() + " which ran the time at " 
					+ formatter.format(firstPl.getTime1()) + " minutes." );
			}
		}
		else if (time3 < time1 && time3 < time2)
		{
			if (time1 < time2)
			{
			System.out.println("First place is " + firstPl.getRun3() + " which ran the time at "
					+ formatter.format(firstPl.getTime3()) + " minutes.\nSecond place is "
					+ firstPl.getRun1() + " which ran the time at " + formatter.format(firstPl.getTime1())
					+ " minutes.\nAnd third place is " + firstPl.getRun2() + " which ran the time at " 
					+ formatter.format(firstPl.getTime2()) + " minutes." );
			}
			else if (time2 < time1)
			{
			System.out.println("First place is " + firstPl.getRun3() + " which ran the time at "
					+ formatter.format(firstPl.getTime3()) + " minutes.\nSecond place is "
					+ firstPl.getRun2() + " which ran the time at " + formatter.format(firstPl.getTime2())
					+ " minutes.\nAnd third place is " + firstPl.getRun1() + " which ran the time at " 
					+ formatter.format(firstPl.getTime1()) + " minutes." );
			}
		}
		
	}
}