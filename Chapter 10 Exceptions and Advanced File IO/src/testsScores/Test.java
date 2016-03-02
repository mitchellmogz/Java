package testsScores;

public class Test {

		//field
	private double[] scores;

		//Constructor
	public Test(double[] scores) 
	{
		this.scores = scores;
	}
	
		//Calculate Average
	public double calAvg(double[] scores)
	{
		int sum = 0;
		for(double score : scores)
		{
			if(score < 0 || score > 100)
			{
				throw new IllegalArgumentException("An entered score is negative or greater than 100.");
			}
				sum = (int) (sum + score);		
		}
		return sum / scores.length;
	}	
}
