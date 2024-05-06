package controllers;

import entities.Customer;
import entities.Restaurant;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.Image;

public class Main extends Application {
    public static Stage primaryStage; // **Declare static Stage**

    @Override
    public void start(Stage primaryStage) throws Exception {
        initialize();

        Main.primaryStage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("/resources/Main.fxml"));
        primaryStage.setTitle("Frying Nemo Restaurant");
        Image image = new Image("/resources/nemo.png");
        primaryStage.getIcons().add(image);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public static void initialize() {
        Restaurant.customers.add(new Customer("harry@hogwarts.edu", "Harry", "Potter"));
        Restaurant.customers.add(new Customer("ron@hogwarts.edu", "Ron", "Weasley"));
        Restaurant.customers.add(new Customer("hermione@hogwarts.edu", "Hermione", "Granger"));
    }
}
