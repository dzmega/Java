package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("dennis.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 500);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

        Person paul = new Person("Paul");
        paul.alterProperty().addListener((v, oldValue, newValue) -> {
            System.out.println("Ausgabe Property: " + paul.alterProperty());
            System.out.println("GetAlter Wert: " + paul.getAlter());
            System.out.println("Neuer Wert: " + newValue);
            System.out.println("Wert v / Property: " + v);
            System.out.println("Wert oldValue: " + oldValue);
        });
    }

    public static void main(String[] args) {
        launch();

    }
}