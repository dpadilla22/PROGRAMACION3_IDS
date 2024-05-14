package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.Modelo;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Vista extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtContraseña;
	private Modelo modelo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista frame = new Vista();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Vista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 417, 556);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		 modelo = new Modelo();

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(237, 199, 230));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel nombre = new JLabel("Nombre:\r\n\r\n");
		nombre.setBounds(57, 141, 133, 32);
		panel.add(nombre);
		
		JLabel contraseña = new JLabel("Contraseña:");
		contraseña.setBounds(45, 266, 145, 37);
		panel.add(contraseña);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(116, 142, 168, 32);
		panel.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtContraseña = new JTextField();
		txtContraseña.setBounds(116, 275, 168, 32);
		panel.add(txtContraseña);
		txtContraseña.setColumns(10);
		
		JButton botonIngresar = new JButton("Ingresar");
		botonIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nombreUsuario= txtNombre.getText();
				String contraseñaUsuario= txtContraseña.getText();
				modelo.autenticar(nombreUsuario, contraseñaUsuario);
			}
		});
		botonIngresar.setBounds(158, 359, 85, 21);
		panel.add(botonIngresar);
		
		JLabel iniciarSesion = new JLabel("INICIAR SESION");
		iniciarSesion.setFont(new Font("Tahoma", Font.PLAIN, 23));
		iniciarSesion.setBounds(116, 63, 214, 51);
		panel.add(iniciarSesion);
	}
}
