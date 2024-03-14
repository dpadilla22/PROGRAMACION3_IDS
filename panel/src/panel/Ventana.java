package panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class Ventana extends JFrame {
	
	JTextField nameField;
	JTextArea bio;

	public Ventana() {
		setVisible(true);
		setTitle("Mi primer ventanita");
		setSize(750, 750);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.componentes();
	}

	public void componentes() {
		JPanel login = new JPanel();
		login.setSize(600, 600);
		login.setLocation(0, 0);
		login.setLayout(null);
		login.setBackground(Color.gray);

		JLabel title = new JLabel("Bienvenido a la ventana");
		title.setBackground(Color.white);
		title.setLocation(10, 10);
		title.setSize(180, 40);
		title.setOpaque(true);
		login.add(title);

		JLabel usuario = new JLabel("Usuario", SwingConstants.CENTER);
		usuario.setBackground(Color.white);
		usuario.setLocation(10, 80);
		usuario.setSize(180, 30);
		usuario.setOpaque(true);
		login.add(usuario);

		JTextField usuarioField = new JTextField();
		usuarioField.setBounds(10, 130, 180, 30);
		login.add(usuarioField);

		JLabel contraseña = new JLabel("Contraseña", SwingConstants.CENTER);
		contraseña.setBackground(Color.white);
		contraseña.setLocation(10, 180);
		contraseña.setSize(180, 30);
		contraseña.setOpaque(true);
		login.add(contraseña);

		JPasswordField contraseñaField = new JPasswordField();
		contraseñaField.setBounds(10, 220, 180, 30);
		login.add(contraseñaField);

		JButton acceder = new JButton("Acceder");
		acceder.setBounds(10, 270, 180, 30);
		login.add(acceder);

		acceder.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("hola:D");
				if (usuarioField.getText().length() <= 0) {
					usuarioField.setBorder(new LineBorder(Color.RED, 4));
				} else {
					usuarioField.setBorder(new LineBorder(Color.GREEN, 4));
				}
				if (contraseñaField.getPassword().length <= 0) {
					contraseñaField.setBorder(new LineBorder(Color.RED, 4));
				} else {
					contraseñaField.setBorder(new LineBorder(Color.GREEN, 4));
				}

			}
		});

		JPanel registro = new JPanel();
		registro.setSize(this.getWidth() / 2, this.getHeight());
		registro.setLocation(this.getWidth() / 2, 0);
		registro.setLayout(null);
		registro.setBackground(Color.pink);
		login.add(registro);

		JLabel titulo = new JLabel("Registro", SwingConstants.CENTER);
		titulo.setBackground(Color.black);
		titulo.setLocation(10, 10);
		titulo.setSize(180, 40);
		titulo.setOpaque(true);
		registro.add(titulo);

		JLabel name = new JLabel("Nombre completo: ", SwingConstants.CENTER);
		name.setFont(new Font("signPainter", Font.BOLD, 15));
		name.setLocation(10, 80);
		name.setSize(180, 30);
		registro.add(name);

		nameField = new JTextField();
		nameField.setBounds(10, 130, 250, 30);
		registro.add(nameField);

		JLabel casillas = new JLabel("Marque las casillas por favor");
		casillas.setFont(new Font("signPainter", Font.BOLD, 15));
		casillas.setBounds(10, 170, 350, 40);
		registro.add(casillas);

		JCheckBox eleccion = new JCheckBox("Gatos");
		eleccion.setBounds(10, 220, 300, 35);
		registro.add(eleccion);

		JCheckBox eleccion2 = new JCheckBox("Perros");
		eleccion2.setBounds(10, 260, 300, 35);
		eleccion2.setOpaque(true);
		eleccion2.setBackground(Color.gray);
		registro.add(eleccion2);

		JRadioButton tipo = new JRadioButton("One Piece");
		tipo.setBounds(10, 300, 300, 35);
		registro.add(tipo);

		JRadioButton tipo2 = new JRadioButton("Naruto");
		tipo2.setBounds(10, 345, 300, 35);
		registro.add(tipo2);

		ButtonGroup grupo = new ButtonGroup();
		grupo.add(tipo);
		grupo.add(tipo2);

		ButtonGroup grupo2 = new ButtonGroup();
		grupo2.add(eleccion);
		grupo2.add(eleccion2);

		JLabel bioTag = new JLabel("Descripción");
		bioTag.setFont(new Font("Weird Comic", Font.BOLD, 10));
		bioTag.setBounds(10, 380, 300, 35);
		registro.add(bioTag);

		bio = new JTextArea(10, 10);
		bio.setBounds(10, 410, 300, 35);
		registro.add(bio);
		add(login);
		this.repaint();

		JLabel bioTag1 = new JLabel("En donde vives");
		bioTag1.setFont(new Font("Weird Comic", Font.BOLD, 10));
		bioTag1.setBounds(10, 450, 300, 35);
		registro.add(bioTag1);

		String locacion[] = { "Paraiso de sol", "Camino real", "Calandrio", "Santa fe" };
		JComboBox<String> colonias = new JComboBox<>(locacion);
		colonias.setBounds(10, 490, 300, 35);
		registro.add(colonias);
		
	
		JButton registrar = new JButton("GUARDAR");
		registrar.setBounds(10, 540, 300, 35);
		registro.add(registrar);

		registrar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("holi:D");

				if (nameField.getText().length() <= 0) {
					nameField.setBorder(new LineBorder(Color.RED, 4));
				} else {
					nameField.setBorder(new LineBorder(Color.GREEN, 4));
				}
				if (bio.getText().length() <= 0) {
					bio.setBorder(new LineBorder(Color.RED, 4));
				} else {
					bio.setBorder(new LineBorder(Color.GREEN, 4));
				}
			}
		});
	}
}
