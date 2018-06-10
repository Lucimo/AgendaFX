package Controlador;

import Vista.ControladorEdicion;
import Vista.ControladorPrincipal;
import Controlador.Controlador;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

import Modelo.Modelo;

public class Controlador extends Application {
	private Stage primaryStage;
	private Stage primaryStage2;
	private AnchorPane rootLayout;
	private AnchorPane rootLayout2;
	
	public static void main(String[] args) {
	
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {

		
		try {
			this.primaryStage = primaryStage;
			this.primaryStage.setTitle("Principal");

			 // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Controlador.class.getResource("/Vista/vistaprincipal.fxml"));
            rootLayout = (AnchorPane) loader.load();

            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            
            primaryStage.show();
            

           } catch(Exception e) {
			e.printStackTrace();
		}
	}
	private static Stage ventana = new Stage();
	public static void encender() {
		 try {
			FXMLLoader loader = new FXMLLoader(Controlador.class.getResource("/Vista/vistaedicion.fxml"));
		    AnchorPane ventanaDos = (AnchorPane) loader.load();
		    
		    ventana.setTitle("Edicion");
		    Scene scene = new Scene(ventanaDos);
	        ventana.setScene(scene);
	        ventana.show();
       
		 }catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private ControladorEdicion ControladorEdicion;
	private ControladorPrincipal ControladorPrincipal;

	public void setVista(ControladorEdicion ControladorEdicion, ControladorPrincipal ControladorPrincipal) {
		this.ControladorEdicion = ControladorEdicion;
		this.ControladorPrincipal = ControladorPrincipal;

	}

	private Modelo modelo;

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;

	}
	public static void off() {
		ventana.hide();
	}

	

}
