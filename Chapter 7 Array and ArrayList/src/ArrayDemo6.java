import java.util.Scanner;
import java.io.*;

public class ArrayDemo6 {

	public static void main(String[] args) throws IOException
	{
		String[] names = {"Joe", "Chris", "Charles"};
		int[] numbers = {5,1,23,87,56,24,77};
		
			//Length Field vs Length Method
		System.out.println(names.length);
		
		System.out.println(names[1] + " has " + names[1].length() + " characters in his name.");
		
			//Array Custom Objects 2 parts
		
			//create array
		ArrayDemo6part1[] studentList = new ArrayDemo6part1[200];
		
			//create objects
		for(int i = 0; i < studentList.length; i++)
		{
			studentList[i] = new ArrayDemo6part1();
		}
		
		
			//Sequential Search
		System.out.println(search(names, "Chris"));
		
		
			//Selection Sort
		selectionSort(numbers);
		for(int i : numbers)
		{
			System.out.println(i);
		}
		
			//Binary Search
		
		
	}
		//sequential method
	public static String search(String[] names, String key)
	{
		for(int i = 0; i < names.length; i++)
		{
			if(names[i].equals(key))
			{
				return "name was found.";
			}
		}
		return "Not found";
	}
	
		//selection sort method in decending
	public static void selectionSort(int[] nums)
	{
		
		int first,temp;
		
		for(int i = nums.length - 1; i > 0; i--)
		{
			first = 0;
			for(int j = 1; j <= i; j++)
			{
				if(nums[j] < nums[first])
				{
					first = j;
				}
			}
			temp = nums[first];
			nums[first] = nums[i];
			nums[i] = temp;
		}
		
	}
	
}
