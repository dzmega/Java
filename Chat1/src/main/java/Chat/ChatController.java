package Chat;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class ChatController implements Initializable {
    @FXML private TextField tfUsername;

    @FXML private ComboBox cbHost;

    @FXML private Button btnConnect;

    @FXML private ListView listChat;

    @FXML private void connect()
    {
        System.out.println("Connected");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        cbHost.getItems().add("Localhost");
    }
}
