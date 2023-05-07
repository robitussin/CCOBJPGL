import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/* ImageView is a node used for painting images loaded with Images*/

public class Controller {

    @FXML
    ImageView myImageView;
    Button myButton;

    Image myImage = new Image(getClass().getResourceAsStream("lark.png"));

    public void displayImage() {
        myImageView.setImage(myImage);
    }
}
