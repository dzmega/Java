package com.example.bank;

import javafx.beans.binding.Bindings;
import javafx.beans.binding.DoubleBinding;
import javafx.beans.binding.NumberBinding;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.text.NumberFormat;
import java.util.Formatter;
import java.util.ResourceBundle;

public class KontoController implements Initializable {

    NumberFormat formatter = NumberFormat.getCurrencyInstance(Main.getLocale());

    public static KontoController konController;

    public static KontoController getKonController()
    {
        return konController;
    }

    private DoubleProperty wert = new SimpleDoubleProperty(2000);
    private DoubleBinding zins;
    private DoubleProperty z;

    @FXML
    private Label lblView;

    @FXML
    private Label lblAktKonto;

    @FXML
    private Label lblGuthaben;

    @FXML
    private Label lblBetrag;

    @FXML
    private Label lblZinsen;

    @FXML
    private Button btnEinzahlung;

    @FXML
    private Button btnAuszahlung;

    @FXML
    private TextField tfEin;

    @FXML
    private TextField tfAus;

    @FXML
    private void onEinClick()
    {
        wert.setValue(wert.getValue() + Double.parseDouble(tfEin.getText()));

    }

    @FXML
    private void onAusClick()
    {
        wert.setValue(wert.getValue() - Double.parseDouble(tfAus.getText()));
    }

    public void updateUI() {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("KontoSprache", Main.getLocale());
        formatter = NumberFormat.getCurrencyInstance(Main.getLocale());
        lblView.setText(resourceBundle.getString("lblView"));
        lblAktKonto.setText(resourceBundle.getString("lblAktKonto"));
        lblGuthaben.setText(resourceBundle.getString("lblGuthaben"));
        btnEinzahlung.setText(resourceBundle.getString("btnEinzahlung"));
        btnAuszahlung.setText(resourceBundle.getString("btnAuszahlung"));
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        updateUI();
        konController = this;

        zins = wert.multiply(0.01);
        lblBetrag.textProperty().bindBidirectional(wert, formatter);
        lblZinsen.textProperty().bind(Bindings.createStringBinding(() -> formatter.format(zins.doubleValue()), zins));
    }
}
