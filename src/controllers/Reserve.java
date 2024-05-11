package controllers;

import entities.Customer;
import entities.Restaurant;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import entities.Table;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Reserve implements Initializable {

    @FXML
    private Label Availability;

    @FXML
    private TextField emailTextField;

    @FXML
    private TextField firstNameTextField;

    @FXML
    private TextField lastNameTextField;

    @FXML
    private ChoiceBox<Table> tableChoiceBox;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tableChoiceBox.setItems(FXCollections.observableArrayList(Restaurant.tables));
    }

    @FXML
    void availability(ActionEvent event) {
        if(tableChoiceBox.getValue().getavailability()){
            Availability.setText("Reserved");
        }
        else {
            Availability.setText("Available");
        }
    }

    @FXML
    void submit(ActionEvent event) throws Exception {
        try {
            if(!tableChoiceBox.getValue().getavailability()){
            tableChoiceBox.getValue().reserveATable();

            Customer customer = new Customer(emailTextField.getText(), firstNameTextField.getText(),
                    lastNameTextField.getText());
            Restaurant.customers.add(customer);
            tableChoiceBox.getValue().reservingCustomer = customer;

            SceneController sceneController = new SceneController();
            sceneController.switchToMainScene(event, "Reservation successful");
            }
            else {
                SceneController sceneController = new SceneController();
                sceneController.switchToMainScene(event, "Reservation failed");
            }
        }

        catch (IllegalArgumentException | IOException iae) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText(iae.getMessage());
            alert.show();
        }
    }


}