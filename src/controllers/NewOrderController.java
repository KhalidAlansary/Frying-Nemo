package controllers;

import entities.*;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class NewOrderController implements Initializable {
    @FXML
    ChoiceBox<Customer> customerChoiceBox;
    @FXML
    ChoiceBox<MainDish> mainDishChoiceBox;
    @FXML
    ChoiceBox<Dessert> dessertChoiceBox;
    @FXML
    private Label total;
    @FXML
    private Spinner<Integer> dessertSpinner;
    @FXML
    private Spinner<Integer> mainDishSpinner;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        customerChoiceBox.setItems(FXCollections.observableArrayList(Restaurant.customers));
        mainDishChoiceBox.setItems(FXCollections.observableArrayList(Restaurant.mainDishes));
        dessertChoiceBox.setItems(FXCollections.observableArrayList(Restaurant.desserts));
        SpinnerValueFactory<Integer> valueFactory1=
                new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10);
        valueFactory1.setValue(1);
        dessertSpinner.setValueFactory(valueFactory1);
        SpinnerValueFactory<Integer> valueFactory2 =
                new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10);
        valueFactory2.setValue(1);
        mainDishSpinner.setValueFactory(valueFactory2);
    }



    @FXML
    void getTotal(ActionEvent event) {
        int Total = 0;
        int mainDishQuantity = mainDishSpinner.getValue();
        int dessertQuantity = dessertSpinner.getValue();
        Total += mainDishChoiceBox.getValue().getPrice() * mainDishQuantity;
        Total += dessertChoiceBox.getValue().getPrice() * dessertQuantity;
        total.setText(String.valueOf(Total));
    }

    @FXML
    void makeOrder(ActionEvent event) throws IOException {
        SceneController sceneController = new SceneController();
        sceneController.switchToMainScene(event, "Order made successfully");
    }
}
