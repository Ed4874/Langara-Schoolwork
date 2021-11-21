/** Student Name: Edward Lu
 * Student Number: 100359822
 * Professor: Hengameh Hamavand
 * Date Due: March 18, 2021
 * Java Version: 8
 * Purpose: This class will create a beaver graphic using JavaFX,
 * as well as create a method so that a user can rotate said beaver.
 */

import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;

public class Beaver {
    private final Circle head, eye1, eye2, ear1, ear2;
    private final Ellipse nose, body, leg1, leg2, tail;
    private final Rectangle tooth1, tooth2;
    public Group beaver = new Group();

    /**
     * The beaver class will take in an x- and y- value and create a beaver centered around those values
     */
    public Beaver(int locationX, int locationY) {
        body = new Ellipse(locationX+60, locationY+10, 40, 20);
        body.setStrokeWidth(1);
        head = new Circle (locationX+10, locationY, 20);
        head.setStrokeWidth(1);
        eye1 = new Circle(locationX+3, locationY-8, 2);
        eye1.setStrokeWidth(1);
        eye2 = new Circle(locationX+17, locationY-8, 2);
        eye2.setStrokeWidth(1);
        ear1 = new Circle(locationX+2, locationY-16, 6);
        ear1.setStrokeWidth(1);
        ear2 = new Circle(locationX+18, locationY-16, 6);
        ear2.setStrokeWidth(1);
        nose = new Ellipse (locationX+10, locationY+2, 10, 5);
        leg1 = new Ellipse (locationX+40, locationY+30, 4, 10);
        leg1.setStrokeWidth(1);
        leg2 = new Ellipse (locationX+80, locationY+30, 4, 10);
        leg2.setStrokeWidth(1);
        tail = new Ellipse (locationX+120, locationY+10, 30, 10);
        tail.setStrokeWidth(1);
        tooth1 = new Rectangle (locationX+6, locationY+7, 4, 4);
        tooth2 = new Rectangle (locationX+10, locationY+7, 4, 4);

        body.setFill(Color.SADDLEBROWN);
        body.setStroke(Color.BLACK);
        head.setFill(Color.SADDLEBROWN);
        head.setStroke(Color.BLACK);
        nose.setFill(Color.BLACK);
        eye1.setFill(Color.BLACK);
        eye1.setStroke(Color.BLACK);
        eye2.setFill(Color.BLACK);
        eye2.setStroke(Color.BLACK);
        ear1.setFill(Color.SADDLEBROWN);
        ear1.setStroke(Color.SADDLEBROWN);
        ear2.setFill(Color.SADDLEBROWN);
        ear2.setStroke(Color.SADDLEBROWN);
        leg1.setStroke(Color.BLACK);
        leg1.setFill(Color.SADDLEBROWN);
        leg2.setStroke(Color.BLACK);
        leg2.setFill(Color.SADDLEBROWN);
        tail.setStroke(Color.BLACK);
        tail.setFill(Color.web("#261410"));
        tooth1.setFill(Color.WHITE);
        tooth2.setFill(Color.WHITE);
    }

    /**
    * This method will return all nodes of this class, which will allow the main program to add them into a scene
    */
    public Group getAllNodes() {
        beaver.getChildren().addAll(ear1, ear2, leg1, leg2, tail, body, head, eye1, eye2, nose, tooth1, tooth2);
        return beaver;
    }

    /**
     * This method will rotate the beaver using the setRotate function.
     */
    public void setRotate(int degree) {
        beaver.setRotate(degree);
    }
}