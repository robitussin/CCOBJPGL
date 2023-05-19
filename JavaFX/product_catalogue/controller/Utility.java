package controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import java.net.URL;


public class Utility {

    public static final String ICON_IMAGE_LOC = "/images/icon.png";

    // Add icon
    public static void setStageIcon(Stage stage) {
        stage.getIcons().add(new Image(ICON_IMAGE_LOC));
    }

    // Load new scenes/windows
    public static Object loadWindow(URL loc, String title, Stage parentStage) {
        Object controller = null;

        // Parent root = FXMLLoader.load(getClass().getResource("view/Login.fxml"));
        // Scene scene = new Scene(root);
        // stage.setScene(scene);
        // stage.show();

        try {
            FXMLLoader loader = new FXMLLoader(loc);
            Parent parent = loader.load();
            controller = loader.getController();
            Stage stage = null;
            if (parentStage != null) {
                stage = parentStage;
            } else {
                stage = new Stage(StageStyle.DECORATED);
            }
            stage.setTitle(title);

            // Adds an icon for each window opened
            setStageIcon(stage);
            stage.setScene(new Scene(parent));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return controller;
    }


}