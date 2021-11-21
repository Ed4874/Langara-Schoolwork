import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;
import javafx.scene.input.MouseEvent;
import static java.lang.Math.abs;

public class edwardLTriangleQuestion extends Application {
    private static Polygon triangle;
    public int pressCount = 0;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        BorderPane border = new BorderPane();
        Pane root = new Pane();
        border.setCenter(root);

        triangle = new Polygon();
        root.getChildren().add(triangle);
        root.setOnMousePressed(new MousePressEventHandler());

        Scene scene = new Scene(border, 500, 500);
        primaryStage.setTitle("FX Custom Text Message");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    private class MousePressEventHandler implements EventHandler<MouseEvent> {
        @Override
        public void handle(MouseEvent e) {
            if (pressCount == 3) {
                pressCount = 0;
                triangle.getPoints().clear();
            }
            triangle.getPoints().addAll(e.getX(), e.getY());
            pressCount++;
        }
    }
}
