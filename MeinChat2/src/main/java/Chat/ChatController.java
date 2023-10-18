package Chat;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ChatController implements Initializable {
   ObservableList<String> chat;
   Client client;
   @FXML private TextField tfUsername;
   @FXML private Button btnConnect;
   @FXML private TextField tfMessage;
   @FXML private Button btnSend;
   @FXML private ListView listChat;
   @FXML private void send()
   {
      client.sendMessage(tfMessage.getText());
   }
   @FXML private void connect() throws IOException {
      client = new Client(this, tfUsername.getText());
      System.out.println(tfUsername.getText() + " hat sich verbunden");
   }

   public void update(String message) {
      chat.add(message);
   }

   @Override
   public void initialize(URL url, ResourceBundle resourceBundle) {
      chat = FXCollections.observableArrayList();
      listChat.setItems(chat);
   }
}