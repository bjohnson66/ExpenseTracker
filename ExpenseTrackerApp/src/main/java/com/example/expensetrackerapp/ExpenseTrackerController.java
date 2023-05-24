package com.example.expensetrackerapp;

import javafx.application.Platform;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ExpenseTrackerController {
    @FXML
    private ComboBox enterprisePicker;

    @FXML
    private TableView<ExpenseEntry> enterpriseTable;

    ObservableList<String> enterpriseList;

    final ObservableList<ExpenseEntry> data = FXCollections.observableArrayList(
            new ExpenseEntry(
                    new SimpleStringProperty("5/23/23"),
                    new SimpleStringProperty("Example"),
                    new SimpleStringProperty("An example entry"),
                    new SimpleStringProperty("23.25"),
                    new SimpleStringProperty("Check"),
                    new SimpleStringProperty("Bedford Building Supply"),
                    new SimpleStringProperty("no"),
                    new SimpleStringProperty("no"),
                    new SimpleStringProperty("Checking Account"),
                    new SimpleStringProperty("Test test 321")
                    )
    );




    ////////////////////////
    ///       FILE       ///
    ////////////////////////
    @FXML
    protected void Quit() {
        Platform.exit();
        System.exit(1);
    }

    @FXML
    protected void New() {

    }

    @FXML
    protected void Open() {

    }

    ////////////////////////
    ///        HELP      ///
    ////////////////////////
    @FXML
    protected void About(){
        Alert messageBox = new Alert(Alert.AlertType.INFORMATION);
        messageBox.setTitle("About");
        messageBox.setContentText("Use this GUI to monitor the activity of the serve. The server" +
                "log tracks errors that the system encounters. The chart plots\n" +
                "user connections over the last 30 seconds");
        messageBox.show();

    }


    @FXML
    protected void addEnterprise(){
        while (true) {
            TextInputDialog inputDialog = new TextInputDialog();
            inputDialog.setTitle("Adding a new enterprise");
            inputDialog.setHeaderText("Enter the enterprise's name (must be unique):");
            inputDialog.setContentText("Name:");

            Optional<String> result = inputDialog.showAndWait();
            if (result.isPresent()) {
                String name = result.get();
                // Perform validation on the entered name
                if (!name.isEmpty() && !enterpriseList.contains(name)) {
                    enterpriseList.add(name);
                    return;
                }
            } else {
                // User clicked Cancel, exit the loop
                return;
            }
        }
    }

    @FXML
    protected void addExpense(){

    }

    @FXML
    public void initialize(){
        enterpriseList = enterprisePicker.getItems();
        enterpriseTable.setItems(data);
        enterpriseTable.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
    }




}