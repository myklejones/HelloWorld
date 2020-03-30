package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
//import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
//import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

//        GridPane root = new GridPane();
//        root.setAlignment(Pos.CENTER);
//        root.setVgap(10);
//        root.setHgap(10);
//
//        Label greeting = new Label(" Welcome to Java FX");
//        root.getChildren().add(greeting);


        primaryStage.setTitle("Hello JavaFX ");
        primaryStage.setScene(new Scene(root, 700, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
