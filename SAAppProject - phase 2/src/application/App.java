package application;


import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class App  extends Application {
		
	    @Override
	    public void start(Stage primaryStage) throws IOException{
	        Parent root = FXMLLoader.load(getClass().getResource("/view/MainPlayerView.fxml"));
	        primaryStage.setTitle("Sports Association App");
	        primaryStage.setScene(new Scene(root, 900, 400));
	        primaryStage.show();
	    }
	  
	    public static void main(String[] args) {
	        launch(args);
	    }
	}



