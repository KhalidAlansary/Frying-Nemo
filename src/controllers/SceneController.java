package controllers;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToNewStaffMemberScene(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/resources/newStaffMember.fxml"));
        stage = Main.primaryStage; // **Get the Stage from Main class**
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToMainDishScene(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/resources/MainDish.fxml"));
        stage = Main.primaryStage; // **Get the Stage from Main class**
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
