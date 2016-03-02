import java.util.Scanner;

public class ArrayDemo3 {

	public static void main(String[] args)
	{
		
			//let the user specify the size of the array
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("How many students are there?");
		int num = keyboard.nextInt();
		
		String[] students = new String[num];
		
			//Display
		System.out.println("There are " + students.length + " students.");
		
			//reassigning array referances
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		
		for(int x : numbers)
		{
			System.out.println(x);
		}
		
		
		//bad
		//numbers = new int[5];
		
		//for(int x : numbers)
		//{
			//System.out.println(x);
		//}
		
		
		
			//copying arrays as arguments
		int[] firstArray = {1,2,3,4,5,6,7,8,9,10};
		int[] secondArray = new int[10];
		int[] thirdArray = new int[10];
		
		for(int i = 0; i < secondArray.length; i++)
		{
			
			secondArray[i] = firstArray[i];
			
		}
		
		for(int i = 0; i < thirdArray.length; i++)
		{
			
			thirdArray[i] = firstArray[i];
			
		}
		
		for(int i : firstArray)
		{
			
			System.out.println(i);
			
		}
		
		for(int i : thirdArray)
		{
			
			System.out.println(i);
			
		}
		
			//Passing arrays as arguemtns
		showArray(secondArray);
		
		System.out.println("The last number in the array: ");
		System.out.println(secondArray[4]);
			//Arrays pass by reference
		
		
			//comparing arrays to determin if equal
		
		/*	//bad
		if(firstArray == secondArray)
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("No");
		}
		*/
		
			//right
			//are they the same length
		boolean arrayEqual = true;
		int i = 0;
		if(firstArray.length != thirdArray.length)
		{
			arrayEqual = false;
		}
		
			//are the elements the same values
		while (arrayEqual && i < firstArray.length)
		{
			if(firstArray[i] != thirdArray[i])
			{
				arrayEqual = false;
			}
			i++;
		}
		
		if(arrayEqual)
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Not");
		}
		
		
	}
	
	public static void showArray(int[] myNumbers)
	{
		System.out.println("Show Array Method: ");
		for(int i : myNumbers)
		{
			System.out.println(i);
		}
		
		myNumbers[4] = 44;
	}
	
}
