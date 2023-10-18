package com.example.uebungbank;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.stage.StageStyle;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    int count = 0;

    @FXML
    private Label lblWelcome;

    @FXML
    private Label lblUsername;

    @FXML
    private Label lblPassword;

    @FXML
    private ComboBox languages;

    @FXML
    private TextField tfUsername;

    @FXML
    private TextField tfPassword;

    @FXML
    private Button btnLogin;

    @FXML
    private void onLoginClick()
    {
        if(tfPassword.getText().equals("Pass123"))
        {
            HelloApplication.change();
        } else if (count < 3) {
            count++;
        }
        else {
            Alert alert = new Alert(Alert.AlertType.ERROR, ResourceBundle.getBundle("SpracheHello",Main.getLocale()).getString("fail"));
            alert.initStyle(StageStyle.UTILITY);
            alert.setTitle("ERROR");
            alert.setHeaderText("ERROR");
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
                ResourceBundle.getBundle("SpracheHello",Main.getLocale());
                break;
            case 1:
                Main.setLocale(new Locale("en","US"));
                ResourceBundle.getBundle("SpracheHello",Main.getLocale());
                break;
        }
        updateUI();
        KontoController kontoController = KontoController.getKontoController();
        kontoController.updateUI();
    }

    private void updateUI()
    {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("SpracheHello",Main.getLocale());
        lblWelcome.setText(resourceBundle.getString("lblWelcome"));
        lblUsername.setText(resourceBundle.getString("lblUsername"));
        lblPassword.setText(resourceBundle.getString("lblPassword"));
        btnLogin.setText(resourceBundle.getString("btnLogin"));
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        languages.getItems().addAll("Deutsch","English");
        updateUI();
    }
}