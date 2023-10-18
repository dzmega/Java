package com.example.multipescreens;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();


        //um ein weiteres Fenster direkt zu öffnen
        Stage stage1 = new Stage();
        stage1.setTitle("Gruppe 2");
        stage1.setScene(new Scene(new StackPane(new Label("Das Chatprojekt der Gruppe 2"))));
        stage1.show();

        //ändert die scene
        /*Label label = new Label("Hallo FIA11");
        StackPane root = new StackPane();
        root.getChildren().add(label);
        Scene s1 = new Scene(root,400,400);
        stage.setScene(s1);*/
    }

    public static void main(String[] args) {
        launch();
    }
}