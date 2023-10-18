module com.example.uebungbank {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.uebungbank to javafx.fxml;
    exports com.example.uebungbank;
}