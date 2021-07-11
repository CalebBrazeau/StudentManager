package Controller;

import Model.Main;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class TeacherLoginController implements Initializable {
    public Label txtLogin;
    public TextField fieldUsername;
    public PasswordField fieldPassword;
    public Button btnLogin;
    public Button btnReset;
    public Button btnExit;
    private Main main = new Main();
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void clickBtnExit(ActionEvent actionEvent) throws IOException {
        main.gotoPage(actionEvent, "HomePage");
    }

    public void clickBtnReset(ActionEvent actionEvent) {
    }

    public void clickBtnLogin(ActionEvent actionEvent) {
        try {
            // Will pull from database later on
            String password = "Password";
            String username = "username";
            if(username.equals(fieldUsername.getText()) && password.equals(fieldPassword.getText())){
                main.gotoPage(actionEvent, "TeacherPage");
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
