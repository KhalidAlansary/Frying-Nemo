package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import entities.MainDish;
import entities.Restaurant;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

public class NewMainDishController implements Initializable {

    @FXML
    private ChoiceBox<String> SpicinessLevelChoiceBox;
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
        SpicinessLevelChoiceBox.getItems().addAll(levels);
    }

    public void addMainDish(ActionEvent event) throws IOException {
        try {
            MainDish mainDish = new MainDish(itemNameTextField.getText(), Integer.parseInt(priceTextField.getText()),
                    Integer.parseInt(stockQuantityTextField.getText()), descriptionTextField.getText(), Integer.parseInt(SpicinessLevelChoiceBox.getValue()));
            Restaurant.mainDishes.add(mainDish);
            SceneController sceneController = new SceneController();
            sceneController.switchToMainScene(event, "Main dish added successfully!");
        } catch (IllegalArgumentException iae) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText(iae.getMessage());
            alert.show();
        }
    }
}
