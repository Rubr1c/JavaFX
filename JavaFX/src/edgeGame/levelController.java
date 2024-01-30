package edgeGame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Bounds;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;

public class levelController {
	
	private Stage stage;
    private Scene scene;
    private Parent root;
    
    @FXML
    private Button levelOneButton;
    
    
	@FXML
	private Label youLost1;
	
	@FXML
	private Button tryAgainButton1;
	
	@FXML
	private Button homeButton1;

	
	public void endGame1(MouseEvent event) throws InterruptedException {
		youLost1.setOpacity(1.0);
		tryAgainButton1.setOpacity(1.0);
		homeButton1.setOpacity(1.0);
	}
	
	public void tryAgain1(ActionEvent event) throws IOException, AWTException {
		
        Robot robot = new Robot();

        int targetX = 50;
        int targetY = 410;
        
        robot.mouseMove(targetX, targetY);
        
		root = FXMLLoader.load(getClass().getResource("level1.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
	}
	
	public void goHome1(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("Homescreen.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        String css = this.getClass().getResource("Main.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.show();
	}
}