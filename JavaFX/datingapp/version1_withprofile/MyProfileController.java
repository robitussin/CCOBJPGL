import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.Node;

public class MyProfileController {

    @FXML
    CheckBox myCheckBox;

    @FXML
    ImageView myImageView, petImageView;

    @FXML
    RadioButton r1, r2;

    Image blackHeart = new Image(getClass().getResourceAsStream("images/blackheart.png"));
    Image redHeart = new Image(getClass().getResourceAsStream("images/redheart.png"));
    Image cat = new Image(getClass().getResourceAsStream("images/cat.png"));
    Image dog = new Image(getClass().getResourceAsStream("images/dog.png"));

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void looking() {

        if (myCheckBox.isSelected()) {
            myImageView.setImage(redHeart);
        } else {
            myImageView.setImage(blackHeart);
        }
    }

    public void selectPet() {

        if (r1.isSelected()) {
            petImageView.setImage(cat);
        } else if (r2.isSelected()) {
            petImageView.setImage(dog);
        }
    }

    public void dateNow(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene1.fxml"));
        // Load Scene2Controller
        root = loader.load();
        // Load stage and scene
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
