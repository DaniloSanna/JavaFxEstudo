package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main4 extends Application {
	
	//Just Rename for studies mean.
	Stage window;
	
	Scene scene1, scene2;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage PrimaryStage) {
		window = PrimaryStage;
		
		Label label1 = new Label("Welcome to Firt Scene");
		Button button1 = new Button("Go to Second Scene");
		
		Label label2 = new Label("Welcome to Second Scene");
		Button button2 = new Button("Go to Firt Scene");
		
		button1.setOnAction(e -> window.setScene(scene2));
		button2.setOnAction(e -> window.setScene(scene1));
		
		
		//Layout 1 - Children are laid out in vertical Column
		VBox layout1 = new VBox(20);
		layout1.getChildren().addAll(label1, button1);
		scene1 = new Scene(layout1, 400, 300);
		
		//Layout 1 - Children are laid out in vertical Column
		HBox layout2 = new HBox();
		layout2.getChildren().addAll(label2, button2);
		scene2 = new Scene(layout2, 600, 300);
				
		window.setScene(scene1);
		window.setTitle("Title Here");
		window.show();
		
	}

}
