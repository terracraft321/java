package com.example.demo1aaaaaaaaaa;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class TextFieldExample extends Application {
    public void start(Stage stage) {
        TextField TextField1 = new TextField("What is your name");
        Label label1 = new Label("Name");
        HBox box = new HBox(10);
        box.setPadding(new Insets(10, 5, 5, 10));
        box.getChildren().addAll(label1, TextField1);
        Scene scene = new Scene(box, 500, 500, Color.RED);
        stage.setTitle("Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String args[]) {
        launch(args);
    }
}
