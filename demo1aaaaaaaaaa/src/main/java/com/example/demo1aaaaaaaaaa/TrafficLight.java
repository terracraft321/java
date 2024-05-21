package com.example.demo1aaaaaaaaaa;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class TrafficLight extends Application {
    Circle redCircle;
    Circle yellowCircle;
    Circle greenCircle;

    public void start(Stage stage) {
        ToggleGroup toggleGroup = new ToggleGroup();

        redCircle = createCircle(Color.RED);
        RadioButton redRadioButton = createRadioButton("Red", toggleGroup);

        yellowCircle = createCircle(Color.YELLOW);
        RadioButton yellowRadioButton = createRadioButton("Yellow", toggleGroup);

        greenCircle = createCircle(Color.GREEN);
        RadioButton greenRadioButton = createRadioButton("Green", toggleGroup);

        HBox radioButtons = createHBox(redRadioButton, yellowRadioButton, greenRadioButton);
        VBox circles = createVBox(redCircle, yellowCircle, greenCircle);

        HBox root = createHBox(radioButtons, circles);
        root.setPadding(new Insets(20));
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.setTitle("Traffic Light");
        stage.show();
    }

    Circle createCircle(Color color) {
        Circle circle = new Circle(100);
        circle.setFill(color);
        return circle;
    }

    RadioButton createRadioButton(String text, ToggleGroup toggleGroup) {
        RadioButton radioButton = new RadioButton(text);
        radioButton.setToggleGroup(toggleGroup);
        radioButton.setOnAction(event -> handleRadioButtonSelection(radioButton));
        return radioButton;
    }

    void handleRadioButtonSelection(RadioButton radioButton) {
        redCircle.setFill(radioButton.getText().equals("Red") ? Color.RED : Color.GRAY);
        yellowCircle.setFill(radioButton.getText().equals("Yellow") ? Color.YELLOW : Color.GRAY);
        greenCircle.setFill(radioButton.getText().equals("Green") ? Color.GREEN : Color.GRAY);
    }

    HBox createHBox(javafx.scene.Node... nodes) {
        return new HBox(20, nodes);
    }

    VBox createVBox(javafx.scene.Node... nodes) {
        return new VBox(20, nodes);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
