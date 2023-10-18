package Server;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;

public class ServerController {
    @FXML private Button btnStart;
    @FXML private void start() throws IOException {
        new Server(5555);
    }
}