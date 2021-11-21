/** Student Name: Edward Lu
 * Student Number: 100359822
 * Professor: Hengameh Hamavand
 * Date Due: March 18, 2021
 * Java Version: 8
 * Purpose: This class will create a tree graphic using JavaFX.
 */

import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;

public class Tree {
    private Rectangle trunk;
    private Ellipse leaves;
    private Rectangle box;

    /**
     * The tree class will take in x- and y- values and create a tree centered around those values
     */
    public Tree(int x, int y){

        trunk = new Rectangle(x-10, y -100, 20, 100);
        trunk.setFill(Color.SADDLEBROWN);
        box = new Rectangle(x, y, 5, 5);

        leaves = new Ellipse(x, y-100, 40, 60);
        leaves.setFill(Color.rgb(30, 120, 80));
    }
    public Tree(int x, int y, int moveX, int moveY, Color color){

        trunk = new Rectangle(x-10, (y-moveY/2), 20, (moveY/2));
        trunk.setFill(Color.SADDLEBROWN);
        box = new Rectangle(x, y, 5, 5);

        leaves = new Ellipse(x, (y-moveY*0.75), moveX/2, moveY/2);
        leaves.setFill(color);
    }

    /**
     * This method will return all nodes of this class, which will allow the main program to add them into a scene
     */
    public Node[] getAllNodes(){
        return new Node[] {trunk, leaves, box};
    }
}
