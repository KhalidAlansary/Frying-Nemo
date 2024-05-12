package controllers;

import entities.Customer;
import entities.Restaurant;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

public class NewCustomerController {

    @FXML
    private Button createButton;

    @FXML
    private TextField emailTextField;

    @FXML
    private TextField firstNameTextField;

    @FXML
    private TextField lastNameTextField;

    @FXML
    void addCustomer(ActionEvent event) {
        try {
            Customer customer  = new Customer(emailTextField.getText(), firstNameTextField.getText(),
                    lastNameTextField.getText());
            Restaurant.customers.add(customer);
            SceneController sceneController = new SceneController();
            sceneController.switchToMainScene(event, "Customer added successfully!");
        } catch (IllegalArgumentException | IOException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText(e.getMessage());
            alert.show();
        }
    }

}
