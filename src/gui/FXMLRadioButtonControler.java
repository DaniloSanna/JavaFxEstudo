package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class FXMLRadioButtonControler implements Initializable{

	
	  @FXML
	    private RadioButton rbComida;

	    @FXML
	    private ToggleGroup grupo1;

	    @FXML
	    private RadioButton rbBebida;

	    @FXML
	    private RadioButton rbSim;

	    @FXML
	    private ToggleGroup grupo2;

	    @FXML
	    private RadioButton rbNao;

	    @FXML
	    private Button btPegar;

	    @FXML
	    void handleButtonAction(ActionEvent event) {
	    	
	    	RadioButton radio1 = (RadioButton) grupo1.getSelectedToggle();
	    	RadioButton radio2 = (RadioButton) grupo2.getSelectedToggle();
	    	
	    	System.out.println("Seleção 01: " + radio1.getText() + " - " + radio2.getText());
	    	
	    }
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {}

}
