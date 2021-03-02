package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main3 extends Application {
	
	Button button;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage PrimaryStage) {
		PrimaryStage.setTitle("Title of Window/Stage");
		button = new Button();
		button.setText("Click me");

		button.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("Anonimous inner class");
				
			}
		});
		
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		
		Scene scene = new Scene(layout, 300, 250);
		
		PrimaryStage.setScene(scene);
		PrimaryStage.show();
		
	}

}
