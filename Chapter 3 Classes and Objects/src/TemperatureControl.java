import java.util.Scanner;
public class TemperatureControl {

	public static void main(String[] args) {
		
		double testF;
		double testC;
		double testK;
		
		//Create a Scanner object for keyboard input.
			Scanner keyboard = new Scanner(System.in);
		
		//Get the temperature.
			System.out.print("Enter the Temperature in Fahrenheit: ");
			testF = keyboard.nextDouble();
			
			//Calculations
			testC = (testF - 32.0) * 5.0 / 9.0;
			testK = (testF + 459.67) * 5/9;	
			
		//Creating an instance
			Temperature tempNow = new Temperature(testF, testC, testK);
			
		//Output
			System.out.println();
			System.out.println("Here is the temperature in Fahrenheit: " + tempNow.getFahrenheit());
			System.out.println("Here is the temperature in Celsius: " + tempNow.getCelsius());
			System.out.println("Here is the temperature in Kelvin: " + tempNow.getKelvin());
	}

}
