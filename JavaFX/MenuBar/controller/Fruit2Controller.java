package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;
import model.*;

public class Fruit2Controller {

    @FXML
    ImageView img1;

    @FXML
    Button btn1;

    Apple apple = new Apple();

    public void initialize() {

        apple.setColor("Red");
        apple.setTaste("Sweet");
    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(btn1)) {
            alert.setContentText("Apples are " + apple.getColor() + " and " + apple.getTaste());
        }

        alert.showAndWait();

    }
}
