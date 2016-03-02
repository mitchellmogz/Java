import java.util.ArrayList;

public class LargerThan {

		//Fields
	private int number;
	int[] array;
	int[] secondArray;
	
		//Contructor
	public LargerThan(int[] array)
	{
		this.array = array;
	}
	
		//Constructor
	public LargerThan(int number)
	{
		this.number = number;
	}

		//Getters
	public int getNumber() {
		return number;
	}
		
		//Setters
	public void setNumber(int number) {
		this.number = number;
	}
	
		//Numbers Greater Than
	public int getList()
	{
		
		for(int x = 0; x <= array.length; x++)
		{
			
			if(number < array[x])
			{
				secondArray[x] = array[x];
			}
			
			
		}
		return 50;
	}
	
}
