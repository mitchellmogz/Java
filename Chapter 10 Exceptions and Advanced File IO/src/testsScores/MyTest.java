package testsScores;

public class MyTest {

		//feilds
	private double score;
	private double scores;
	
	
		//setScores
	public void setScores(double scores) throws MyOwnTest
	{
		
		for(int i = 0; i < 3; i++)
		{
			
			if(scores < 0 || scores > 100)
			{
				throw new MyOwnTest(scores);
			}
			
			this.scores = scores;
		}
		
	}
	
		//setScore
	public void setScore(double score) throws MyOwnTest
	{
		
		if(score < 0 || score > 100)
		{
			throw new MyOwnTest(score);
		}
		
		this.score = score;
		
	}
	
	//Calculate Average
		public double calAvg(double[] scores)
		{
			int sum = 0;
			for(double score : scores)
			{
					sum = (int) (sum + score);		
			}
			return sum / scores.length;
		}	
	
}
