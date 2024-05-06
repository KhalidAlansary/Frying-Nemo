package controllers;

import entities.Customer;
import entities.MenuItem;
import entities.Restaurant;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class NewOrderController implements Initializable {
    @FXML
    ChoiceBox<Customer> customerChoiceBox;
    @FXML
    ListView<MenuItem> menuItemListView;

    public void addOrder(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        customerChoiceBox.setItems(FXCollections.observableArrayList(Restaurant.customers));

    }
}
