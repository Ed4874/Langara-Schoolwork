import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class RemoveZeros extends Application {

   
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();
        TextField textField = new TextField();
        textField.setLayoutY(100);
        textField.setLayoutX(50);
        root.getChildren().add(textField);

        Button removeZeroes = new Button("Remove Zeroes");
        removeZeroes.setLayoutX(250);
        removeZeroes.setLayoutY(100);
        root.getChildren().add(removeZeroes);

        Text result = new Text();
        result.setLayoutX(400);
        result.setLayoutY(115);
        root.getChildren().add(result);

        Scene scene = new Scene(root, 500, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("FX Remove zeros");
        primaryStage.show();

        removeZeroes.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                String gotText = textField.getText();
                for (int i = 0; i < gotText.length(); i++) {
                    if (Character.isDigit((gotText.charAt(i)))) {
                        break;
                    }
                    else if (i == gotText.length()-1) {
                        gotText = "not an integer";
                    }
                }
                int frontCount = 0;
                int endCount = 0;
                for (int i = 0; i < gotText.length(); i++) {
                    if (gotText.charAt(i) == '0') {
                       frontCount++;
                    }
                    else {
                        break;
                    }
                }
                for (int i = gotText.length()-1; i >= 0; i--) {
                    if (gotText.charAt(i) == '0') {
                        endCount++;
                    }
                    else {
                        break;
                    }
                }
                StringBuffer stringBuffer = new StringBuffer(gotText);

                stringBuffer.replace(0, frontCount, "");
                stringBuffer.replace(gotText.length()-endCount-frontCount, gotText.length()-frontCount, "");
                result.setText(stringBuffer.toString());
                textField.clear();
            }
        });
    }

}
