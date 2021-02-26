package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

public class FXMLAlertsControler implements Initializable{

	
	  @FXML
	    private Button btAlert1;
	  @FXML
	    private Button btAlert2;
	  @FXML
	    private Button btAlert3;
	  @FXML
	    private Button btAlert4;

	    @FXML
	    void handleButtonActionError(ActionEvent event) {
	    	Alert alert = new Alert(Alert.AlertType.ERROR);
	    	alert.setTitle("Título");
	    	alert.setHeaderText("Cabeçalho");
	    	alert.setContentText("Conteúdo");
	    	alert.show();
	    }
	
	    @FXML
	    void handleButtonActionConfirmation(ActionEvent event) {
	    	Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
	    	alert.setTitle("Título");
	    	alert.setHeaderText("Cabeçalho");
	    	alert.setContentText("Conteúdo");
	    	alert.show();
	    }
	    
	    @FXML
	    void handleButtonActionInformation(ActionEvent event) {
	    	Alert alert = new Alert(Alert.AlertType.INFORMATION);
	    	alert.setTitle("Título");
	    	alert.setHeaderText("Cabeçalho");
	    	alert.setContentText("Conteúdo");
	    	alert.show();
	    }

	    @FXML
	    void handleButtonActionWarning(ActionEvent event) {
	    	Alert alert = new Alert(Alert.AlertType.WARNING);
	    	alert.setTitle("Título");
	    	alert.setHeaderText("Cabeçalho");
	    	alert.setContentText("Conteúdo");
	    	alert.show();
	    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {}

}
