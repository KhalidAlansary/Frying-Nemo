import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        // load fxml
        try {
            Parent root = FXMLLoader.load(getClass().getResource("resources/Main.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (NullPointerException npe) {
            System.out.println("FXML file not found");
        } catch (IOException ioe) {
            System.out.println("Error loading FXML file");
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
