package controllers;

import java.io.IOException;

import javafx.event.ActionEvent;

public class MainController {
    public void switchToNewStaffMemberScene(ActionEvent event) throws IOException {
        SceneController sceneController = new SceneController();
        sceneController.switchToNewStaffMemberScene(event);
    }
}
