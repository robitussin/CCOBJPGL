import javafx.fxml.FXML;
import javafx.scene.image.ImageView;

public class Scene2Controller {

    @FXML
    ImageView ackzel;
    @FXML
    ImageView arjay;
    @FXML
    ImageView kaide;
    @FXML
    ImageView lark;
    @FXML
    ImageView lhara;

    public void selectImage(ImageView image) {
        image.setOpacity(1.0);
    }
}
