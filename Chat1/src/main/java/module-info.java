module com.example.chat1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens Server to javafx.fxml;
    exports Server;
    opens Chat to javafx.fxml;
    exports Chat;
}