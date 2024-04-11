package diseño1;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Inicio extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Inicio() {
		setBackground(new Color(251, 221, 244));
		
		setBounds(0, 0, 430, 520);
		setLayout(null);
		
		
		
		JLabel lblNewLabel = new JLabel("Iniciar sesión");
		lblNewLabel.setForeground(new Color(231, 171, 208));
		lblNewLabel.setFont(new Font("Bernard MT Condensed", Font.PLAIN, 35));
		lblNewLabel.setBounds(118, 70, 194, 31);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre de usuario");
		lblNewLabel_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(118, 154, 194, 13);
		add(lblNewLabel_1);
		
		JTextField textField = new JTextField();
		textField.setBounds(118, 188, 185, 31);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Contraseña");
		lblNewLabel_2.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(122, 242, 159, 13);
		add(lblNewLabel_2);
		
		JPasswordField passwordField = new JPasswordField();
		passwordField.setBounds(119, 279, 184, 31);
		add(passwordField);
		
		JButton btnNewButton = new JButton("Ingresar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);
			}
		});
		btnNewButton.setBackground(new Color(243, 148, 232));
		btnNewButton.setFont(new Font("Tw Cen MT", Font.PLAIN, 10));
		btnNewButton.setBounds(142, 348, 126, 31);
		add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 128, 128));
		setBounds(0, 0, 450, 520);
		add(panel);

	}

}
