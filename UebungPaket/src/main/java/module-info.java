module com.example.uebungpaket {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.uebungpaket to javafx.fxml;
    exports com.example.uebungpaket;
}