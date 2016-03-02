
public class GradedActivity 
{

		//Fields
	protected static double score;

	
		//Getters and Setters
	public double getScore() 
	{
		return score;
	}

	public static void setScore(double s) 
	{
		score = s;
	}
	
	public char getGrade()
	{
		char letterGrade;
		if (score >= 90)
		{
			letterGrade = 'A';
		}
		else if (score >= 80)
		{
			letterGrade = 'B';
		}
		else if(score >= 70)
		{
			letterGrade = 'C';
		}
		else if(score >= 60)
		{
			letterGrade = 'D';
		}
		else 
		{
			letterGrade = 'F';
		}
		return letterGrade;
		
	}

		//toString
	public String toString() {
		return "{Grading Rubric}\n\nGrammer: 30 possible points\nSpelling: 20 possible points\nCorrect Length: 20 possible points\nContent: 30 possible points"  ;
	}
	
		
	
}
