package SanjiVsZoro;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controller {

    @FXML
    private AnchorPane scenePane;
    Stage stage;
    Scene scene;
    
    public void sanjiPressed(ActionEvent event) throws Exception{

        Alert alert = new Alert(AlertType.WARNING);
        alert.setTitle("Trios Full");
        alert.setHeaderText(null);
        Image image = new Image(getClass().getResource("c9303994-64ee-492f-8df8-25067c11c833.jpg").toString());
        ImageView imageView = new ImageView(image);
        alert.setGraphic(imageView);

        if (alert.showAndWait().get() == ButtonType.OK) {
            stage = (Stage) scenePane.getScene().getWindow();
            System.out.println("You logged out");
            
        }
    }
    public void zoroPressed(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("zoroScene.fxml"));
        Parent root = loader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
