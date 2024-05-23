package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import controlador.Controlador;
import modelo.Modelo;
import vista.Vista;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Modelo mod= new Modelo();
		Vista view= new Vista();
		Controlador ctrl = new Controlador(view,mod);
		Connection conexion;
		
		  
		
		ctrl.iniciar();
		view.setVisible(true);
		
		  try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            conexion = DriverManager.getConnection(
	                "jdbc:mysql://sql7.freedb_programacion3.com:3306/freedb_padilla_22", "freedb_padilla_22", "bsxZb#64K5q$2FV"
	            );
	            
	            Statement stmt = conexion.createStatement();
	            ResultSet rs = stmt.executeQuery("SELECT * FROM nombre");

	            while (rs.next()) {
	                System.out.println(rs.getInt(1) + " " + rs.getInt(2) + " " + rs.getString(3) + " " + rs.getString(4));
	            }

	            conexion.close();
	        } catch (ClassNotFoundException | SQLException e) {
	            e.printStackTrace();
	        }
	    }
	
	 
	}
	

