/*
 * Communicating Between Windows
 */

package application;

import gui.model.ConfirmBox;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main6 extends Application {
	
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
		
		Button button = new Button("Click Me");
		button.setOnAction(e-> {
			boolean result = ConfirmBox.display("Title", "R U Sure?");
			System.out.println(result);
		});
		
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		
		Scene scene = new Scene(layout,300,250);
		window.setScene(scene);
		window.show();
		
	}

}
