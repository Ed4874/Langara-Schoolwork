/**
 * Student Name: Edward Lu
 * Student Number: 100359822
 * Due Date: Mar 27, 2021
 * Professor: Hengameh Hamavand
 * JDK Version: 8
 * Purpose: This program was created as a small clicking minigame where a circle would move across the screen.
 */

import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.control.Button;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Animation extends Application {
    //Declaring variables and setting some X- and Y- coordinates
    public int points = 0;
    public int misses = 0;
    public long durationValue = 2000;
    Text pointCount = new Text("Hits: " + points + " Misses: " + misses);
    Path path = new Path();
    public PathTransition delay = new PathTransition();
    MoveTo moveTo = new MoveTo(0,  160);
    LineTo line1 = new LineTo(280, 160);
    public Circle target = new Circle(20, Color.WHITE);
    BorderPane window = new BorderPane();
    Pane center = new Pane();
    HBox bottom = new HBox(10);

    //Launching the application
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        //Setting the panes' layouts in a Borderpane
        window.setCenter(center);
        window.setBottom(bottom);

        //Setting the background color
        BackgroundFill backgroundFill1 = new BackgroundFill(Color.BLACK, CornerRadii.EMPTY, Insets.EMPTY);
        center.setBackground(new Background(backgroundFill1));
        BackgroundFill backgroundFill2 = new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY);
        bottom.setBackground(new Background(backgroundFill2));

        //Setting the spacing for the buttons
        bottom.setPadding(new Insets(6, 12, 6, 160));

        //Creating buttons
        ToggleButton pause = new ToggleButton("Pause");
        Button reset = new Button("Reset");

        bottom.getChildren().addAll(pause, reset);

        //Setting the coordinates for the scores
        pointCount.setX(25);
        pointCount.setY(25);
        pointCount.setFont(new Font(10));
        pointCount.setFill(Color.WHITE);
        center.getChildren().add(pointCount);

        path.getElements().addAll(moveTo, line1);

        //Setting up the animation (PathTransition)
        delay.setDuration(Duration.millis(durationValue));
        delay.setNode(target);
        delay.setPath(path);
        delay.setCycleCount(1);

        center.getChildren().add(target);
        target.setCenterX(0);
        target.setCenterY(140);

        Stage stage = new Stage();
        stage.setTitle("Ball Game");
        Scene scene = new Scene(window, 280, 320);
        stage.setScene(scene);
        stage.show();

        delay.play();

        //If the animation ends without the player scoring, the miss counter will increase by one
        delay.setOnFinished(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                pointCount.setText("Hits: " + (points) + " Misses: " + (misses+=1));
                delay.playFromStart();
            }
        });

        //If the player presses pause, the animation will pause. If the player presses the button again,
        //the program will resume.
        pause.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (pause.isSelected()) {
                    delay.pause();
                }
                if (!(pause.isSelected())) {
                    delay.play();
                }
            }
        });

        //This button will reset all scores and the animation.
        reset.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                delay.playFromStart();
                points = 0;
                misses = 0;
            }
        });

        //This will allow the circle to detect when it is clicked and award points
        target.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                delay.stop();
                pointCount.setText("Hits: " + (points+=1) + " Misses: " + misses);
                durationValue = (long)((double) durationValue * 0.90);
                delay.setDuration(Duration.millis(durationValue));
                delay.playFromStart();
            }
        });
    }
}
