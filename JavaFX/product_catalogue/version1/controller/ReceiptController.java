package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class ReceiptController implements Initializable {

    @FXML
    double item1Amount, item2Amount, item3Amount;

    @FXML
    Label qty1, qty2, qty3, product1, product2, product3, price1, price2, price3, amount1, amount2, amount3, total;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        if (HomeController.blamp.getProductStatus()) {
            product1.setText(HomeController.blamp.getProductName());
            qty1.setText(Double.toString(HomeController.blamp.getProductQuantity()));
            price1.setText(Double.toString(HomeController.blamp.getProductPrice()));
            amount1.setText(Double
                    .toString(HomeController.blamp.getProductPrice() * HomeController.blamp.getProductQuantity()));

            product1.setVisible(true);
            qty1.setVisible(true);
            price1.setVisible(true);
            amount1.setVisible(true);

            item1Amount = HomeController.blamp.getProductPrice() * HomeController.blamp.getProductQuantity();

        }

        if (HomeController.wlamp.getProductStatus()) {
            product2.setText(HomeController.wlamp.getProductName());
            qty2.setText(Double.toString(HomeController.wlamp.getProductQuantity()));
            price2.setText(Double.toString(HomeController.wlamp.getProductPrice()));
            amount2.setText(Double
                    .toString(HomeController.wlamp.getProductPrice() * HomeController.wlamp.getProductQuantity()));

            product2.setVisible(true);
            qty2.setVisible(true);
            price2.setVisible(true);
            amount2.setVisible(true);

            item2Amount = HomeController.wlamp.getProductPrice() * HomeController.wlamp.getProductQuantity();
        }

        if (HomeController.clamp.getProductStatus()) {
            product3.setText(HomeController.clamp.getProductName());
            qty3.setText(Double.toString(HomeController.clamp.getProductQuantity()));
            price3.setText(Double.toString(HomeController.clamp.getProductPrice()));
            amount3.setText(Double
                    .toString(HomeController.clamp.getProductPrice() * HomeController.clamp.getProductQuantity()));

            product3.setVisible(true);
            qty3.setVisible(true);
            price3.setVisible(true);
            amount3.setVisible(true);

            item3Amount = HomeController.clamp.getProductPrice() * HomeController.clamp.getProductQuantity();

        }

        double final_amount = item1Amount + item2Amount + item3Amount;
        total.setText(Double.toString(final_amount));

    }
}