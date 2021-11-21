/** Student Name: Edward Lu
 * Student Number: 100359822
 * Professor: Hengameh Hamavand
 * Date Due: March 18, 2021
 * Java Version: 8
 * Purpose: This class will create a rainbow graphic using JavaFX.
 */

import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;

public class Rainbow {
    private Arc color;

    /**
     * The rainbow class will take in an specified values and create an arc using those values
     */
    public Rainbow(int centerX, int centerY, int radiusX, int radiusY, int startAngle, int length, Color rainbowColor) {
        color = new Arc(centerX, centerY, radiusX, radiusY, startAngle, length);
        color.setStrokeWidth(10);
        color.setStroke(rainbowColor);
        color.setFill(null);
        color.setType(ArcType.OPEN);
    }

    /**
    * This method will return all nodes of this class, which will allow the main program to add them into a scene
    */
    public Node[] getAllNodes(){
        return new Node[] {color};
    }

    public void setStroke(Color web) {
        color.setStroke(web);
    }
}
