/*
 * Closing the Program Properly
 */

package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.geometry.Insets;

public class Main10 extends Application {
	
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
		
		//Form
		TextField nameInput = new TextField();
		Button button = new Button ("click me");
		
		
		
		//Action
		button.setOnAction(e -> isInt(nameInput) );
				
		
		//Layout
		VBox layout = new VBox(10);
		layout.setPadding(new Insets(20,20,20,20));
		layout.getChildren().addAll(nameInput, button);
		
		//grid.getChildren().addAll(nameLabel, nameInput, passLabel, passInput, loginButton);
		Scene scene = new Scene(layout, 300,200);
		window.setScene(scene);
		window.show();
		
	}
	private boolean isInt(TextField nameInput) {
		try {
			int age = Integer.parseInt(nameInput.getText());
			System.out.println("User age is: " + age);
			return true;
		}
		catch(NumberFormatException e){
			System.out.println("Error: " + nameInput.getText() + " -> it´s not a Integer");
		}
		return false;
	}
	

}
