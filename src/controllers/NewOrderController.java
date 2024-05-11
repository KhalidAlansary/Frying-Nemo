package controllers;

import entities.*;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class NewOrderController implements Initializable {
    @FXML
    ChoiceBox<Customer> customerChoiceBox;
    @FXML
    ChoiceBox<MainDish> mainDishChoiceBox;
    @FXML
    ChoiceBox<Dessert> dessertChoiceBox ;
    @FXML
    private Label total;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        customerChoiceBox.setItems(FXCollections.observableArrayList(Restaurant.customers));
        mainDishChoiceBox.setItems(FXCollections.observableArrayList(Restaurant.mainDishes));
        dessertChoiceBox.setItems(FXCollections.observableArrayList(Restaurant.desserts));
    }

    @FXML
    void getTotal(ActionEvent event) {
        int Total = 0;
        Total+=mainDishChoiceBox.getValue().getPrice();
        Total+=dessertChoiceBox.getValue().getPrice();
        total.setText(String.valueOf(Total));
    }

    @FXML
    void makeOrder(ActionEvent event) throws IOException {
        SceneController sceneController = new SceneController();
        sceneController.switchToMainScene(event, "Order made successfully");
    }
}
