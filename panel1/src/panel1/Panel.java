package panel1;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

public class Panel extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Panel frame = new Panel();
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
	public Panel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 454, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);

		Registro();
		Inicio();

	}

	public void Registro() {

		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(251, 221, 244));
		panel.setBounds(0, 0, 450, 520);
		getContentPane().add(panel);
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

		JCheckBox chckbxNewCheckBox = new JCheckBox("Acepto los terminos y condiciones,vendo mi alma al diablo :0");
		chckbxNewCheckBox.setBackground(new Color(251, 221, 244));
		chckbxNewCheckBox.setBounds(52, 385, 392, 21);
		chckbxNewCheckBox.setOpaque(false);
		panel.add(chckbxNewCheckBox);

		JButton btnNewButton = new JButton("Registrarse");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String contraseña= textField_3.getText();
				 String confirmarContraseña = textField_4.getText();
				 if (contraseña.equals(confirmarContraseña)) {
			            
			            JOptionPane.showMessageDialog(null, "Registro exitoso", "Success", JOptionPane.INFORMATION_MESSAGE);
			            getContentPane().removeAll();
						repaint();
						revalidate();
						Inicio();
			        } else {
			          
			            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden", "Error", JOptionPane.ERROR_MESSAGE);
			        }
				
			}
		});

		btnNewButton.setBackground(new Color(236, 172, 244));
		btnNewButton.setBounds(141, 412, 117, 26);
		btnNewButton.setOpaque(true);
		panel.add(btnNewButton);

		contentPane.add(panel, "registro");
	}

	public void Inicio() {
		setBackground(new Color(251, 221, 244));

		setBounds(0, 0, 430, 520);
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Iniciar sesión");
		lblNewLabel.setForeground(new Color(231, 171, 208));
		lblNewLabel.setFont(new Font("Bernard MT Condensed", Font.PLAIN, 35));
		lblNewLabel.setBounds(118, 70, 194, 31);
		getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Nombre de usuario");
		lblNewLabel_1.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(118, 154, 194, 13);
		getContentPane().add(lblNewLabel_1);

		JTextField textField = new JTextField();
		textField.setBounds(118, 188, 185, 31);
		getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Contraseña");
		lblNewLabel_2.setFont(new Font("Tw Cen MT", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(122, 242, 159, 13);
		getContentPane().add(lblNewLabel_2);

		JPasswordField passwordField = new JPasswordField();
		passwordField.setBounds(119, 279, 184, 31);
		getContentPane().add(passwordField);

		JButton btnNewButton = new JButton("Ingresar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "error","error",JOptionPane.ERROR_MESSAGE);
				
				getContentPane().removeAll();
				repaint();
				revalidate();
				Registro();
			}
		});
		btnNewButton.setBackground(new Color(243, 148, 232));
		btnNewButton.setFont(new Font("Tw Cen MT", Font.PLAIN, 10));
		btnNewButton.setBounds(142, 348, 126, 31);
		getContentPane().add(btnNewButton);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 128, 128));
		setBounds(0, 0, 450, 520);
		getContentPane().add(panel);

		contentPane.add(panel, "inicio");
	}

}
