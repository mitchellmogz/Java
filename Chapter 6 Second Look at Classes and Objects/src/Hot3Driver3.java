import java.util.Scanner;

public class Hot3Driver3 {

	public static void main(String[] args) {
		
		int one;
		int two;
		int three;
		
		Scanner keyboard = new Scanner(System.in);

		System.out.println("This will be using an overloaded method.\nWe will be adding only two numbers to the Grades method.");
		System.out.println("Please enter the first number. Please only Integers.");
		one = keyboard.nextInt();
		
		System.out.println("Please enter the second number. Please only Integers.");
		two = keyboard.nextInt();
		
		System.out.println("The answer is ");
		System.out.println(Hot3Driver.Grades(one, two));
		
		System.out.println("Now we will add three numbers and using the same method, the numbers will still add.");
		System.out.println("Please enter the first number. Please only Integers.");
		one = keyboard.nextInt();
		
		System.out.println("Please enter the second number. Please only Integers.");
		two = keyboard.nextInt();
		
		System.out.println("Please enter the third number. Please only Integers.");
		three = keyboard.nextInt();
		
		System.out.println("The answer is ");
		System.out.println(Hot3Driver.Grades(one, two, three));
	}

}
