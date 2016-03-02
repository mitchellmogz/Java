import java.io.IOException;
import java.util.Arrays;

public class ArrayDemo7 {

	public static void main(String[] args) throws IOException
	{
			//array
		int[] numbers = {5,1,23,87,56,24,77};
		
			//Selection Sort
		selectionSort(numbers);
		for(int i : numbers)
		{
			System.out.println(i);
		}
		
			//Binary Search Demo
		int result = binarySearch(numbers,1);
	
		if(result == -1)
		{
			System.out.println("Value was not found.");
		}
		else
		{
			System.out.println("Value was found at posistion " + result );
		}
		
			//Binary Search
		
			//#1 Requires an arry sorted in ascending order
			//#2 Starts with the element in the middle of the array
			//#3 If that element is the seached value, the search is over
			//#4 Otherwise the value in the middle element is either greater or less than the desired value
			//#5 If it is greater than the desire value search in the first half of the array
			//#6 Otherwie, search the last half of the array
			//#7 Repeat as needed while adjusting start and end points of the search
	
		
		
	}
	
		//Selection Sort Method in Ascending order
	public static void selectionSort(int[] nums)
	{
		int startScan, index, minIndex, minValue;
		
		for(startScan = 0; startScan < nums.length - 1; startScan++)
		{
			
			minIndex = startScan;
			minValue = nums[startScan];
			for(index = startScan + 1; index < nums.length; index++)
			{
				if(nums[index] < minValue)
				{
					minValue = nums[index];
					minIndex = index;
				}
			}
			nums[minIndex] = nums[startScan];
			nums[startScan] = minValue;
		}
	}
	
	public static int binarySearch(int[] nums, int value)
	{
		
		int first;
		int last;
		int middle;
		int position;
		
		boolean found;
		
		first = 0;
		last = nums.length - 1;
		position = -1;
		found = false;
		
			//Search
		while(!found && first <= last)
		{
		
			middle = (first + last)/2;
			
			if(nums[middle] == value)
			{
				found = true;
				position = middle;
			}
				
			else if(nums[middle] > value)
			{
				last = middle - 1;
			}
			else
			{
				first = middle + 1;
			}
		}
			return position;
	}
			
}
		

