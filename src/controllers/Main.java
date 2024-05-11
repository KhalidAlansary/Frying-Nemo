package controllers;

import entities.*;
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
        // Customers
        Restaurant.customers.add(new Customer("harry@hogwarts.edu", "Harry", "Potter"));
        Restaurant.customers.add(new Customer("ron@hogwarts.edu", "Ron", "Weasley"));
        Restaurant.customers.add(new Customer("hermione@hogwarts.edu", "Hermione", "Granger"));
        // Main Dishes
        Restaurant.mainDishes.add(new MainDish("Nemo", 10, 1, "Delecious clownfish", 3));
        Restaurant.mainDishes.add(new MainDish("Dori", 69, 1, "you may forget a lot", 3));
        Restaurant.mainDishes.add(new MainDish("Squid", 191, 1, "Say my name", 3));
        // Desserts
        Restaurant.desserts.add(new Dessert("Tiramisu", 10, 1, "Delecious clownfish", 3));
        Restaurant.desserts.add(new Dessert("Crème brûlée", 10, 1, "Delecious clownfish", 3));
        Restaurant.desserts.add(new Dessert("Molten Cake", 10, 1, "Delecious clownfish", 3));
        // Tables
        Restaurant.tables.add(new Table(7));
        Restaurant.tables.add(new Table(2));
        Restaurant.tables.add(new Table(4));

    }
}
