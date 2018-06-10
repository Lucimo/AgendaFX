package Modelo;

import Controlador.Controlador;
import Vista.ControladorEdicion;
import Vista.ControladorPrincipal;

public class Modelo {
	private ControladorEdicion ControladorEdicion;
	private ControladorPrincipal ControladorPrincipal;

	public void setVista(ControladorEdicion ControladorEdicion, ControladorPrincipal ControladorPrincipal) {
		this.ControladorEdicion = ControladorEdicion;
		this.ControladorPrincipal = ControladorPrincipal;

	}

}
