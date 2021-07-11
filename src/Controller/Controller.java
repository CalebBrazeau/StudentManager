package Controller;

import Model.Main;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    private String pageName;
    public Button btnStudentLogin;
    public Button btnTeacherLogin;
    public Button btnExit;
    public Button btnAdminLogin;
    private Main main = new Main();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("You lookin cute today ; )");
    }

    public void clickBtnStudentLogin(ActionEvent actionEvent) throws IOException {
        main.gotoPage(actionEvent, "StudentLoginPage");
    }

    public void clickBtnTeacherLogin(ActionEvent actionEvent) throws IOException {
        main.gotoPage(actionEvent, "TeacherLoginPage");
    }

    public void clickBtnAdminLogin(ActionEvent actionEvent) throws IOException {
        main.gotoPage(actionEvent, "AdminLoginPage");
    }

    public void clickBtnExit(ActionEvent actionEvent) {
        // Get the current scene window on btnExit
        Stage stage = (Stage) btnExit.getScene().getWindow();
        // Close the scene window
        stage.close();
    }
}
