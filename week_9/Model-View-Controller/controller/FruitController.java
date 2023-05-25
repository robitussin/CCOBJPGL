package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

import model.*;

public class FruitController {

    @FXML
    Button btn1, btn2;

    Mango mango = new Mango();
    Apple apple = new Apple();

    public void initialize() {

        mango.setColor("Yellow");
        mango.setTaste("Very Sweet");

        apple.setColor("Red");
        apple.setTaste("Sweet");
    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(btn1)) {
            alert.setContentText("Apples are " + apple.getColor() + " and " + apple.getTaste());
        }

        if (sourceButton == btn2) {
            alert.setContentText("Mangoes are " + mango.getColor() + " and " + mango.getTaste());
        }

        alert.showAndWait();

    }
}
