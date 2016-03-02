import java.text.DecimalFormat;

public class Activity
{	
		//Fields
	private int points;
	private int maxScore;
	
		//DecimalFormat
	DecimalFormat decimalFormat = new DecimalFormat("###.##");

		//Constructor
	public Activity(int score, int maxScore)
	{
		setScore(score);
		setMaxScore(maxScore);
	}

		//
	public int getMaxScore()
	{
		return maxScore;
	}

	public double getPercentage()
	{
		
		double percentage = getScore();
		percentage /= getMaxScore();
		percentage *= 100;
		
		return Double.parseDouble(decimalFormat.format(percentage));
	}

	public int getScore()
	{
		return points;
	}
	
	public void setMaxScore(int maxScore)
	{
		this.maxScore = maxScore;
	}

	public void setScore(int score)
	{
		this.points = score;
	}
}