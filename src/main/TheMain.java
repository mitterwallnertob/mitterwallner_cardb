package main;

/**
 * @author Tobias Mitterwallner
 * @version 1
 * @date 14.01.2020
 * @class TheMain
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class TheMain extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/viewcontroller/layout.fxml"));
        primaryStage.setTitle("Car Database");
        primaryStage.getIcons().add(new Image("res/icon.png"));
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
