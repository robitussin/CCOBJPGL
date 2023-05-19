package controller;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
public class LoginController {

    @FXML
    TextField mytextfield;

    @FXML
    PasswordField mypasswordfield;

    @FXML
    Button mybutton;

    @FXML
    Label mywarninglabel;

    public void login(ActionEvent event) throws IOException{

        String username = mytextfield.getText();
        String password = mypasswordfield.getText();

        if (username.equals("elizer") && password.equals("123")) {

            Utility.loadWindow(getClass().getResource("/view/Home.fxml"), "Home", null);
            
        } else {
            mywarninglabel.setVisible(true);
        }
    }
}
