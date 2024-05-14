package modelo;


import javax.swing.JOptionPane;

import vista.Vista;

public class Modelo {
	
	
	private Vista view;
	private String nombre= "anna";
	private String contraseña= "1q2w3e";
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	public void autenticar(String nombreIngresado,String contraseñaIngresada) {
		
		if(nombre.equals(nombreIngresado)&& contraseña.equals(contraseñaIngresada)){
			JOptionPane.showMessageDialog(null, "Inicio de sesion exitoso");
		}else {
			JOptionPane.showMessageDialog(null, "Error en inicio de sesion ");
		}
		
		
	}
}
