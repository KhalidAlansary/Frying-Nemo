package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import entities.Dessert;
import entities.Restaurant;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

public class NewDessertController implements Initializable {

    @FXML
    private ChoiceBox<String> sweetnessLevelChoiceBox;
    @FXML
    TextField itemNameTextField;
    @FXML
    TextField descriptionTextField;
    @FXML
    TextField priceTextField;
    @FXML
    Button imageUploadButton;
    @FXML
    TextField stockQuantityTextField;

    private String[] levels = {"0", "1", "2", "3"};

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        sweetnessLevelChoiceBox.getItems().addAll(levels);
    }

    public void addDessert(ActionEvent event) throws IOException {
        try {
            Dessert dessert = new Dessert(itemNameTextField.getText(), Integer.parseInt(priceTextField.getText()),
                    Integer.parseInt(stockQuantityTextField.getText()), descriptionTextField.getText(), Integer.parseInt(sweetnessLevelChoiceBox.getValue()), null);
            Restaurant.desserts.add(dessert);
            SceneController sceneController = new SceneController();
            sceneController.switchToMainScene(event, "Dessert added successfully!");
        } catch (IllegalArgumentException iae) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText(iae.getMessage());
            alert.show();
        }
    }
}
