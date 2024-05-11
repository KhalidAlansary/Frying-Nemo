package controllers;

import java.io.IOException;

import javafx.event.ActionEvent;

public class MainController {

    public void switchToNewTableScene(ActionEvent event) throws IOException {
        SceneController sceneController = new SceneController();
        sceneController.switchToNewTableScene(event);
    }

    public void switchToNewStaffMemberScene(ActionEvent event) throws IOException {
        SceneController sceneController = new SceneController();
        sceneController.switchToNewStaffMemberScene(event);
    }

    public void switchToNewCustomerScene(ActionEvent event) throws IOException {
        SceneController sceneController = new SceneController();
        sceneController.switchToNewCustomerScene(event);
    }

    public void switchToNewMainDishScene(ActionEvent event) throws IOException {
        SceneController sceneController = new SceneController();
        sceneController.switchToMainDishScene(event);
    }

    public void switchToNewDessertScene(ActionEvent event) throws IOException {
        SceneController sceneController = new SceneController();
        sceneController.switchToDessertScene(event);
    }

    public void switchToNewOrderScene(ActionEvent event) throws IOException {
        SceneController sceneController = new SceneController();
        sceneController.switchToNewOrderScene(event);
    }

    public void switchToReserveScene(ActionEvent event) throws IOException {
        SceneController sceneController = new SceneController();
        sceneController.switchToReserveScene(event);
    }


}
