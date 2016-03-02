import java.util.Scanner;
import java.text.DecimalFormat;
public class MobileServiceDriver
{

	public static void main(String[] args)
	{
		//Variables
				char num;
				double packAP = 39.99;
				double packAM = 450;
				double packAC = 0.45;
				double packBP = 59.99;
				double packBM = 900;
				double packBC = .40;
				double packCC = 69.99;
				double total;

				
					//Scanner Object
				Scanner keyboard = new Scanner(System.in);
				
					//Decimal Format
				DecimalFormat formatter = new DecimalFormat("0.00");
				
					//Present Package Plans
				System.out.println("Package A:\nFor $39.99 per month 450 minutes are provided." +
					"\nAdditional minutes are $0.45 per minute.\n\nPackage B:\n" 
					+ "For $59.99 per month 900 minutes are provided.\n" + 
					"Additional minutes are $0.45 per minute.\n\nPackage C:\n"
					+ "For $69.99 per month unlimited minutes are provided.\n");
				
					//Ask for the number of calories
				System.out.println("Please enter A, B, or C for ");
				num = keyboard.next().charAt(0);
				
					//instance
				MobileService firstPack = new MobileService(num, packAP, packAM, packAC, packBP, packBM, packBC, packCC );
				
				switch (num)
				{
					case 'A':
					{
						System.out.println("You entered Package A.\nNow enter the amount of " + 
							"minutes used.");
						total = keyboard.nextDouble();
						
						System.out.println("The bill would be ");
					}
					case 'B':
					{
						System.out.println("Bx");
						break;
					}
					case 'C':
					{
						System.out.println("CcA");
						break;
					}
				}
		
	}

}
