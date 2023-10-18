package com.example.uebungbank;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    public static Stage st;
    public static Scene sc;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
        st = stage;

        FXMLLoader fxmlLoader2 = new FXMLLoader(HelloApplication.class.getResource("konto-view.fxml"));
        sc = new Scene(fxmlLoader2.load(), 600, 400);
    }

    public static void change()
    {
        st.setScene(sc);
    }

    public static void main(String[] args) {
        launch();
    }
}