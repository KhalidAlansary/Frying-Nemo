package controllers;

import entities.Restaurant;
import entities.Table;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

public class NewTableController {

    @FXML
    private Button createButton;

    @FXML
    private TextField capacityTextField;

    @FXML
    void addTable(ActionEvent event) {
        try {
            Table table = new Table(Integer.parseInt(capacityTextField.getText()));
            Restaurant.tables.add(table);
            SceneController sceneController = new SceneController();
            sceneController.switchToMainScene(event, "Table added successfully!");
        } catch (IllegalArgumentException | IOException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText(e.getMessage());
            alert.show();
        }

    }
}
