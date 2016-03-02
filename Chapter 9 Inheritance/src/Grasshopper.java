
public class Grasshopper extends Insect {

	private String color;
	
	
	public Grasshopper(int eyes, int legs, String color)
	{
		
		super(eyes, legs);
		this.color = color;
		
	}
	
	
	public String move()
	{
		return("The grassbopper jumps up for 3 seconds.");
	}
	
	public String toString(){
		
		return "The grasshopper has " + getNumberOfEyes() + " eyes.\nThe grasshopper has " + getNumberOfLegs() +
				" legs.\nThe grasshopper is " + color + ".";
		
	}
	
}
