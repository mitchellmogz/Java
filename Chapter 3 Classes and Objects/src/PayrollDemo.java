import java.util.Scanner;
public class PayrollDemo {
	
	public static void main (String[] args) 
	{
			//Variables
		String testName;
		int testID;
		double testHPR;
		double testNHW;
		double testGross;
		
			//Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);
		
			//Get the employee name.
		System.out.print("Enter your name. ");
		testName = keyboard.nextLine();
		
			//Get employee ID number.
		System.out.print("Enter your ID Number. ");
		testID = keyboard.nextInt();
		
			//Get employee Hourly Pay Rate.
		System.out.print("Enter your hourly pay rate. ");
		testHPR = keyboard.nextDouble();
		
			//Get employee Number of Hours Worked.
		System.out.print("Enter your number of hours worked. ");
		testNHW = keyboard.nextDouble();
		
			//Calculations
		testGross = testHPR * testNHW;
		
			//Creating an instance
		Payroll firstEm = new Payroll(testName, testID, testHPR, testNHW, testGross);
		
		//Output
		System.out.println();
		System.out.println("The Name you entered is " + firstEm.getName());
		System.out.println("Your ID Number you entered is: " + firstEm.getID());
		System.out.println("Your Hourly Pay Rate you entered is: " + firstEm.getHPR());
		System.out.println("Your Number of Hours Worked you entered is: " + firstEm.getNHW());
		System.out.println("Your grosspay would be: " + firstEm.getGross());
	}
}
