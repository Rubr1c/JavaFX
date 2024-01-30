package edgeGame;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Homescreen.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            String css = this.getClass().getResource("Main.css").toExternalForm();
            scene.getStylesheets().add(css);
            primaryStage.setMinWidth(1920);
            primaryStage.setMinHeight(1080);
            primaryStage.setMaxWidth(1920);
            primaryStage.setMaxHeight(1080);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
