
public class ArrayDemo {

	public static void main(String[] args)
	{
		
			//variables
		int myVariable = 6;
		
			//array
		int[] number = new int[5];
		
			//assign values
		//number[0] = 5;
	//	number[1] = 4;
		//number[3] = 4;
		
		for(int num = 0; num < number.length; num++ )
		{
			
			number[num] = num;
			
		}
		
			//return
		for(int i = 0; i < number.length; i++)
		{
			System.out.println(number[i]);
		}
		
	}
	
}
