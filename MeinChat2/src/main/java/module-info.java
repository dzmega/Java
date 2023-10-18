module com.example.meinchat2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens Server to javafx.fxml;
    exports Server;
    exports Chat;
    opens Chat to javafx.fxml;
}