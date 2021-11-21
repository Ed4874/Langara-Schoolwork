/**
 * Student Name: Edward Lu
 * Student Number: 100359822
 * Due Date: March 12, 2021
 * Professor: Hengameh Hamavand
 * JDK: 8
 * Purpose: This program will draw a circle with a radius from the centre to the x-position of the mouse cursor.
 */


import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import static java.lang.Math.abs;


public class MouseDraggedDemo2 extends Application {
    private static Circle line;

    public static void main(String[] args) {launch(args);}
        @Override
        public void start (Stage primaryStage){
            Pane root = new Pane();
            line = new Circle(-10, -10, -10, Color.BLACK);
            root.getChildren().add(line);
            root.setOnMousePressed(new MousePressEventHandler());
            root.setOnMouseDragged(new MouseDragEventHandler());
            Scene scene = new Scene(root, 300, 400);
            primaryStage.setTitle("Lines");
            primaryStage.setScene(scene);
            primaryStage.show();
        }
        private class MousePressEventHandler implements EventHandler<MouseEvent> {
            @Override
            public void handle(MouseEvent e) {
                line.setCenterX(150);
                line.setRadius(abs(e.getX()-150));
                line.setCenterY(200);
            }
        }
        private class MouseDragEventHandler implements EventHandler<MouseEvent> {
            @Override
            public void handle(MouseEvent e) {
                line.setRadius(abs(e.getX()-150));
                line.setCenterY(200);
            }
        }
    }