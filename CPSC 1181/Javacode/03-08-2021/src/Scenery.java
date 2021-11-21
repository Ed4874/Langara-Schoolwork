 /**
 * Student Name: Edward Lu
 * Student Number: 100359822
 * Professor: Hengameh Hamavand
 * Date Due: March 18, 2021
 * Java Version: 8
 * Purpose: This program will allow buttons to modify objects in the scenery from Assignment 6.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Scenery extends Application {

    /**
    * The main method will launch the graphic window.
    */
    public static void main(String[] args) {
        launch(args);
    }

    /**
     * The start method will define all the different objects that will appear in the graphic,
     * as well as set the scene.
     */
    @Override
    public void start(Stage primaryStage) {
        /**
         * This program will make use of a BorderPane, a VBox, an HBox, and a Pane.
         */

        BorderPane border = new BorderPane();
        VBox leftPanel = new VBox(10);
        HBox bottomPanel = new HBox();
        leftPanel.setPadding(new Insets(20, 10, 10, 10));
        leftPanel.setAlignment(Pos.TOP_CENTER);

        Pane root = new Pane();

        border.setCenter(root);

        border.setLeft(leftPanel);
        leftPanel.setPrefWidth(200);
        leftPanel.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));

        border.setBottom(bottomPanel);

        Rectangle ground = new Rectangle(0, 400, 600, 100);
        ground.setFill(Color.DARKGREEN);
        root.getChildren().add(ground);

        Tree t1 = new Tree (100, 420);
        root.getChildren().addAll(t1.getAllNodes());

        Tree t2 = new Tree(200, 440, 100, 100, Color.rgb(100, 100, 80));
        root.getChildren().addAll(t2.getAllNodes());

        Tree t3 = new Tree(250, 440, 100, 250, Color.rgb(120, 120, 10));
        root.getChildren().addAll(t3.getAllNodes());

        Rainbow rainbow1 = new Rainbow(300, 270, 500, 250, 45, 100, Color.web("#F4F4F4"));
        root.getChildren().addAll(rainbow1.getAllNodes());

        Rainbow rainbow2 = new Rainbow(300, 280, 500, 250, 45, 100, Color.web("#F4F4F4"));
        root.getChildren().addAll(rainbow2.getAllNodes());

        Rainbow rainbow3 = new Rainbow(300, 290, 500, 250, 45, 100, Color.web("#F4F4F4"));
        root.getChildren().addAll(rainbow3.getAllNodes());

        Rainbow rainbow4 = new Rainbow(300, 300, 500, 250, 45, 100, Color.web("#F4F4F4"));
        root.getChildren().addAll(rainbow4.getAllNodes());

        Rainbow rainbow5 = new Rainbow(300, 310, 500, 250, 45, 100, Color.web("#F4F4F4"));
        root.getChildren().addAll(rainbow5.getAllNodes());

        Rainbow rainbow6 = new Rainbow(300, 320, 500, 250, 45, 100, Color.web("#F4F4F4"));
        root.getChildren().addAll(rainbow6.getAllNodes());

        Rainbow rainbow7 = new Rainbow(300, 330, 500, 250, 45, 100, Color.web("#F4F4F4"));
        root.getChildren().addAll(rainbow7.getAllNodes());

        Beaver animal = new Beaver(350, 400);

        CheckBox rainbowButton = new CheckBox("Rainbow");
        rainbowButton.setTextFill(Color.BLACK);

        CheckBox animalButton = new CheckBox("Animal");
        animalButton.setTextFill(Color.BLACK);

        RadioButton right = new RadioButton("90 Degrees");
        right.setTextFill(Color.BLACK);

        RadioButton down = new RadioButton("180 Degrees");
        down.setTextFill(Color.BLACK);

        RadioButton left = new RadioButton("270 Degrees");
        left.setPadding(new Insets(0, 0, 25, 0));
        left.setTextFill(Color.BLACK);

        RadioButton up = new RadioButton("0 Degrees");
        up.setPadding(new Insets(25, 0, 0, 0));
        up.setTextFill(Color.BLACK);

        Text background = new Text(50, 50, "Background");
        background.setFont(new Font(12));
        leftPanel.getChildren().add(background);

        Text message = new Text(400, 490, "");
        message.setFont(new Font(50));
        border.getChildren().add(message);

        TextField messageBox = new TextField();
        Button messageBoxButton = new Button("Change Text");

        leftPanel.getChildren().addAll(rainbowButton, animalButton, up, right, down, left, messageBox, messageBoxButton);

        Button close = new Button("Close");
        close.setAlignment(Pos.CENTER_RIGHT);
        bottomPanel.getChildren().add(close);

        Scene scene = new Scene(border, 800, 500);
        primaryStage.setTitle("JavaFX Trees");
        primaryStage.setScene(scene);
        primaryStage.show();

        /**
         * This section will deal with event handlers and define what actions buttons and checkboxes
         * will perform when they are clicked.
         */

        rainbowButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                if (rainbowButton.isSelected()) {
                    rainbow1.setStroke(Color.RED);
                    rainbow2.setStroke(Color.ORANGE);
                    rainbow3.setStroke(Color.YELLOW);
                    rainbow4.setStroke(Color.GREEN);
                    rainbow5.setStroke(Color.BLUE);
                    rainbow6.setStroke(Color.INDIGO);
                    rainbow7.setStroke(Color.PURPLE);
                }
                if (!rainbowButton.isSelected()) {
                    rainbow1.setStroke(Color.web("#F4F4F4"));
                    rainbow2.setStroke(Color.web("#F4F4F4"));
                    rainbow3.setStroke(Color.web("#F4F4F4"));
                    rainbow4.setStroke(Color.web("#F4F4F4"));
                    rainbow5.setStroke(Color.web("#F4F4F4"));
                    rainbow6.setStroke(Color.web("#F4F4F4"));
                    rainbow7.setStroke(Color.web("#F4F4F4"));
                }
            }
        });

        animalButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                if (animalButton.isSelected()) {
                    root.getChildren().add(animal.getAllNodes());
                }
                else if (!animalButton.isSelected()) {
                    root.getChildren().remove(animal.getAllNodes());
                }
            }
        });

        up.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                right.setSelected(false);
                down.setSelected(false);
                left.setSelected(false);
                animal.setRotate(0);
            }
        });
        right.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                up.setSelected(false);
                down.setSelected(false);
                left.setSelected(false);
                animal.setRotate(90);
            }
        });
        down.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                right.setSelected(false);
                up.setSelected(false);
                left.setSelected(false);
                animal.setRotate(180);
            }
        });
        left.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                right.setSelected(false);
                down.setSelected(false);
                up.setSelected(false);
                animal.setRotate(270);
            }
        });

        messageBoxButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                message.setText(messageBox.getText());
                messageBox.clear();
            }
        });

        close.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                System.exit(0);
            }
        });

    }

}
