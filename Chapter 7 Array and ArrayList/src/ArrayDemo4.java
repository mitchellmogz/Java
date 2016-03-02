import java.util.Scanner;

public class ArrayDemo4 {

	public static void main(String[] args)
	{
		
			//find highest value in array
		int[] numbers = {5,6,9,1,32,100,11,57,3};
		
		int highest = numbers[0];
		
		for(int i = 1; i < numbers.length; i++)
		{
			if(numbers[i] > highest)
			{
				highest = numbers[i];
			}
		}
		System.out.println("The highest value is " + highest );
		
		
		
			//find lowest value in array
		int lowest = numbers[0];
		
		for (int i = 1; i < numbers.length; i++)
		{
			if(numbers[i] < lowest)
			{
				lowest = numbers[i];
			}
		}
		System.out.println("The lowest value is " + lowest);
		
		
			//sum array elements
		int total = 0;
		
		for(int i = 0; i < numbers.length; i++)
		{
			total+= numbers[i];
		}
		System.out.println("The total is " + total);
		
		
			//average array elements
		double average = (double)total / numbers.length;
		System.out.println("The average is " + average);
		
			//partially filled arrays
		Scanner keyboard = new Scanner(System.in);
		int[] numbers2 = new int[100];
		int count = 0;
		
		
		System.out.println("Enter a numner or -99 to quit.");
		int number = keyboard.nextInt();
		
		while(number != -99 && count <= 99)
		{
			numbers2[count] = number;
			count++;
			System.out.println("Enter a numner or -99 to quit.");
			number = keyboard.nextInt();
			
		}
		
		for(int n : numbers2)
		{
			if(n != 0)
			{
			System.out.println(n);
			}
		}
		
		
			
		
	}
	
}
