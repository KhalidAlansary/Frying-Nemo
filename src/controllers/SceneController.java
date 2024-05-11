package controllers;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class SceneController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToMainScene(ActionEvent event, String message) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/resources/Main.fxml"));
        stage = Main.primaryStage; // **Get the Stage from Main class**
        scene = new Scene(root);
        stage.setScene(scene);
        Label messageLabel = (Label) root.lookup("#messageLabel");
        messageLabel.setVisible(true);
        messageLabel.setText(message);
        stage.show();
    }

    public void switchToNewTableScene(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/resources/newTable.fxml"));
        stage = Main.primaryStage; // **Get the Stage from Main class**
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToNewStaffMemberScene(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/resources/newStaffMember.fxml"));
        stage = Main.primaryStage; // **Get the Stage from Main class**
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToNewCustomerScene(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/resources/newCustomer.fxml"));
        stage = Main.primaryStage; // **Get the Stage from Main class**
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToMainDishScene(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/resources/newMainDish.fxml"));
        stage = Main.primaryStage; // **Get the Stage from Main class**
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToDessertScene(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/resources/newDessert.fxml"));
        stage = Main.primaryStage; // **Get the Stage from Main class**
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToNewOrderScene(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/resources/newOrder.fxml"));
        stage = Main.primaryStage; // **Get the Stage from Main class**
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToReserveScene(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/resources/Reserve.fxml"));
        stage = Main.primaryStage; // **Get the Stage from Main class**
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
