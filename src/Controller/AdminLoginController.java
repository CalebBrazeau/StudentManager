package Controller;

import Model.Main;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AdminLoginController implements Initializable {
    public Button btnExit;
    public Button btnReset;
    public Button btnLogin;
    public PasswordField fieldPassword;
    public TextField fieldUsername;
    public Label txtLogin;
    private Main main = new Main();
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void clickBtnExit(ActionEvent actionEvent) throws IOException {
        main.gotoPage(actionEvent, "HomePage");
    }

    public void clickBtnReset(ActionEvent actionEvent) {
        fieldPassword.setText("");
        fieldUsername.setText("");
    }

    public void clickBtnLogin(ActionEvent actionEvent) {
        try {
            // Will pull from database later on
            String password = "Password";
            String username = "username";
            if(username.equals(fieldUsername.getText()) && password.equals(fieldPassword.getText())){
                main.gotoPage(actionEvent, "AdminPage");
            } else {
                // Alert box if the login information is incorrect
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText("Incorrect Login Information!");
                alert.setContentText("The login information you entered does not match our records!");
                alert.showAndWait();
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
