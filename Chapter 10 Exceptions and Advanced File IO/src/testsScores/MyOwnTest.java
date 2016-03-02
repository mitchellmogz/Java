package testsScores;
@SuppressWarnings("serial")
public class MyOwnTest extends Exception {

		//no arg constructor
	public MyOwnTest()
	{
		super("An error occured. You cannot have a test lower than 0 or higher than 100.");
	}
	
		//this constructor accepts the balance and uses that in the message to the end user
	public MyOwnTest(double score)
	{
		super("An error occured. You cannot have a test lower than 0 or higher than 100. The test was " + score);
	}
	
	
}
