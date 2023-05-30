import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;

public class Controller implements Initializable{

    @FXML
    ChoiceBox<String> mychoicebox;

    private String[] fruits = {"apple", "mango", "cherry"};

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
        // Inserts array elements to choicebox
        mychoicebox.getItems().addAll(fruits);
    }

    
}