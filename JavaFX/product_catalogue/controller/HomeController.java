package controller;

import model.*;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import model.BedroomLamp;
import alert.AlertMaker;

public class HomeController {

    @FXML
    Label name1, name2, name3, price1, price2, price3;

    @FXML
    ImageView img1, img2, img3;

    @FXML
    Button button1, button2, button3, cartbutton;

    @FXML
    private Stage stage;

    @FXML
    private Scene scene;

    @FXML
    private Parent root = null;

    FXMLLoader loader;

    @FXML
    CheckoutController checkoutController = null;

    BedroomLamp blamp = new BedroomLamp();
    CeilingLamp clamp = new CeilingLamp();
    WallLamp wlamp = new WallLamp();

    public void initialize() throws IOException {

        // ============== BEDROOM LAMP ==================//

        blamp.setProductName("Bedroom Lamp");
        name1.setText(blamp.getProductName());

        blamp.setProductPrice(5.00);
        price1.setText(Double.toString(blamp.getProductPrice()));

        blamp.setProductImage("images/lamp1.jpg");
        Image bedroomLamp = new Image(blamp.getProductImage());
        img1.setImage(bedroomLamp);

        // ============== CEILING LAMP ==================//

        clamp.setProductName("Ceiling Lamp");
        name2.setText(clamp.getProductName());

        clamp.setProductPrice(10.00);
        price2.setText(Double.toString(clamp.getProductPrice()));

        clamp.setProductImage("images/lamp2.jpg");
        Image ceilingLamp = new Image(clamp.getProductImage());
        img2.setImage(ceilingLamp);

        // ============== WALL LAMP ==================//
        wlamp.setProductName("Wall Lamp");
        name3.setText(wlamp.getProductName());

        wlamp.setProductPrice(15.00);
        price3.setText(Double.toString(wlamp.getProductPrice()));

        wlamp.setProductImage("images/lamp3.jpg");
        Image wallLamp = new Image(wlamp.getProductImage());
        img3.setImage(wallLamp);

        loader = new FXMLLoader(getClass().getResource("/view/Checkout.fxml"));
        root = loader.load();

        checkoutController = loader.getController();
        checkoutController.myvbox.getChildren().removeAll(checkoutController.myvbox.getChildren());
    }

    public void buy(ActionEvent event) throws IOException {

        Button sourceButton = (Button) event.getSource();
        AlertMaker.showSimpleAlert("hello", "item added");

        if (sourceButton.equals(button1)) {
            blamp.setProductStatus(true);
            checkoutController.addItem(checkoutController.pane1);
        }

        else if (sourceButton == button2) {
            clamp.setProductStatus(true);
            checkoutController.addItem(checkoutController.pane2);
        }

        else if (sourceButton == button3) {
            wlamp.setProductStatus(true);
            checkoutController.addItem(checkoutController.pane3);
        }
    }

    public void gotocart(ActionEvent event) throws IOException {

        checkoutController.initialize(blamp, clamp, wlamp);
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}
