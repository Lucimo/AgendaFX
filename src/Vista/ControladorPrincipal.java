package Vista;

import Controlador.Controlador;

import Modelo.Persona;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class ControladorPrincipal {
	private Controlador Controlador;

	public void setControlador(Controlador COntrolador) {
		this.Controlador = Controlador;
	}

	@FXML
	private TableView<Persona> tabla;

	@FXML
	private TableColumn<Persona, String> nomcol;

	@FXML
	private TableColumn<Persona, String> apecol;

	@FXML
	private TableColumn<Persona, String> telfcol;

	@FXML
	private Button nuevo;

	@FXML
	private Button editar;

	@FXML
	private Button borrar;

	private final static ObservableList<Persona> data = FXCollections
			.observableArrayList(new Persona("Pedro", "Camacho", "425364"), new Persona("Yony", "Bar", "123425"));

	@FXML
	private void initialize() {
		tabla.setItems(this.data);
		nomcol.setCellValueFactory(new PropertyValueFactory<Persona, String>("nombre"));
		apecol.setCellValueFactory(new PropertyValueFactory<Persona, String>("apellido"));
		telfcol.setCellValueFactory(new PropertyValueFactory<Persona, String>("telefono"));
	}

	@FXML
	public void open(ActionEvent event) {
		Controlador.encender();
	}
	public static void añadir(String campo1, String campo2, String campo3) {
		data.add(new Persona(campo1, campo2, campo3));		

	}

	@FXML
	public void edit(ActionEvent event) {
		Controlador.encender();
	}

	@FXML
	public void erase(ActionEvent event) {
		data.remove(tabla.getSelectionModel().getFocusedIndex());
	}

}
