package com.example.uebungbank;

import javafx.beans.binding.Bindings;
import javafx.beans.binding.DoubleBinding;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.text.NumberFormat;
import java.util.ResourceBundle;

public class KontoController implements Initializable {

    private static KontoController kontoController;

    private DoubleProperty stand;
    private DoubleBinding zinsen;

    NumberFormat formatter;

    public static KontoController getKontoController() {
        return kontoController;
    }

    @FXML
    private Label lblView;

    @FXML
    private Label lblAkt;

    @FXML
    private Label lblGut;

    @FXML
    private Label lblStand;

    @FXML
    private Label lblZinsen;

    @FXML
    private Button btnEin;

    @FXML
    private Button btnAus;

    @FXML
    private TextField tfEin;

    @FXML
    private TextField tfAus;

    @FXML
    private void onEinClick()
    {
        stand.setValue((stand.getValue()) + Double.parseDouble(tfEin.getText()));
    }

    @FXML
    private void onAusClick()
    {
        stand.setValue((stand.getValue()) - Double.parseDouble(tfAus.getText()));
    }

    public void updateUI()
    {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("SpracheKonto",Main.getLocale());
        lblView.setText(resourceBundle.getString("lblView"));
        lblAkt.setText(resourceBundle.getString("lblAkt"));
        lblGut.setText(resourceBundle.getString("lblGut"));
        btnEin.setText(resourceBundle.getString("btnEin"));
        btnAus.setText(resourceBundle.getString("btnAus"));
        format();
    }

    public void format()
    {
        formatter = NumberFormat.getCurrencyInstance(Main.getLocale());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        format();
        kontoController = this;
        stand = new SimpleDoubleProperty(2000);
        zinsen = stand.multiply(0.01);

        lblStand.textProperty().bind(Bindings.createStringBinding(() -> formatter.format(stand.doubleValue()), stand));
        lblZinsen.textProperty().bind(Bindings.createStringBinding(() -> formatter.format(zinsen.doubleValue()), zinsen));
    }
}
