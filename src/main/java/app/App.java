package app;

import com.sun.prism.paint.Color;

import javafx.application.Application;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) {
    
    
        Label lbl01 = new Label("ola ");
    
        StackPane root = new StackPane();
        
        Scene scene01 = new Scene(root, 300, 300);
    
        stage.setScene(scene01);


        root.getChildren().add(lbl01);
    
        stage.show();
        stage.requestFocus();

    }

    public static void main(String[] args) {
        launch(args);
    }

}