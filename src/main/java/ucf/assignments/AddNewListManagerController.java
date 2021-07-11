/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Theodore Linardic
 */

package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AddNewListManagerController {

    @FXML
    private TextField newItemDueDateInput;

    @FXML
    private TextField newItemNameInput;


    public void addList(ActionEvent actionEvent) {
        // Call function 'addNewToDoList' with paramter newListNameInput in class ToDoListModel
        ToDoListManagerController.addItemToList(newItemNameInput.getText(),newItemDueDateInput.getText());

        Stage stage = (Stage) newItemDueDateInput.getScene().getWindow();

        stage.close();


    }

    public void cancelAddList(ActionEvent actionEvent) {
        // Close current window

        Stage stage = (Stage) newItemDueDateInput.getScene().getWindow();

        stage.close();

    }
}
