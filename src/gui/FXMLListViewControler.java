package gui;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import model.Categoria;

public class FXMLListViewControler implements Initializable{

	@FXML
	private ListView<Categoria> lvCategorias;
	private List<Categoria> categorias = new ArrayList<>();
	private ObservableList<Categoria> obsCategorias;
	
	
	private void carregarCategorias() {
		categorias.add(new Categoria(1, "Comidas"));
		categorias.add(new Categoria(2, "Bebidas"));
		categorias.add(new Categoria(3, "Acessórios"));
		
		obsCategorias = FXCollections.observableArrayList(categorias);
		
		lvCategorias.setItems(obsCategorias);
		
	}
	
	
	
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		carregarCategorias();
	}

}
