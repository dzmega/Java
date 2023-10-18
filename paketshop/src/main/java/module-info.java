module com.example.paketshop {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.paketshop to javafx.fxml;
    exports com.example.paketshop;
}