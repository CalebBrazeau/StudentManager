package Controller;

import Model.Main;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class StudentLoginPageController implements Initializable {
    public TextField fieldUsername;
    public PasswordField fieldPassword;
    public Button btnLogin;
    public Button btnReset;
    public Button btnExit;
    public Label txtLogin;
    private Main main = new Main();

    // Check which login is being used, then adjust the login button script and header text
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void clickBtnLogin(ActionEvent actionEvent) {
        try {
            String password = "Password";
            String username = "username";
            if(username.equals(fieldUsername.getText()) && password.equals(fieldPassword.getText())){
                main.gotoPage(actionEvent, "StudentPage");
            } else {
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

    public void clickBtnReset(ActionEvent actionEvent) {
        fieldPassword.setText("");
        fieldUsername.setText("");
    }

    public void clickBtnExit(ActionEvent actionEvent) throws IOException {
        main.gotoPage(actionEvent, "HomePage");
    }
}
