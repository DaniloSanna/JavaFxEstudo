package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;

public class FXMLCheckBoxControler implements Initializable{


    @FXML
    private CheckBox cbPhp;

    @FXML
    private CheckBox cbJava;

    @FXML
    private Button pegarValores;
    
    @FXML
    private void handleCheckBoxButtonAction(ActionEvent e) {
    	System.out.println("Valor de PHP: " + cbPhp.selectedProperty().getValue() );
    	System.out.println("Valor de Java: " + cbJava.selectedProperty().getValue() );
    }
    
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	}
}
