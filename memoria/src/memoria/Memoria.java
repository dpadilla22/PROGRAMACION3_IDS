package memoria;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Memoria extends JFrame {

	private JButton btnNewButton_2_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_2_2;
	private JButton btnNewButton_2_3;
	private JButton btnNewButton_2_4;
	private JButton btnNewButton_2_5;
	private JButton btnNewButton_2_6;
	private JButton btnNewButton_2_7;
	private int totalPares = 0;
	private JLabel lblMovimientos;

	int cartas[][] = { { 1, 2, 3, 4 }, { 1, 4, 2, 3 } };
	private int movimientos = 0;
	private JButton[] botonesSeleccionados = new JButton[2];
	private int[] cartaSeleccionada = new int[2];
	private boolean[][] estadoCartas = new boolean[2][4];

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton[][] botones;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Memoria frame = new Memoria();
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

	public Memoria() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 659, 445);
		setTitle("Sanrio x one piece");

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JButton btnNewButton = new JButton("Reiniciar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("reinicio");
				reiniciarJuego();
			}
		});
		botones = new JButton[][] { { btnNewButton_2_1, btnNewButton_2, btnNewButton_2_2, btnNewButton_2_3 },
				{ btnNewButton_2_4, btnNewButton_2_5, btnNewButton_2_6, btnNewButton_2_7 } };

		btnNewButton.setBackground(new Color(255, 178, 231));
		contentPane.add(btnNewButton, BorderLayout.SOUTH);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setBackground(new Color(216, 165, 255));

		lblMovimientos = new JLabel();
		panel.add(lblMovimientos);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(187, 255, 254));
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);

		JButton btnNewButton_2 = new JButton();

		btnNewButton_2.setIcon(new ImageIcon(Memoria.class.getResource("/cartas/atras.jpg")));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Botón 3 presionado");
				btnNewButton_2.setIcon(new ImageIcon(Memoria.class.getResource("/cartas/zorito.jpg")));
				cartaPresionada(2, btnNewButton_2);
			}
		});

		btnNewButton_2.setBounds(152, 0, 139, 161);

		panel_1.add(btnNewButton_2);

		JButton btnNewButton_2_1 = new JButton();
		btnNewButton_2_1.setIcon(new ImageIcon(Memoria.class.getResource("/cartas/atras.jpg")));

		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Botón 3 presionado");
				btnNewButton_2_1.setIcon(new ImageIcon(Memoria.class.getResource("/cartas/laNami.jpg")));
				cartaPresionada(1, btnNewButton_2_1);
			}
		});

		btnNewButton_2_1.setBounds(0, 0, 139, 161);
		panel_1.add(btnNewButton_2_1);

		JButton btnNewButton_2_2 = new JButton();
		btnNewButton_2_2.setIcon(new ImageIcon(Memoria.class.getResource("/cartas/atras.jpg")));
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				System.out.println("Botón 2 presionado");
				btnNewButton_2_2.setIcon(new ImageIcon(Memoria.class.getResource("/cartas/elSanji.jpg")));
				cartaPresionada(3, btnNewButton_2_2);
			}
		});

		btnNewButton_2_2.setBounds(313, 0, 139, 161);
		panel_1.add(btnNewButton_2_2);

		JButton btnNewButton_2_3 = new JButton();
		btnNewButton_2_3.setIcon(new ImageIcon(Memoria.class.getResource("/cartas/atras.jpg")));
		btnNewButton_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				System.out.println("Botón 3 presionado");
				btnNewButton_2_3.setIcon(new ImageIcon(Memoria.class.getResource("/cartas/kittyLuffy1.jpg")));
				cartaPresionada(4, btnNewButton_2_3);
			}

		});

		btnNewButton_2_3.setBounds(478, 0, 139, 161);
		panel_1.add(btnNewButton_2_3);

		JButton btnNewButton_2_4 = new JButton();
		btnNewButton_2_4.setIcon(new ImageIcon(Memoria.class.getResource("/cartas/atras.jpg")));
		btnNewButton_2_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				System.out.println("Botón 4 presionado");
				btnNewButton_2_4.setIcon(new ImageIcon(Memoria.class.getResource("/cartas/laNami.jpg")));
				cartaPresionada(1, btnNewButton_2_4);
			}
		});

		btnNewButton_2_4.setBounds(0, 175, 139, 161);
		panel_1.add(btnNewButton_2_4);

		JButton btnNewButton_2_5 = new JButton();
		btnNewButton_2_5.setIcon(new ImageIcon(Memoria.class.getResource("/cartas/atras.jpg")));
		btnNewButton_2_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				System.out.println("Botón 5 presionado");
				btnNewButton_2_5.setIcon(new ImageIcon(Memoria.class.getResource("/cartas/kittyLuffy1.jpg")));
				cartaPresionada(4, btnNewButton_2_5);
			}

		});

		btnNewButton_2_5.setBounds(152, 175, 139, 161);
		panel_1.add(btnNewButton_2_5);

		JButton btnNewButton_2_6 = new JButton();
		btnNewButton_2_6.setIcon(new ImageIcon(Memoria.class.getResource("/cartas/atras.jpg")));
		btnNewButton_2_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Botón 6 presionado");
				btnNewButton_2_6.setIcon(new ImageIcon(Memoria.class.getResource("/cartas/zorito.jpg")));
				cartaPresionada(2, btnNewButton_2_6);
			}
		});

		btnNewButton_2_6.setBounds(313, 175, 139, 161);
		panel_1.add(btnNewButton_2_6);

		btnNewButton_2_6.setBounds(313, 175, 139, 161);
		panel_1.add(btnNewButton_2_6);

		JButton btnNewButton_2_7 = new JButton();
		btnNewButton_2_7.setIcon(new ImageIcon(Memoria.class.getResource("/cartas/atras.jpg")));
		btnNewButton_2_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				System.out.println("Botón 7 presionado");
				btnNewButton_2_7.setIcon(new ImageIcon(Memoria.class.getResource("/cartas/elSanji.jpg")));
				cartaPresionada(3, btnNewButton_2_7);
			}
		});

		btnNewButton_2_7.setBounds(478, 175, 139, 161);
		panel_1.add(btnNewButton_2_7);
	}

	public void cartaPresionada(int carta, JButton button) {

		actualizarMovimientos();
		int cartaAnterior = cartaSeleccionada[0];
		if (cartaSeleccionada[0] == 0) {
			cartaSeleccionada[0] = carta;
			cartaSeleccionada[1] = cartas[0][carta - 1];
			botonesSeleccionados[0] = button;
			movimientos++;
		} else {
			cartaAnterior = cartaSeleccionada[0];
			cartaSeleccionada[0] = 0;

			if (carta != cartaAnterior || carta == cartaAnterior) {
				movimientos++;
				actualizarMovimientos();
			}
			if (carta == cartaAnterior) {
				JOptionPane.showMessageDialog(this, "¡Encontraste un par!");
				totalPares++;

				botonesSeleccionados[0].setEnabled(false);
				button.setEnabled(false);

				if (totalPares == 4) {
					JOptionPane.showMessageDialog(this, "¡Haz ganado 5 peso!");

				}
			} else {
				JOptionPane.showMessageDialog(this, "No es un par :c ");
				voltearCarta(botonesSeleccionados[0], "/cartas/atras.jpg");
				voltearCarta(button, "/cartas/atras.jpg");

			}
		}
	}

	private void voltearCarta(JButton button, String imagePath) {
		button.setIcon(new ImageIcon(Memoria.class.getResource(imagePath)));

	}

	public void reiniciarJuego() {
		for (int i = 0; i < botones.length; i++) {
			for (int j = 0; j < botones[i].length; j++) {
				botones[i][j].setEnabled(true);
				voltearCarta(botones[i][j], "/cartas/atras.jpg");
			}
		}

		totalPares = 0;
		movimientos = 0;
		actualizarMovimientos();

	}

	private void actualizarMovimientos() {
		lblMovimientos.setText("" + movimientos);
	}
}
