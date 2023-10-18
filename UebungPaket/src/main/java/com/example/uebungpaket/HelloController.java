package com.example.uebungpaket;

import javafx.beans.binding.Bindings;
import javafx.beans.binding.DoubleBinding;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.util.StringConverter;
import javafx.util.converter.DoubleStringConverter;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.Formatter;
import java.util.Locale;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Label lblHeight;

    @FXML
    private Label lblWidth;

    @FXML
    private Label lblDepth;

    @FXML
    private Label lblResult;

    @FXML
    private TextField tfHeight;

    @FXML
    private TextField tfWidth;

    @FXML
    private TextField tfDepth;

    @FXML
    private TextField tfResult;

    @FXML
    private Slider slHeight;

    @FXML
    private Slider slWidth;

    @FXML
    private Slider slDepth;

    @FXML
    private Button btnS;

    @FXML
    private Button btnM;

    @FXML
    private Button btnL;

    @FXML
    private Button btnXL;

    @FXML
    private ComboBox languages;

    @FXML
    private void auswahl(ActionEvent event) {
        int sprache = languages.getSelectionModel().getSelectedIndex();

        switch (sprache) {
            case 0:
                Main.setLocale(new Locale("de", "DE"));
                ResourceBundle.getBundle("Sprache", Main.getLocale());
                break;
            case 1:
                Main.setLocale(new Locale("en", "US"));
                ResourceBundle.getBundle("Sprache", Main.getLocale());
                break;
        }
        updateUI();
    }

    @FXML
    private void onBtnSClick()
    {
        tfHeight.setText("30");
        tfWidth.setText("30");
        tfDepth.setText("30");
    }

    @FXML
    private void onBtnMClick()
    {
        tfHeight.setText("40");
        tfWidth.setText("40");
        tfDepth.setText("40");
    }

    @FXML
    private void onBtnLClick()
    {
        tfHeight.setText("50");
        tfWidth.setText("50");
        tfDepth.setText("50");
    }

    @FXML
    private void onBtnXLClick()
    {
        tfHeight.setText("60");
        tfWidth.setText("60");
        tfDepth.setText("60");
    }

    private void updateUI()
    {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("Sprache",Main.getLocale());
        lblHeight.setText(resourceBundle.getString("lblHeight"));
        lblWidth.setText(resourceBundle.getString("lblWidth"));
        lblDepth.setText(resourceBundle.getString("lblDepth"));
        lblResult.setText(resourceBundle.getString("lblResult"));
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        languages.getItems().addAll("Deutsch","English");
        updateUI();

        DecimalFormat format = new DecimalFormat("##########.##");
        Bindings.bindBidirectional(this.tfHeight.textProperty(), this.slHeight.valueProperty(), format);
        Bindings.bindBidirectional(this.tfWidth.textProperty(), this.slWidth.valueProperty(), format);
        Bindings.bindBidirectional(this.tfDepth.textProperty(), this.slDepth.valueProperty(), format);

        DoubleBinding erg = slHeight.valueProperty().multiply(slDepth.valueProperty().multiply(slWidth.valueProperty()));
        tfResult.textProperty().bind(Bindings.format("%.2f",erg));
    }
}