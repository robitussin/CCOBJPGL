import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class App extends Application {


    public static void main(String[] args) {
        
        launch(args);
    }

    public void start(Stage stage) throws Exception{

        //Stage stage = new Stage();
        Group root = new Group();
        Scene scene = new Scene(root, Color.WHITE);

        stage.setTitle("Stage demo program");
        stage.setWidth(420);
        stage.setHeight(420);
        stage.setResizable(false);
        stage.setFullScreen(true);

        Text text = new Text();
        text.setText("Hello World");
        text.setX(50);
        text.setY(50);
        text.setFont(Font.font("Verdana", 50));
        text.setFill(Color.LIMEGREEN);

        root.getChildren().add(text);
        stage.setScene(scene);
        stage.show();
    }
}
