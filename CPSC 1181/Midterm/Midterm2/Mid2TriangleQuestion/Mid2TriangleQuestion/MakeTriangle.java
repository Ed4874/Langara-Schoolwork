import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MakeTriangle extends Application {
    private Pane root;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        root = new Pane();

        Scene scene = new Scene(root, 300, 400);
        primaryStage.setTitle("Click for Triangle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
