package application;
import java.text.DecimalFormat;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class RetailPriceCalculatorController 
{

		//DecimalFormat
	DecimalFormat bender = new DecimalFormat("0.00");
	
		@FXML
	private Label wholesalePrompt;
	
		@FXML
	private TextField wholesaleTextField;
	
		@FXML
	private Label markupPrompt;
		
		@FXML
	private TextField markupTextField;
		
		@FXML
	private Label outputLabel;
		
		@FXML
	private Button calculateButton;
		
		//This method is called when the FXML file is loaded
	public void initialize()
	{
			
			//Preform any necesary initialization here
			
	}
	
		//Event listener for the convertButton
	public void calculateButtonListener()
	{
			
			//Fields
		double price;
		
			//Get the wholesale from the TextField
		String wholesale = wholesaleTextField.getText();
			
			//Get the markup from the TextField
		String markup = markupTextField.getText();
		
			//Convert kilometers to miles
		price = (Double.parseDouble(wholesale) * (Double.parseDouble(markup) / 100) + Double.parseDouble(wholesale));
			
			//Display the converted distance
		outputLabel.setText("The price is $" + bender.format(price));
			
		}
		
		
}
