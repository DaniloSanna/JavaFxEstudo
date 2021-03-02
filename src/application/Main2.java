package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main2 extends Application implements EventHandler<ActionEvent>{
	
	Button button, button2;
	int eventamount = 0;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage PrimaryStage) {
		PrimaryStage.setTitle("Title of Window/Stage");
		button = new Button();
		button.setText("Click me");
		
		button2 = new Button();
		button2.setText("Don´t click me");
		
		button.setOnAction(this);
		
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		layout.getChildren().add(button2);
		
		Scene scene = new Scene(layout, 300, 250);
		
		PrimaryStage.setScene(scene);
		PrimaryStage.show();
		
	}

	@Override
	public void handle(ActionEvent event) {
		//This event handle all ActionEvent for all buttons
	
		
		//So, to know what to do if we have more than 1 button, we get the 
		//source and compare with name.
		if(event.getSource() == button) {
			if(CheckEventInteger() == 0) {System.out.println("Hi, button cliked");}
			if(CheckEventInteger() == 1) {System.out.println("cliked again");}
			if(CheckEventInteger() > 1) {System.out.println("and again...");}
			IncreaseEventInteger();
		}
		if(event.getSource() == button2) {
			System.out.println("Toldya!");
		}
		
		}
	
		public void IncreaseEventInteger() {
			eventamount+=1;
	}
		public int CheckEventInteger() {
			return eventamount;
	}

}
