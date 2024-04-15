package menu;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Cuenta extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public Cuenta() {
		setLayout(null);
		


		JPanel panel = new JPanel();
		panel.setBackground(new Color(251, 221, 244));
		panel.setBounds(0, 0, 450, 520);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Recuperacion de la cuenta");
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.PLAIN, 25));
		lblNewLabel.setBounds(91, 121, 330, 29);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Introduce tu correo electronico para buscar tu cuenta");
		lblNewLabel_1.setBounds(94, 160, 306, 13);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(91, 183, 279, 41);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.setBounds(285, 234, 85, 21);
		panel.add(btnNewButton);

		
	}
	
	
}
