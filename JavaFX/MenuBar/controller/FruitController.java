package controller;


import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.MenuBar;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;
import model.*;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FruitController {

    @FXML
    ImageView img1, img2;

    @FXML
    Button btn1, btn2;

    Mango mango = new Mango();
    Apple apple = new Apple();

    @FXML
    MenuBar mymenubar;

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


    public void switchScene(ActionEvent e) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/view/Fruit2.fxml"));
        Parent ReportManager = loader.load();
        Scene ReportManagerScene = new Scene(ReportManager);
        
        Stage window = (Stage) mymenubar.getScene().getWindow();
        
        window.setScene(ReportManagerScene);
        
        window.show();
        }
}
