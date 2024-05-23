package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Modelo;
import vista.Vista;

public class Controlador implements ActionListener {
	
	private Vista view;
	private Modelo model;
	
	
	public Controlador(Vista view, Modelo model) {
		this.model= model;
		this.view= view;
		
		
	}

	public void iniciar() {
		view.setTitle("lOGIN");
		view.setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
	       
	}

}
