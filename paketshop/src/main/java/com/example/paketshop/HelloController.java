package com.example.paketshop;

import javafx.beans.binding.Binding;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.DoubleBinding;
import javafx.beans.property.FloatProperty;
import javafx.beans.property.SimpleFloatProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.stage.StageStyle;
import javafx.util.StringConverter;
import javafx.util.converter.DoubleStringConverter;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Label lblHöhe;

    @FXML
    private Label lblBreite;

    @FXML
    private Label lblTiefe;

    @FXML
    private Label lblErgebnis;

    @FXML
    private TextField txtHöhe;

    @FXML
    private TextField txtBreite;

    @FXML
    private TextField txtTiefe;

    @FXML
    private TextField txtErgebnis;

    @FXML
    private Slider sliderHöhe;

    @FXML
    private Slider sliderBreite;

    @FXML
    private Slider sliderTiefe;

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
    private void onPaketS()
    {
        txtHöhe.setText("30");
        txtBreite.setText("30");
        txtTiefe.setText("30");
    }

    @FXML
    private void onPaketM()
    {
        txtHöhe.setText("40");
        txtBreite.setText("40");
        txtTiefe.setText("40");
    }

    @FXML
    private void onPaketL()
    {
        txtHöhe.setText("50");
        txtBreite.setText("50");
        txtTiefe.setText("50");
    }

    @FXML
    private void onPaketXL()
    {
        txtHöhe.setText("60");
        txtBreite.setText("60");
        txtTiefe.setText("60");
        changeScene();
    }

    @FXML
    private void auswahl()
    {
        int sprache = languages.getSelectionModel().getSelectedIndex();
        switch (sprache){
            case 0:
                Main.setLocale(new Locale("Deutsch", "DE"));
                ResourceBundle.getBundle("Sprache", Main.getLocale());
                break;
            case 1:
                Main.setLocale(new Locale("English", "US"));
                ResourceBundle.getBundle("Sprache", Main.getLocale());
                break;
        }
        updateUI();
    }

    private void changeScene()
    {
        HelloApplication.change();
        showError();
    }

    private static void showError()
    {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.initStyle(StageStyle.UTILITY);
        alert.setTitle("Error");
        alert.setHeaderText("Header");
        alert.setContentText("Test");
        alert.showAndWait();
    }

    private void updateUI()
    {
        ResourceBundle resource = ResourceBundle.getBundle("Sprache",Main.getLocale());
        lblBreite.setText(resource.getString("lblBreite"));
        lblHöhe.setText(resource.getString("lblHöhe"));
        lblTiefe.setText(resource.getString("lblTiefe"));
        lblErgebnis.setText(resource.getString("lblErgebnis"));
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        StringConverter<? extends Number> converter = new DoubleStringConverter();
        Bindings.bindBidirectional(this.txtHöhe.textProperty(), this.sliderHöhe.valueProperty(), (StringConverter<Number>) converter);
        Bindings.bindBidirectional(this.txtBreite.textProperty(), this.sliderBreite.valueProperty(), (StringConverter<Number>) converter);
        Bindings.bindBidirectional(this.txtTiefe.textProperty(), this.sliderTiefe.valueProperty(), (StringConverter<Number>) converter);

        DoubleBinding volumen = sliderHöhe.valueProperty().multiply(sliderBreite.valueProperty().multiply(sliderTiefe.valueProperty()));
        txtErgebnis.textProperty().bind(Bindings.format("%.2f", volumen));

        languages.getItems().addAll("Deutsch","English");
    }
}