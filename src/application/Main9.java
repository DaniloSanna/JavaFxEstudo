/*
 * Closing the Program Properly
 */

package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main9 extends Application {
	
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

		GridPane grid = new GridPane();
		grid.setPadding(new Insets(10,10,10,10));
		grid.setVgap(8);
		grid.setHgap(10);
		
		
		//name Label
		Label nameLabel = new Label("Username:");
		GridPane.setConstraints(nameLabel, 0,0);

		//name Input
		TextField nameInput = new TextField("name");
		GridPane.setConstraints(nameInput, 1,0);
		
		//password Label
		Label passLabel = new Label("Password:");
		GridPane.setConstraints(passLabel, 0,1);

		//password Input
		TextField passInput = new TextField("");
		passInput.setPromptText("password");
		GridPane.setConstraints(passInput, 1,1);
		
		Button loginButton = new Button("Loggin");
		GridPane.setConstraints(loginButton, 1,2);
		
		grid.getChildren().addAll(nameLabel, nameInput, passLabel, passInput, loginButton);
		Scene scene = new Scene(grid, 300,200);
		window.setScene(scene);
		window.show();
		
	}
	

}
