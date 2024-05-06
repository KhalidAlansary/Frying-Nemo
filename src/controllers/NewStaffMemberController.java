package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import entities.Job;
import entities.Restaurant;
import entities.StaffMember;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class NewStaffMemberController implements Initializable {

    @FXML
    TextField emailTextField;
    @FXML
    TextField firstNameTextField;
    @FXML
    TextField lastNameTextField;
    @FXML
    ChoiceBox<Job> jobChoiceBox;
    @FXML
    TextField salaryTextField;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        jobChoiceBox.getItems().addAll(Job.values());
    }

    public void addStaffMember(ActionEvent event) throws IOException {
        // TODO: fix job
        try {
        StaffMember staffMember = new StaffMember(emailTextField.getText(), firstNameTextField.getText(),
                lastNameTextField.getText(), Job.CHEF, Integer.parseInt(salaryTextField.getText()));
        Restaurant.staffMembers.add(staffMember);
        SceneController sceneController = new SceneController();
        sceneController.switchToMainScene(event);
        } catch (IllegalArgumentException iae) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText(iae.getMessage());
            alert.show();
        }
    }
}
