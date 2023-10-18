module com.example.multipescreens {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.multipescreens to javafx.fxml;
    exports com.example.multipescreens;
}