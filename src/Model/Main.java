package Model;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../View/HomePage.fxml"));
        primaryStage.setTitle("Student Management System");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
    public void gotoPage(ActionEvent actionEvent, String pageName){
        try {
            Parent screen_2 = FXMLLoader.load(getClass().getResource("../View/" + pageName + ".fxml"));
            Scene screen_2_scene = new Scene(screen_2);
            Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            window.setScene(screen_2_scene);
            window.show();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
