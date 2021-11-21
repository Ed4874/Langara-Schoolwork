import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Testing extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        CheckBox check1 = new CheckBox("Check1");
        CheckBox check2 = new CheckBox("Check2");
        CheckBox check3 = new CheckBox("Check3");

        Button color1 = new Button("Color1");
        Button color2 = new Button("Color2");

        Rectangle centerPiece = new Rectangle(200, 100);
        centerPiece.setFill(Color.RED);

        BorderPane root = new BorderPane();
        root.setCenter(centerPiece);

        VBox leftPanel = new VBox(10);
        root.setLeft(leftPanel);
        leftPanel.setPadding(new Insets(10, 10, 10, 10));

        HBox topPanel = new HBox(5);
        root.setTop(topPanel);
        topPanel.setPadding(new Insets(10, 8, 10, 70));


        leftPanel.getChildren().addAll(color1, color2);
        topPanel.getChildren().addAll(check1, check2, check3);


        Scene scene = new Scene(root);
        primaryStage.setTitle("FX Custom Text Message");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
