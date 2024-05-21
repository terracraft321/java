package com.example.demo1aaaaaaaaaa;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class DrawingCircle extends Application {
    public void start(Stage stage) {
        Circle circle1 = new Circle();
        circle1.setCenterX(250);
        circle1.setCenterY(250);
        circle1.setRadius(100);
        circle1.setFill(Color.RED);
        Circle circle2 = new Circle();
        circle2.setCenterX(250);
        circle2.setCenterY(500);
        circle2.setRadius(100);
        circle2.setFill(Color.YELLOW);
        Circle circle3 = new Circle();
        circle3.setCenterX(250);
        circle3.setCenterY(750);
        circle3.setRadius(100);
        circle3.setFill(Color.GREEN);
        Group root = new Group(circle1, circle2, circle3);
        Scene scene = new Scene(root, 500,500, Color.BEIGE);
        stage.setScene(scene);
        stage.setTitle("Circle");
        stage.show();

    }
    public static void main(String args[]) {
        launch(args);
    }
}