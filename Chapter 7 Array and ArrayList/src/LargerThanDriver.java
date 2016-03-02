import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class LargerThanDriver {

	public static void main(String[] args)
	{
	
			//Variables
		int number = 0;
		int keep = 0;
		int[] numbers2 = new int[100];
		int count = 0;
		
			//Scanner
		Scanner keyboard = new Scanner(System.in);
	
			//Array
		
		
			//Out of my body
		System.out.println("Enter an integer. Enter -99 to quit.");
		number = keyboard.nextInt();
		
		while(number != -99 && count <= 100)
		{
			numbers2[count] = number;
			count++;
			System.out.println("Enter an integer. Enter -99 to quit.");
			number = keyboard.nextInt();
			
		}
		System.out.println("Now enter an Integer.");
		keep = keyboard.nextInt();
			
			
			LargerThan zip = new LargerThan(keep);
		
			//Beta test
		
		System.out.println("This is the number you entered: " + zip.getNumber());
		
		System.out.println(zip.getList());
		
	}
}
