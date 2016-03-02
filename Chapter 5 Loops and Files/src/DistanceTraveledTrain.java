import java.io.*;
import java.io.PrintWriter;
import java.util.Scanner;

public class DistanceTraveledTrain
{

	public static void main(String[] args) throws IOException
	{
				//Variables
			String filename;
			int hours;
			int speed;
			int num = 1;
				
				//Scanner Object
			Scanner keyboard = new Scanner(System.in);
			
				//Get file name
			System.out.println("Enter a name for the file.");
			filename = keyboard.nextLine();
				
				//Ask for the number of Hours
			System.out.println("How many hours did you travel?\n");
			hours = keyboard.nextInt();
				
			while (hours <= 0)
			{
				System.out.println("Please enter a number higher than 0.");
				hours = keyboard.nextInt();
			}
			
				//Ask for the Speed
			System.out.println("How fast were you going?\n");
			speed = keyboard.nextInt();
				
			while (speed <= 0)
			{
				System.out.println("Please enter a speed greater than 0.");
				speed = keyboard.nextInt();
			}
			
				//Open the file
			PrintWriter outputFile = new PrintWriter("C:\\Users\\mitch\\Desktop\\FilesWriter\\" + filename + ".txt");
			
				//instance
			DistanceTraveled firstTrain = new DistanceTraveled(hours, speed);
				
			do 
			{
					//Write the name to the file
				outputFile.println("At hour " + num + " you traveled " + (num * speed) + " miles.\n");
						
				System.out.println("At hour " + num + " you traveled " + (num * speed) + " miles.");
				num++;
				
			}while(num <= hours);
		System.out.println("The total distance you traveled is " + firstTrain.getDistance() + " miles.");
		
				//Write the name to the file
			outputFile.println("The total distance you traveled is " + firstTrain.getDistance() + " miles.");
				//Close the file
			outputFile.close();
				//Close keyboard
			keyboard.close();
			
			System.out.println("File has been written to and saved.");
	}
				
}
