package Vista;

import Controlador.Controlador;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ControladorEdicion {
	private Controlador Controlador;

	public void setControlador(Controlador COntrolador) {
		this.Controlador = Controlador;
	}

	@FXML
	private Button accept;

	@FXML
	private Button cancel;

	@FXML
	private TextField nom;

	@FXML
	private TextField ape;

	@FXML
	private TextField telf;

	@FXML
	private void initialize() {

	}

	private ControladorPrincipal ControladorPrincipal;

	public void setControladorPrincipal(ControladorPrincipal ControladorPrincipal) {
		this.ControladorPrincipal = ControladorPrincipal;
	}
		@FXML
		public void salir(ActionEvent event) {

		}
		@FXML
		public void enviar(ActionEvent event) {
			String campo1 = nom.getText();
			String campo2 = ape.getText();
			String campo3 = telf.getText();
			if(campo1 != null && campo2 != null && campo3 != null) {
				ControladorPrincipal.añadir(campo1, campo2, campo3);
				Controlador.off();
				
			}
		}
	
	
}
