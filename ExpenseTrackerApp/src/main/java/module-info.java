module com.example.expensetrackerapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.expensetrackerapp to javafx.fxml;
    exports com.example.expensetrackerapp;
}