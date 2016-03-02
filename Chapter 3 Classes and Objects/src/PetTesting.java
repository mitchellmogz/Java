import java.util.Scanner;
public class PetTesting {
	
	public static void main (String[] args) 
	{
			//Variables
		String testName;
		String testType;
		int testAge;
				
			//Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);
		
			//Get the pet name.
		System.out.print("Enter the name of your pet. ");
		testName = keyboard.nextLine();
		
			//Get the pet type.
		System.out.print("Enter the pet type. ");
		testType = keyboard.nextLine();
		
			//Get the pet age.
		System.out.print("Enter the age of your pet. ");
		testAge = keyboard.nextInt();

			//Creating an instance
		Pet firstPet = new Pet(testName, testType, testAge);
		
			//Output
		System.out.println();
		System.out.println("The name of your pet is: " + firstPet.getName());
		System.out.println("The animal type you entered is: " + firstPet.getType());
		System.out.println("Your pet's age you entered is: " + firstPet.getAge());
	}
}