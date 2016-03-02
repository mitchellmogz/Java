
public class Rainfall {

		//Fields
	private double[] rainfall;
		
		//Constructor
	public Rainfall(double[] rain)
	{
		
			//creating an array the same length as rain
		rainfall = new double[rain.length];
		
			//Copy the values 
		for (int index = 0; index < rain.length; index++)
		{
			rainfall[index] = rain[index];
		}
		
	}
	
		//Accessor
	public double getTotalRainfall()
	{
		
		double total = 0.0;
		
			//adds all the values in the rainfall array
		for (double value : rainfall)
		{
			total = total + value;
		}
		
			//return total
		return total;
		
	}
	
	public double getAverageRainfall()
	{
		return getTotalRainfall() / rainfall.length;
	}
	
	public double getHighest()
	{
		double highest = rainfall[0];
		
		for (int index = 1; index < rainfall.length; index++)
		{
			if (rainfall[index] > highest)
			{
				highest = rainfall[index];
			}
		}
		
		return highest;
	}
	
	public double getLowest()
	{
		
		double lowest = rainfall[0];
		
		for (int index = 1; index < rainfall.length; index++)
		{
			if (rainfall[index] < lowest)
			{
				lowest = rainfall[index];
			}
		}
		
		return lowest;
		
	}
}
