package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLButtonControler implements Initializable{

	
	@FXML
	private Label LabelOlaMundo;
	
	@FXML
	private Button btTest;

	@FXML
	private TextField txtNome;

	
	@FXML
	private void handleButtonAction(ActionEvent event) {
		LabelOlaMundo.setText("Ol�: " + txtNome.getText());
	}
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {}

}
