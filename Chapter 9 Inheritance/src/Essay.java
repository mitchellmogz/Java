
public class Essay extends GradedActivity {
	
		//Fields
	private final int totalGrammer = 30;
	private final int totalSpelling = 20;
	private final int totalLength = 20;
	private final int totalContent = 30;
	private int pointsGrammer;
	private int pointsSpelling;
	private int pointsLength;
	private int pointsContent;
	private int points;
	
		//constructor
	public Essay(int grammer, int spelling, int length, int content) 
	{
		setPointsGrammer(grammer);
		setPointsSpelling(spelling);
		setPointsLength(length);
		setPointsContent(content);
		setTotal();
		setScore(score);
	}
	
		//getters and setters
	public int getPointsGrammer()
	{
		return pointsGrammer;
	}
	
	public void setPointsGrammer(int pointsGrammer)
	{
		this.pointsGrammer = pointsGrammer;
	}
	
	public int getPointsSpelling()
	{
		return pointsSpelling;
	}
	
	public void setPointsSpelling(int pointsSpelling)
	{
		this.pointsSpelling = pointsSpelling;
	}
	
	public int getPointsLength()
	{
		return pointsLength;
	}
	
	public void setPointsLength(int pointsLength)
	{
		this.pointsLength = pointsLength;
	}
	
	public int getPointsContent() 
	{
		return pointsContent;
	}
	
	public void setPointsContent(int pointsContent)
	{
		this.pointsContent = pointsContent;
	}
	
	public int getTotalGrammer()
	{
		return totalGrammer;
	}
	
	public int getTotalSpelling()
	{
		return totalSpelling;
	}
	
	public int getTotalLength()
	{
		return totalLength;
	}
	
	public int getTotalContent()
	{
		return totalContent;
	}
	
	public void setTotal()
	{
		int score = pointsGrammer + pointsSpelling + pointsLength + pointsContent;
		this.points = score;
	}
	
	public int getTotal()
	{
		return points;
	}
	

		//toString
	public String toString() {
		return "{Essay Grade}\n\nGrammer: " + getPointsGrammer() + "\nSpelling: " + getPointsSpelling() + "\nCorrent Length: " + 
				getPointsLength() + "\nContent: " + getPointsContent() + "\n\nTotal Points: " + getTotal() ;
	}
	
	
	
	
}
