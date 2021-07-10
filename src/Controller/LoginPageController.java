package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginPageController implements Initializable {
    public TextField fieldUsername;
    public PasswordField fieldPassword;
    public Button btnLogin;
    public Button btnReset;
    public Button btnExit;
    public Label txtLogin;

    // Check which login is being used, then adjust the login button script and header text
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void clickBtnLogin(ActionEvent actionEvent) {
    }

    public void clickBtnReset(ActionEvent actionEvent) {
    }

    public void clickBtnExit(ActionEvent actionEvent) {
    }
}
