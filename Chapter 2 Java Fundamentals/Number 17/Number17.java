import java.util.Scanner; // Needed for the Scanner class

// Programming Challenge Number 17

public class Number17
{
	public static void main(String[] args)
	{
		
		String name;
		String age;
		String city;
		String college;
		String profession;
		String animal;
		String pet;
		
		// Create a Scanner object to read input
		Scanner keyboard = new Scanner(System.in);
		
		//Enter Your Name
		System.out.print("Enter your name.");
		name = keyboard.nextLine();
		
		//Enter Your Age
		System.out.print("Enter your age.");
		age = keyboard.nextLine();
		
		//Enter a city
		System.out.print("Enter a city.");
		city = keyboard.nextLine();
		
		//Enter a college
		System.out.print("Enter a college.");
		college = keyboard.nextLine();
		
		//Enter a profession
		System.out.print("Enter a profession.");
		profession = keyboard.nextLine();
		
		//Enter an animal
		System.out.print("Enter any type of animal.");
		animal = keyboard.nextLine();
		
		//Enter a pet
		System.out.print("Enter a name for that animal.");
		pet = keyboard.nextLine();
		
		//Display Ingredients
		System.out.printf("\nThere once was a person named %s who lived in %s. ",name,city);
		System.out.printf("At the age of %s, %s went to college at %s. ",age,name,college);
		System.out.printf("%s graduated and went to work as a %s. ",name,profession);
		System.out.printf("Then, %s adopted a(n) %s named %s. ",name,animal,pet);
		System.out.println("They both lived happily ever after!");
	}
}