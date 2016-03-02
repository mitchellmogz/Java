
public class InsectDemo 
{

	public static void main(String[] args)
	{
		Insect critter = new Insect(500,2);
		BumbleBee buzz = new BumbleBee();
		Grasshopper jumper = new Grasshopper(2,2,"orange");
		
		buzz.setNumberOfLegs(4);
		buzz.setNumberOfEyes(2);
		
		
		
		System.out.println("The bee has " + buzz.getNumberOfEyes() + " eyes.\nThe bee has " + buzz.getNumberOfLegs() + " legs.");
		System.out.println(buzz.move());
		
		System.out.println("The critter has " + critter.getNumberOfEyes() + " eyes.\nThe critter has " + critter.getNumberOfLegs() + " legs.");
		System.out.println(critter.move());
		
		System.out.println(jumper);
		System.out.println(jumper.move());
	}
	
}
