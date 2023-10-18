package com.example.paketshop;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Locale;

public class HelloApplication extends Application {

    static Stage st;
    static Scene sc;
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 700, 400);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
        st = stage;

        FXMLLoader fxmlLoader2 = new FXMLLoader(HelloApplication.class.getResource("2nd-view.fxml"));
        Scene scene2 = new Scene(fxmlLoader2.load(), 600,400);
        sc = scene2;
    }

    public static void change()
    {
        st.setScene(sc);
    }

    public static void main(String[] args) {
        launch();
    }
}