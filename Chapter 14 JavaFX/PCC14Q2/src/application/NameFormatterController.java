package application;
import java.text.DecimalFormat;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class NameFormatterController 
{

		//DecimalFormat
	DecimalFormat bender = new DecimalFormat("0.00");
	
		@FXML
	private Label firstNamePrompt;
	
		@FXML
	private TextField firstNameTextField;
	
		@FXML
	private Label middleNamePrompt;
		
		@FXML
	private TextField middleNameTextField;
		
		@FXML
	private Label lastNamePrompt;
			
		@FXML
	private TextField lastNameTextField;
		
		@FXML
	private Label titleNamePrompt;
			
		@FXML
	private TextField titleTextField;
		
		@FXML
	private Label outputLabel;
		
		@FXML
	private Button calculateButton1;
		
		@FXML
	private Button calculateButton2;
		
		@FXML
	private Button calculateButton3;
		
		//This method is called when the FXML file is loaded
	public void initialize()
	{
			
			//Preform any necesary initialization here
			
	}
	
		//Event listener for the convertButton
	public void calculateButtonListener1()
	{
			
			//Fields
		String first;
		String middle;
		String last;
		String title;
		
			//Get the wholesale from the TextField
		first = firstNameTextField.getText();
			
			//Get the markup from the TextField
		middle = middleNameTextField.getText();
		
			//Get the markup from the TextField
		last = lastNameTextField.getText();
		
			//Get the markup from the TextField
		title = titleTextField.getText();
			
			//Display the converted distance
		outputLabel.setText(title + " " + first + " " + middle + " " + last);
			
		}	
	
			//Event listener for the convertButton
	public void calculateButtonListener2()
	{
				
			//Fields
		String first;
		String middle;
		String last;
			
			//Get the wholesale from the TextField
		first = firstNameTextField.getText();
			
			//Get the markup from the TextField
		middle = middleNameTextField.getText();
		
			//Get the markup from the TextField
		last = lastNameTextField.getText();
			
			//Display the converted distance
		outputLabel.setText(first + " " + middle + " " + last);
	}
	
	public void calculateButtonListener3()
	{
				
			//Fields
		String first;
		String last;
			
			//Get the wholesale from the TextField
		first = firstNameTextField.getText();
		
			//Get the markup from the TextField
		last = lastNameTextField.getText();
			
			//Display the converted distance
		outputLabel.setText(first + " " + last);
	}
	
}