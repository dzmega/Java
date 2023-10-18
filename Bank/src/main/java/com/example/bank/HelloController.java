package com.example.bank;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import javafx.stage.StageStyle;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    private int count = 0;

    @FXML
    private Label lblWelcome;

    @FXML
    private Label lblUsername;

    @FXML
    private Label lblPassword;

    @FXML
    private TextField tfUsername;

    @FXML
    private TextField tfPassword;

    @FXML
    private ComboBox languages;

    @FXML
    private Button btnLogin;

    @FXML
    private void onLoginClick()
    {
        if(tfPassword.getText().equals("nischer"))
        {
            HelloApplication.changeScene();
        } else if (count < 3) {
            count++;
        }
        else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.initStyle(StageStyle.UTILITY);
            alert.setTitle("Error");
            alert.setHeaderText("Error");
            alert.setContentText("Maximale Anzahl an Versuchen erreicht");
            alert.showAndWait();
        }
    }

    @FXML
    private void auswahl(ActionEvent event)
    {
        int sprache = languages.getSelectionModel().getSelectedIndex();
        switch (sprache)
        {
            case 0:
                Main.setLocale(new Locale("de","DE"));
                ResourceBundle.getBundle("HelloSprache",Main.getLocale());
                break;
            case 1:
                Main.setLocale(new Locale("en","UK"));
                ResourceBundle.getBundle("HelloSprache",Main.getLocale());
                break;
        }
        updateUI();
        KontoController kontoController = KontoController.getKonController();
        kontoController.updateUI();
    }

    private void updateUI()
    {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("HelloSprache",Main.getLocale());
        lblUsername.setText(resourceBundle.getString("lblUsername"));
        lblPassword.setText((resourceBundle.getString("lblPassword")));
        btnLogin.setText((resourceBundle.getString("btnLogin")));
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        languages.getItems().addAll("Deutsch","English");
        updateUI();
    }
}