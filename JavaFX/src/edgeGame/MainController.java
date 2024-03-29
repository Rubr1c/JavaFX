package edgeGame;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainController implements Initializable {
	
	@FXML
    private Button levelOneButton;

    @FXML
    private Button level2Button;

    @FXML
    private Button level3Button;

    @FXML
    private Button level4Button;

    @FXML
    private Button level5Button;
    
    private Stage stage;
    private Scene scene;
    private Parent root;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Disable Level 2-5 buttons on startup
        level2Button.setDisable(true);
        level3Button.setDisable(true);
        level4Button.setDisable(true);
        level5Button.setDisable(true);
    }
	public void levelOneAction(ActionEvent event) throws AWTException {
		try {
	        root = FXMLLoader.load(getClass().getResource("level1.fxml"));
	        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	        scene = new Scene(root);
	        stage.setScene(scene);
	        stage.show();
	        Robot robot = new Robot();

            int targetX = 50;
            int targetY = 410;
            
            robot.mouseMove(targetX, targetY);
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	
	
}
