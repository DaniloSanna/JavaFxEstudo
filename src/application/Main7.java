/*
 * Closing the Program Properly
 */

package application;

import gui.model.ConfirmBox;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main7 extends Application {
	
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
		
		/* When the user click on Close window the metode below will be called
		 But if user close on X button the window will be close anyway*/
		window.setOnCloseRequest(e-> {
			
			//But this line says that if user click on X, We as software will handle it. (e.consume)
			e.consume();
						
			closeProgram();
		});
		
		
		
		
		Button button = new Button("Click Me");
		button.setOnAction(e-> {
			closeProgram();
		});
		
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		
		Scene scene = new Scene(layout,300,250);
		window.setScene(scene);
		window.show();
		
	}

	private void closeProgram() {
		
		Boolean answer = ConfirmBox.display("Title", "R U SURE TO EXIT?");
		
		if(answer) {
			System.out.println("Saved");
			window.close();		
		}
	}

}
