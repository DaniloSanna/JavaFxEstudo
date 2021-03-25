package gui.model;

import javafx.stage.*;
	import javafx.scene.*;
	import javafx.scene.layout.*;
	import javafx.scene.control.*;
	import javafx.geometry.*;


	public class ConfirmBox {
		
		static boolean answer;
		
		public static boolean display(String title, String message) {
			Stage window = new Stage();
			
			//Block all other windows until this be finish
			window.initModality(Modality.APPLICATION_MODAL);
			window.setTitle(title);
			window.setMinWidth(250);
			
			Label label = new Label();
			label.setText(message);
			
			
			Button yesButton = new Button("Yes");
			Button noButton = new Button("No");
			
			yesButton.setOnAction(e-> {
				answer = true;
				window.close();
			});
			
			noButton.setOnAction(e-> {
				answer = false;
				window.close();
			});
			

			VBox layout = new VBox(10);
			layout.setAlignment(Pos.CENTER);
			layout.getChildren().addAll(label, yesButton, noButton);
			Scene scene = new Scene(layout);
			window.setScene(scene);
			window.showAndWait();
			
			return answer;
		}
		
	}
