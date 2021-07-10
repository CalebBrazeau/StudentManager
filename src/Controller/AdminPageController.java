package Controller;

import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.ResourceBundle;

public class AdminPageController implements Initializable {
    public TableView tableTeachers;
    public TableColumn tColumnID;
    public TableColumn tColumnMInitial;
    public TableColumn tColumnFName;
    public TableColumn tColumnLName;
    public TableView tableStudents;
    public TableColumn sColumnID;
    public TableColumn sColumnFName;
    public TableColumn sColumnMInitial;
    public TableColumn sColumnLName;
    public TableColumn sColumnMajor;
    public Label txtAdmin;
    public MenuButton menuNavigation;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        
    }
}
