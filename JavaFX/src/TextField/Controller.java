package TextField;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
	
	@FXML
	private Label myLabel;
	@FXML
	private TextField myTextField;
	@FXML
	private Button myBurron;
	
	int age;
	
	public void submit(ActionEvent event) {
		
		try {
			age = Integer.parseInt(myTextField.getText());
			System.out.println(age);
			
			if (age >= 18) {
				myLabel.setText("you are now signed up");
			} else {
				myLabel.setText("you are too young");
			}
		} 
		catch (NumberFormatException e){
			myLabel.setText("Enter only numbers plz");
		}
		catch(Exception e) {
			myLabel.setText("Error");
		}
	}
}
