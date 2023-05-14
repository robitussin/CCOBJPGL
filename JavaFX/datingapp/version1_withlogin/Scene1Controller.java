import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.Node;

public class Scene1Controller {

    @FXML
    ImageView myImageView;
    Button myButton;
    Button no;
    private Stage stage;
    private Scene scene;
    private Parent root = null;
    Scene2Controller scene2Controller = null;
    FXMLLoader loader;

    Image lark = new Image(getClass().getResourceAsStream("images/lark.png"));
    Image arjay = new Image(getClass().getResourceAsStream("images/Arjay.png"));
    Image kaide = new Image(getClass().getResourceAsStream("images/Kaide.png"));
    Image lhara = new Image(getClass().getResourceAsStream("images/Lhara.png"));
    Image jherick = new Image(getClass().getResourceAsStream("images/jherick.png"));
    Image joan = new Image(getClass().getResourceAsStream("images/joan.png"));
    Image kiether = new Image(getClass().getResourceAsStream("images/kiether.png"));
    Image[] imageArray = { lark, arjay, kaide, lhara, jherick, joan, kiether };
    int counter = imageArray.length;

    public void interested(ActionEvent event) throws IOException {

        if (scene2Controller == null) {
            loader = new FXMLLoader(getClass().getResource("Scene2.fxml"));
            root = loader.load();
            scene2Controller = loader.getController();
            scene2Controller.selectImage(scene2Controller.ackzel);
        }

        if (counter > 0) {
            myImageView.setImage(imageArray[counter - 1]);
        }

        if (counter == 6) {
            scene2Controller.selectImage(scene2Controller.kiether);
        } else if (counter == 5) {
            scene2Controller.selectImage(scene2Controller.joan);
        } else if (counter == 4) {
            scene2Controller.selectImage(scene2Controller.jherick);
        } else if (counter == 3) {
            scene2Controller.selectImage(scene2Controller.lhara);
        } else if (counter == 2) {
            scene2Controller.selectImage(scene2Controller.kaide);
        } else if (counter == 1) {
            scene2Controller.selectImage(scene2Controller.arjay);
        } else if (counter == 0) {
            scene2Controller.selectImage(scene2Controller.lark);
        }

        if (counter <= 0) {
            try {
                switchToscene2(event);
            } catch (Exception e) {
            }

        }

        counter--;
    }

    public void pass(ActionEvent event) throws IOException {

        if (scene2Controller == null) {
            loader = new FXMLLoader(getClass().getResource("Scene2.fxml"));
            root = loader.load();
            scene2Controller = loader.getController();
        }

        if (counter > 0) {
            myImageView.setImage(imageArray[counter - 1]);
        }

        if (counter <= 0) {
            try {
                switchToscene2(event);
            } catch (Exception e) {
            }
        }

        counter--;
    }

    public void switchToscene2(ActionEvent event) throws IOException {
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
