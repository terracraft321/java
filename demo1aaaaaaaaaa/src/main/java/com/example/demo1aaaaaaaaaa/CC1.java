package com.example.demo1aaaaaaaaaa;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class CC1 extends Application {

    Circle circle = new Circle(50, Color.GREEN); // Circle with initial radius and color
    ListView<Double> radiusListView;
    public void start(Stage stage) {
        radiusListView = new ListView<>(FXCollections.observableArrayList(0.0,10.0, 20.0, 30.0, 40.0, 50.0, 60.0, 70.0, 80.0, 90.0, 100.0));
        Button changeButton = new Button("Change Radius");

        changeButton.setOnAction(e -> circle.setRadius(radiusListView.getSelectionModel().getSelectedItem()));

        Scene scene = new Scene(new VBox(radiusListView, changeButton, circle), 500, 500);

        stage.setScene(scene);
        stage.setTitle("Circle Radius App");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
