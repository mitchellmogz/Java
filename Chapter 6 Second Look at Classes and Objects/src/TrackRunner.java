import java.util.Scanner;

public class TrackRunner {

	public static void main(String[] args) {
		
			//Variable
		int length;
		int width;
		
			//Scanner
		Scanner keyboard = new Scanner(System.in);
		
			//Enter Length and Width for Track 1
		System.out.println("Please enter a length for Track 1.");
		length = keyboard.nextInt();
		
		System.out.println("Please enter a width for Track 1.");
		width = keyboard.nextInt();
		
			//create track 1 object
		Track track1 = new Track(length, width);
			
			//Enter Length and Width for Track 2
		System.out.println("Please enter a length for Track 2.");
		length = keyboard.nextInt();
		
		System.out.println("Please enter a width for Track 2.");
		width = keyboard.nextInt();
		
			//create track 2 object
		Track track2 = new Track(length, width);

			//Display Track 1
		System.out.println("Track 1\nLength: " + track1.getLength() + "\nWidth: " +
				track1.getWidth() + "\nArea: " + track1);
		
			//Display Track 2
		System.out.println("Track 2\nLength: " + track2.getLength() + "\nWidth: " +
				track2.getWidth() + "\nArea: " + track2);
		
			//confirm
		if (track1.toString().equals(track2.toString()))
		{
	         System.out.println("Track 1 and Track 2 ARE equal.");
	      }
	      else
	      {
	         System.out.println("Track 1 and Track 2 are NOT equal.");
	      }
		
		keyboard.close();
		
	}

}
