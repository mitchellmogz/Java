
public class Insect {

		//Fields
	private int numberOfEyes;
	private int numberOfLegs;
	
		//Move Method
	public String move()
	{
		return ("The insect moves forward for 3 seconds.");
	
	}

	public Insect(int numberOfEyes, int numberOfLegs) {
			super();
			this.numberOfEyes = numberOfEyes;
			this.numberOfLegs = numberOfLegs;
		}
	
	public Insect()
	{
		
	}

	public int getNumberOfEyes() {
		return numberOfEyes;
	}

	public void setNumberOfEyes(int numberOfEyes) {
		this.numberOfEyes = numberOfEyes;
	}

	public int getNumberOfLegs() {
		return numberOfLegs;
	}

	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}
	
}
