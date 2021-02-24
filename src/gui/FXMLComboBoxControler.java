package gui;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import model.Categoria;

public class FXMLComboBoxControler implements Initializable{

	@FXML
	private ComboBox<Categoria> cbCategoria;
	private List<Categoria> categorias = new ArrayList<>();
	
	//Necessário Transformar a List em Observable List
	private ObservableList<Categoria> obsCategorias;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		carregarCategorias();
	}
	
	public void carregarCategorias() {
		categorias.add(new Categoria(1, "Bebidas"));
		categorias.add(new Categoria(2, "Comidas"));
		categorias.add(new Categoria(3, "Acessórios"));
		
		obsCategorias = FXCollections.observableArrayList(categorias);
		
		cbCategoria.setItems(obsCategorias);
	}

}
