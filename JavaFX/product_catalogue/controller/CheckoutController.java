package controller;

import model.*;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class CheckoutController {

    @FXML
    Pane pane1, pane2, pane3;

    @FXML
    VBox myvbox;

    @FXML
    Label name1, name2, name3, price1, price2, price3, total;

    @FXML
    ImageView img1, img2, img3;

    public void initialize(BedroomLamp bl, CeilingLamp cl, WallLamp wl) {
        // ============== BEDROOM LAMP ==================//
        // BedroomLamp blamp = new BedroomLamp();
        name1.setText(bl.getProductName());
        price1.setText(Double.toString(bl.getProductPrice()));
        Image bedroomLamp = new Image(bl.getProductImage());
        img1.setImage(bedroomLamp);

        // ============== CEILING LAMP ==================//
        // CeilingLamp clamp = new CeilingLamp();
        name2.setText(cl.getProductName());
        price2.setText(Double.toString(cl.getProductPrice()));
        Image ceilingLamp = new Image(cl.getProductImage());
        img2.setImage(ceilingLamp);

        // ============== WALL LAMP ==================//
        // WallLamp wlamp = new WallLamp();
        name3.setText(wl.getProductName());
        price3.setText(Double.toString(wl.getProductPrice()));
        Image wallLamp = new Image(wl.getProductImage());
        img3.setImage(wallLamp);

        computeTotal(bl, cl, wl);

    }

    public void addItem(Pane pane) {
        myvbox.getChildren().add(pane);
    }

    public void computeTotal(BedroomLamp bl, CeilingLamp cl, WallLamp wl) {

        double amount = 0;

        if (bl.getProductStatus()) {
            amount += bl.getProductPrice();
        }

        if (cl.getProductStatus()) {
            amount += cl.getProductPrice();
        }

        if (wl.getProductStatus()) {
            amount += wl.getProductPrice();
        }

        total.setText(Double.toString(amount));
    }

}
