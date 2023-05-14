import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Node;

public class LoginController {

    @FXML
    TextField nameTextField;
    @FXML
    PasswordField passwordField;
    @FXML
    Button loginButton;
    @FXML
    Label warning;

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void login(ActionEvent event) throws IOException {

        // Get text from text field
        String username = nameTextField.getText();
        String password = passwordField.getText();

        if (username.equals("elizer") && password.equals("abc123")) {
            // Load Scene2.fxml when login button is clicked
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene1.fxml"));
            // Load Scene2Controller
            root = loader.load();
            // Load stage and scene
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } else {
            warning.setVisible(true);
        }

    }

}