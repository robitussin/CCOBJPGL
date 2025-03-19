import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Node;

public class SceneController {
    
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToscene1(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("Scene1.fxml")); 
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToscene2(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("Scene2.fxml")); 
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();        
    }
    
}
