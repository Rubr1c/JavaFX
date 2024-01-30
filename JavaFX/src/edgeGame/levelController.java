package edgeGame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Bounds;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;

import java.awt.AWTException;
import java.awt.Robot;

public class levelController {
	

	
	@FXML
	private Label youLost1;

	
	public void endGame1(MouseEvent event) throws InterruptedException {
		youLost1.setOpacity(1.0);
	}
}