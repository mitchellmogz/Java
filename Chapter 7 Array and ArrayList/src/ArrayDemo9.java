import java.util.Arrays;
import java.util.ArrayList;

public class ArrayDemo9 {

	public static void main(String[] args)
	{
		
			//Variable Length Arguments
		
		int[] myNumbers = {2,3,6,8};
		
		
		System.out.println(sum(1,2,3));
		System.out.println(sum(1,2,3,10));
		System.out.println(sum(myNumbers));
		
			//ArrayLists
		ArrayList<String> studentNames = new ArrayList<String>();
		
		
		studentNames.add("Eric");
		studentNames.add("Bob");
		studentNames.add("Bill");
		/*
		for(int index = 0;index < studentNames.size(); index++)
		{
			
			System.out.println(studentNames.get(index));
			
		}
		*/
		
		studentNames.add(1, "Jane");
		
		
		studentNames.remove(2);
		
		
		studentNames.set(0, "Chris");
		
		System.out.println(studentNames.toString());
		
	}
	
	
	public static int sum(int... numbers)
	{
		
		int total = 0;
		
		for (int x : numbers)
		{
			
			total += x;
			
		}
		
		return total;
		
	}
	
}
