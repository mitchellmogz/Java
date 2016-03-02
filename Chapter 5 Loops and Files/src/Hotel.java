import java.io.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Hotel
{

	public static void main(String[] args) throws IOException
	{
				//Variables
			int occupido = 0;
			int totalOccupido = 0;
			int rooms = 0;
			int totalRooms = 0;
			int floors;
			double occupidoRate;
			
				//Scanner Object
			Scanner keyboard = new Scanner(System.in);
			
				//Decimal Format
			DecimalFormat formatter = new DecimalFormat("0.00");
				
				//Ask for the number of Floors
			System.out.println("How many floors are in your hotel?\n");
			floors = keyboard.nextInt();
				
			while (floors <= 0)
			{
				System.out.println("Please enter a valid number of floors in your hotel.\n");
				floors = keyboard.nextInt();
			}
				
			while (floors > 0)
			{
				
				System.out.println("How many rooms are on floor " + floors + "?");
				rooms = keyboard.nextInt();
				
				while (rooms < 10)
				{
					System.out.println("Please enter a numb number greater than 10");
					rooms = keyboard.nextInt();
				}
				
				System.out.println("How many rooms are occupied on floor " + floors + "?");
				occupido = keyboard.nextInt();
				
				floors--;
				
				totalRooms += rooms;
				totalOccupido += occupido;
				
				
				
			}
			
			occupidoRate = totalOccupido /(double) totalRooms; 
			
			System.out.println("There are a total of " + totalRooms + " rooms in your hotel.");
			System.out.println("There are a total of " + totalOccupido + " occupied rooms in your hotel.");
			System.out.println("There for the Occupancy Rate is %" + occupidoRate + ".");
			
			
			
				//Close keyboard
			keyboard.close();
	}
				
}
