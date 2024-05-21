package com.example.demo1aaaaaaaaaa;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class CircleChanger extends Application {
    public void start(Stage stage) {
        Circle circle = new Circle(100, Color.GREEN);
        TextField radiusInput = new TextField();
        Button changeButton = new Button("Change Radius");
        changeButton.setOnAction(e -> circle.setRadius(Double.parseDouble(radiusInput.getText())));

        VBox root = new VBox(10, radiusInput, changeButton, circle);
        Scene scene = new Scene(root, 300, 250);

        stage.setTitle("Circle Radius Changer");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
