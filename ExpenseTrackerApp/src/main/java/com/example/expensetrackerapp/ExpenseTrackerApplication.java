package com.example.expensetrackerapp;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * The ExpenseTrackerApplication class extends JavaFX's Application class and kickstarts the launching of
 * the JavaFX application.
 */
public class ExpenseTrackerApplication extends Application {

    /**
     * Overrides the abstract method of Application, and is called by the JFX runtime environment to use FXMLLoader
     * to load the Parent before setting up the primary scene (see javadoc comment on this class's main method for an
     * investigation of what specifically calls this method.).
     * @param stage the stage that the scene will be placed on
     * @throws IOException can be thrown if the FXML loader fails
     */
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ExpenseTrackerApplication.class.getResource("ExpenseTracker.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("ExpenseTracker");
        stage.setOnCloseRequest(event -> Platform.exit());
        stage.setScene(scene);
        stage.show();
    }

    /**
     * The main method will simply kickstart the process of launching the application
     * @param args command line arguments
     */
    public static void main(String[] args) {
        launch();
    }
}