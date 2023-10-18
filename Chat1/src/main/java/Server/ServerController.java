package Server;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class ServerController {

    @FXML private ComboBox cbHost;

    @FXML private Button btnConnect;

    @FXML private ListView listChat;

    @FXML private void connect()
    {
        System.out.println("Connected");
    }
}