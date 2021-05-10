/*
 * Closing the Program Properly
 */

package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main8 extends Application {
	
	//Just Rename for studies mean.
	Stage window;
	
	Scene scene1, scene2;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage PrimaryStage) {
		
		window = PrimaryStage;
		window.setTitle("The New Boston");
		
		HBox topMenu = new HBox();
		Button buttonA = new Button("File");
		Button buttonB = new Button("Edit");
		Button buttonC = new Button("View");
		topMenu.getChildren().addAll(buttonA, buttonB, buttonC);

		VBox leftMenu = new VBox();
		Button buttonD = new Button("D");
		Button buttonE = new Button("E");
		Button buttonF = new Button("F");
		leftMenu.getChildren().addAll(buttonD, buttonE, buttonF);
		
		BorderPane boderPane = new BorderPane();
		boderPane.setTop(topMenu);
		boderPane.setLeft(leftMenu);
					
		Scene scene = new Scene(boderPane,300,250);
		window.setScene(scene);
		window.show();
		
	}
	

}
