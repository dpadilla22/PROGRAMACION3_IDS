package login;

import controlador.Controlador;
import modelo.Modelo;
import vista.Vista;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Modelo mod= new Modelo();
		Vista view= new Vista();
		Controlador ctrl = new Controlador(view,mod);
		
		ctrl.iniciar();
		view.setVisible(true);
		
			
	}

}
