package fxTesting;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class Controller {
	
	@FXML
	private Button addToList;
	@FXML
	private TextField textField;
	@FXML
	private ListView<String> listField;
	@FXML
	private Button editButton;
	
	public ObservableList<Integer> index = listField.getSelectionModel().getSelectedIndices();
	
	
	public void buttonPress(ActionEvent event) {
		String x = textField.getText();
		listField.getItems().add(x);
	}
	
	
	public void editClicked(ActionEvent event) {
		System.out.println(index);
	}
	
	
	
	
}
