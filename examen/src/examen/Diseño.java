package examen;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Diseño extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField txtCalle;
	private JTextField txtJhonDue;
	private JTextField textField_3;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Diseño frame = new Diseño();
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
	public Diseño() {
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 555, 555);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(0, 64, 128));
		panel.setBounds(0, 0, 618, 63);
		panel.setBackground(new Color(0, 102, 153));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Factura en Java-NetBeans-ArrayList y POO");
		lblNewLabel.setFont(new Font("Bahnschrift", Font.BOLD, 15));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(10, 0, 458, 42);
		
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("[Sin base de datos]");
		lblNewLabel_1.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 12));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(10, 29, 205, 26);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setForeground(new Color(246, 250, 254));
		panel_1.setBounds(0, 73, 541, 471);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Datos del cliente");
		lblNewLabel_2.setFont(new Font("Bahnschrift", Font.PLAIN, 10));
		lblNewLabel_2.setBounds(21, -3, 108, 43);
		panel_1.add(lblNewLabel_2);
		
		
		JLabel lblNewLabel_3 = new JLabel("Ver listado de facturas");
		lblNewLabel_3.setFont(new Font("Bahnschrift", Font.PLAIN, 10));
		lblNewLabel_3.setBounds(47, 183, 137, 13);
		panel_1.add(lblNewLabel_3);
		
		
		JLabel img1= new JLabel();
		img1.setIcon(new ImageIcon(getClass().getResource("/imagen/lista.png")));
		img1.setLocation(30, 175);
		img1.setSize(26, 30);
		panel_1.add(img1);

		
		
		String[]columnas= {"Producto","Cantidad","Valor","Sub Total"};
		String[][]datos= {{"Agua","2","500","1000.0"},{"Cereal","5","1000","5000.0"},
				{"Leche","2","300","600.0"}};
			
		
		JTable table = new JTable(datos,columnas);
		table.setBackground(Color.white);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(10, 208, 526, 87);
		panel_1.add(scrollPane);
		
		JLabel lblNewLabel_4 = new JLabel("Documento:");
		lblNewLabel_4.setFont(new Font("Bahnschrift", Font.PLAIN, 10));
		lblNewLabel_4.setBounds(28, 50, 101, 13);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Direccion:");
		lblNewLabel_4_1.setFont(new Font("Bahnschrift", Font.PLAIN, 10));
		lblNewLabel_4_1.setBounds(28, 79, 101, 13);
		panel_1.add(lblNewLabel_4_1);
		
		textField = new JTextField();
		textField.setText("12345");
		textField.setBounds(112, 47, 137, 19);
		panel_1.add(textField);
		textField.setColumns(10);
		
		txtCalle = new JTextField();
		txtCalle.setText("Calle 1 #123");
		txtCalle.setColumns(10);
		txtCalle.setBounds(112, 76, 137, 19);
		panel_1.add(txtCalle);
		
		JLabel lblNewLabel_4_2 = new JLabel("Nombres:");
		lblNewLabel_4_2.setFont(new Font("Bahnschrift", Font.PLAIN, 10));
		lblNewLabel_4_2.setBounds(288, 50, 101, 13);
		panel_1.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_4_3 = new JLabel("Teléfono:");
		lblNewLabel_4_3.setFont(new Font("Bahnschrift", Font.PLAIN, 10));
		lblNewLabel_4_3.setBounds(288, 79, 101, 13);
		panel_1.add(lblNewLabel_4_3);
		
		txtJhonDue = new JTextField();
		txtJhonDue.setText("Jhon Doe");
		txtJhonDue.setColumns(10);
		txtJhonDue.setBounds(367, 47, 142, 19);
		panel_1.add(txtJhonDue);
		
		textField_3 = new JTextField();
		textField_3.setText("5554433");
		textField_3.setColumns(10);
		textField_3.setBounds(367, 76, 142, 19);
		panel_1.add(textField_3);
		
		JLabel lblNewLabel_4_4 = new JLabel("Datos de la factura");
		lblNewLabel_4_4.setFont(new Font("Bahnschrift", Font.PLAIN, 10));
		lblNewLabel_4_4.setBounds(28, 115, 142, 13);
		panel_1.add(lblNewLabel_4_4);
		
		JLabel lblNewLabel_5 = new JLabel("N° Factura:");
		lblNewLabel_5.setFont(new Font("Bahnschrift", Font.PLAIN, 10));
		lblNewLabel_5.setBounds(28, 145, 90, 13);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("1");
		lblNewLabel_6.setFont(new Font("Unispace", Font.PLAIN, 10));
		lblNewLabel_6.setBounds(125, 145, 45, 13);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_5_1 = new JLabel("Fecha:");
		lblNewLabel_5_1.setFont(new Font("Bahnschrift", Font.PLAIN, 10));
		lblNewLabel_5_1.setBounds(307, 145, 90, 13);
		panel_1.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_6_1 = new JLabel("2021/50/21");
		lblNewLabel_6_1.setFont(new Font("Unispace", Font.PLAIN, 10));
		lblNewLabel_6_1.setBounds(367, 145, 90, 13);
		panel_1.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_7 = new JLabel("Añadir:");
		lblNewLabel_7.setFont(new Font("Bahnschrift", Font.PLAIN, 10));
		lblNewLabel_7.setBounds(392, 183, 45, 13);
		panel_1.add(lblNewLabel_7);
		
		JLabel img2= new JLabel();
		img2.setIcon(new ImageIcon(getClass().getResource("/imagen/anadir.png")));
		img2.setLocation(370, 175);
		img2.setSize(26, 30);
		panel_1.add(img2);
		
		JLabel lblNewLabel_8 = new JLabel("Eliminar:");
		lblNewLabel_8.setFont(new Font("Bahnschrift", Font.PLAIN, 10));
		lblNewLabel_8.setBounds(471, 183, 65, 13);
		panel_1.add(lblNewLabel_8);
		
		JLabel img3= new JLabel();
		img3.setIcon(new ImageIcon(getClass().getResource("/imagen/quitar.png")));
		img3.setLocation(450, 175);
		img3.setSize(26, 30);
		panel_1.add(img3);
		
		JLabel lblNewLabel_9 = new JLabel("Subtotal:");
		lblNewLabel_9.setFont(new Font("Bahnschrift", Font.PLAIN, 10));
		lblNewLabel_9.setBounds(20, 316, 64, 13);
		panel_1.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("6600.0");
		lblNewLabel_10.setFont(new Font("Unispace", Font.PLAIN, 10));
		lblNewLabel_10.setBounds(112, 316, 57, 13);
		panel_1.add(lblNewLabel_10);
		
		JLabel lblNewLabel_9_1 = new JLabel("% Descuento:");
		lblNewLabel_9_1.setFont(new Font("Bahnschrift", Font.PLAIN, 10));
		lblNewLabel_9_1.setBounds(20, 339, 82, 13);
		panel_1.add(lblNewLabel_9_1);
		
		textField_1 = new JTextField();
		textField_1.setText("5");
		textField_1.setBounds(112, 336, 45, 19);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_9_1_1 = new JLabel("IVA 19%:");
		lblNewLabel_9_1_1.setFont(new Font("Bahnschrift", Font.PLAIN, 10));
		lblNewLabel_9_1_1.setBounds(20, 362, 65, 13);
		panel_1.add(lblNewLabel_9_1_1);
		
		JLabel lblNewLabel_9_1_1_1 = new JLabel("Total Factura:");
		lblNewLabel_9_1_1_1.setFont(new Font("Bahnschrift", Font.PLAIN, 10));
		lblNewLabel_9_1_1_1.setBounds(20, 385, 84, 13);
		panel_1.add(lblNewLabel_9_1_1_1);
		
		JLabel lblNewLabel_10_1 = new JLabel("6600.0");
		lblNewLabel_10_1.setFont(new Font("Unispace", Font.PLAIN, 10));
		lblNewLabel_10_1.setBounds(112, 365, 57, 13);
		panel_1.add(lblNewLabel_10_1);
		
		JLabel lblNewLabel_10_2 = new JLabel("6600.0");
		lblNewLabel_10_2.setFont(new Font("Unispace", Font.PLAIN, 10));
		lblNewLabel_10_2.setBounds(112, 385, 45, 13);
		panel_1.add(lblNewLabel_10_2);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setBackground(new Color(255, 255, 255));
		chckbxNewCheckBox.setBounds(175, 334, 26, 21);
		panel_1.add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_11 = new JLabel("Valor descontado:");
		lblNewLabel_11.setFont(new Font("Bahnschrift", Font.PLAIN, 10));
		lblNewLabel_11.setBounds(226, 339, 118, 13);
		panel_1.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("330.0");
		lblNewLabel_12.setBounds(344, 339, 45, 13);
		panel_1.add(lblNewLabel_12);
		
		JButton btnNewButton = new JButton("Finalizar Factura");
		btnNewButton.setFont(new Font("Bahnschrift", Font.PLAIN, 10));
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setBounds(288, 416, 140, 21);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Limpiar");
		btnNewButton_1.setFont(new Font("Bahnschrift", Font.PLAIN, 10));
		btnNewButton_1.setBackground(new Color(192, 192, 192));
		btnNewButton_1.setBounds(439, 416, 85, 21);
		panel_1.add(btnNewButton_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(242, 242, 242));
		panel_2.setBorder(new EmptyBorder(1, 1, 1, 1));
		panel_2.setBounds(10, -3, 526, 114);
		panel_1.add(panel_2);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBounds(10, 115, 526, 58);
		panel_1.add(panel_2_1);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setBounds(10, 176, 526, 37);
		panel_1.add(panel_2_1_1);
		
		
		
		
	}
}
