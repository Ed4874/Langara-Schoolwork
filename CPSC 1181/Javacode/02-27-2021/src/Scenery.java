 /**
 * Student Name: Edward Lu
 * Student Number: 100359822
 * Professor: Hengameh Hamavand
 * Date Due: March 4, 2021
 * Java Version: 8
 * Purpose: This program will create a JavaFX graphic of a scenery with an animal.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
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
        Pane root = new Pane();
        Rectangle ground = new Rectangle(0, 400, 600, 100);
        ground.setFill(Color.DARKGREEN);
        root.getChildren().add(ground);

        Tree t1 = new Tree (100, 420);
        root.getChildren().addAll(t1.getAllNodes());

        Tree t2 = new Tree(200, 440, 100, 100, Color.rgb(100, 100, 80));
        root.getChildren().addAll(t2.getAllNodes());

        Tree t3 = new Tree(250, 440, 100, 250, Color.rgb(120, 120, 10));
        root.getChildren().addAll(t3.getAllNodes());

        Rainbow rainbow1 = new Rainbow(300, 270, 500, 250, 45, 100, Color.RED);
        root.getChildren().addAll(rainbow1.getAllNodes());

        Rainbow rainbow2 = new Rainbow(300, 280, 500, 250, 45, 100, Color.ORANGE);
        root.getChildren().addAll(rainbow2.getAllNodes());

        Rainbow rainbow3 = new Rainbow(300, 290, 500, 250, 45, 100, Color.YELLOW);
        root.getChildren().addAll(rainbow3.getAllNodes());

        Rainbow rainbow4 = new Rainbow(300, 300, 500, 250, 45, 100, Color.GREEN);
        root.getChildren().addAll(rainbow4.getAllNodes());

        Rainbow rainbow5 = new Rainbow(300, 310, 500, 250, 45, 100, Color.BLUE);
        root.getChildren().addAll(rainbow5.getAllNodes());

        Rainbow rainbow6 = new Rainbow(300, 320, 500, 250, 45, 100, Color.INDIGO);
        root.getChildren().addAll(rainbow6.getAllNodes());

        Rainbow rainbow7 = new Rainbow(300, 330, 500, 250, 45, 100, Color.PURPLE);
        root.getChildren().addAll(rainbow7.getAllNodes());

        Beaver animal = new Beaver(350, 400);
        root.getChildren().addAll(animal.getAllNodes());


        Scene scene = new Scene(root, 600, 500);
        primaryStage.setTitle("JavaFX Trees");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
