import java.util.Scanner;

public class HighestLowest {

	 public static void main(String[] args)
	 {
		 
		 	//Variables
		 int num;
		 int max = 0;
		 int min = 0;
		 
		 	//Scanner
		 Scanner keyboard = new Scanner(System.in);
		 
		 	//Ask the user for the numbers
		 System.out.println("This program will calculate a series of integers you will enter.\n");
		 System.out.println("Then the program will determin which number is the highest and lowest.\n");
		 System.out.println("Enter -99 when you have completed the series of numbers you enter.\n");
		 num = keyboard.nextInt();
		 
		 while(num != -99)
	        {
	            if (num > max)
	            {
	                max = num;
	            }
	            
	            else if (num < min)
	            {
	                min = num;
	            }
	            
	            else if (max == -99) 
	            {
	                max = num;
	            }
	            
	            else if (min == -99)
	            {
	                min = num;
	            }
	            
	            else
	            {
	                System.out.print("Enter another integer to add. Enter -99 when you are done. \n");
	                num = keyboard.nextInt();
	            }
	        }
		 System.out.println("The highest number you have entered was " + max + ".\n");
		 System.out.println("The lowest number you have entered was " + min + ".");
		 keyboard.close();
		 
	 }
	
}
