package diseño1;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registro extends JPanel {

	private static final long serialVersionUID = 1L;


	/**
	 * Create the panel.
	 */
	public Registro() {
setLayout(null);
		
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(251, 221, 244));
		panel.setBounds(0, 0, 450, 520);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registrarse");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Bernard MT Condensed", Font.PLAIN, 35));
		lblNewLabel.setBounds(115, 0, 176, 56);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ingresa tu nombre");
		lblNewLabel_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(97, 51, 161, 33);
		panel.add(lblNewLabel_1);
		
		 JTextField textField = new JTextField();
		textField.setBounds(97, 79, 212, 33);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Ingresa tu apellido");
		lblNewLabel_2.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(97, 122, 161, 13);
		panel.add(lblNewLabel_2);
		
		 JTextField textField_1 = new JTextField();
		textField_1.setBounds(97, 145, 212, 33);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Correo electronico");
		lblNewLabel_3.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(97, 188, 176, 13);
		panel.add(lblNewLabel_3);
		
		 JTextField textField_2 = new JTextField();
		textField_2.setBounds(97, 211, 212, 33);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Contraseña");
		lblNewLabel_4.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(97, 254, 93, 13);
		panel.add(lblNewLabel_4);
		
		 JTextField textField_3 = new JTextField();
		textField_3.setBounds(97, 277, 212, 33);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Confirmar contraseña");
		lblNewLabel_5.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(97, 320, 169, 26);
		panel.add(lblNewLabel_5);
		
		 JTextField textField_4 = new JTextField();
		textField_4.setBounds(97, 356, 212, 33);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Acepto los terminos y condiciones,vendo mi alma al diablo");
		chckbxNewCheckBox.setBackground(new Color(251, 221, 244));
		chckbxNewCheckBox.setBounds(52, 385, 360, 21);
		chckbxNewCheckBox.setOpaque(false);
		panel.add(chckbxNewCheckBox);
		
		JButton btnNewButton = new JButton("Registrarse");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String contraseña= textField_3.getText();
				 String confirmarContraseña = textField_4.getText();
				 if (contraseña.equals(confirmarContraseña)) {
			            
			            JOptionPane.showMessageDialog(null, "Registro exitoso", "Success", JOptionPane.INFORMATION_MESSAGE);
			        } else {
			          
			            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden", "Error", JOptionPane.ERROR_MESSAGE);
			        }
			    }
			
			
		});
		btnNewButton.setBackground(new Color(236, 172, 244));
		btnNewButton.setBounds(141, 412, 117, 26);
		btnNewButton.setOpaque(true);
		panel.add(btnNewButton);
	}

}
